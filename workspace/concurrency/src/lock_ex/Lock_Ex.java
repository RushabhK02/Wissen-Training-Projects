package lock_ex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ExecutorService;



public class Lock_Ex {
	static ReentrantLock lock = new ReentrantLock();
	static Condition write = lock.newCondition();
	static Condition read = lock.newCondition();
	static boolean isWrite=false;
	
	//private static void changeVal() {
	//	isWrite=!isWrite;		
	//}

	private static boolean isWrite() {
		return isWrite;
	}
	
	public static void main(String[] args) {
		class Reader{
			public void read() throws InterruptedException {
				try {
					lock.lock();
					while(isWrite) {
						write.await();
					}
					System.out.println(Thread.currentThread().getName() + "- reading");
					isWrite=true;
			//		changeVal();
					read.signal();
				}finally {
					lock.unlock();
				}
			}

			
		}
		
		
		class Writer{
			public void write() throws InterruptedException {
				try {
					lock.lock();
					while(!isWrite) {
						read.await();
					}
					System.out.println(Thread.currentThread().getName() + "- write");
			//		changeVal();
					write.signal();
				}finally {
					lock.unlock();
				}
			}

			private boolean isRead() {
				return !isWrite;
			}

			private boolean isWrite() {
				return isWrite;
			}
		}
		
		Reader reader = new Reader();
		Writer writer = new Writer();
		Runnable readTask = ()->{
			try {
				reader.read();
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		};
		Runnable writeTask = ()->{
			try {
				writer.write();
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		for(int i=0;i<5;i++) {
			executorService.execute(readTask);
		}
		for(int i=0;i<5;i++) {
			executorService.execute(writeTask);
		}
		
		executorService.shutdown();
	}
	

}
