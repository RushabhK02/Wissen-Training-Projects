package concurrency;

import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncCounter counter=new SyncCounter();
		PrintNum printOdd=new PrintNum(1);
		PrintNum printEven=new PrintNum(2);
		Runnable taskOdd=new Runnable() {
			
			@Override
			public void run() {
				synchronized(counter) {
				counter.counter+=1;
				printOdd.printOdd();
				while(counter.counter<10) {
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			while(counter.counter%2==1&&counter.counter<=10);
			}
		};
		
		Runnable taskEven=new Runnable() {
			
			@Override
			public void run() {
				synchronized(counter) {
					counter.counter+=1;
					printEven.printEven();
					while(counter.counter<10) {
						try {
							TimeUnit.SECONDS.sleep(3);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				while(counter.counter%2==0&&counter.counter<=10);
			
			}
		};
		
		Thread t1=new Thread(taskOdd);
		Thread t2=new Thread(taskEven);
		
		t1.start();
		t2.start();
		
		
		
	}

}
