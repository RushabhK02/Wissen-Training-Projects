package wait_notify_ex;

import java.util.concurrent.TimeUnit;

public class chef_ex {
	private static Object lock = new Object();
	private static final int SIZE = 10;
	private static String[] menu = new String[SIZE];
	private static int count=0;
	
	public static boolean isFull() {
		return menu.length ==count;
	}
	
	public static boolean isEmpty() {
		return count-1==-1;
	}

	
	static class Chef {
		String name;
		int DishCount=0;
		Chef(String name) {
			this.name = name;
		}
		
		void produce() {
			synchronized(lock) {
				if(isFull()) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				DishCount++;
				menu[count] = name+" "+DishCount;
				count++;	
				System.out.println(menu[count-1]+" dish created");
				lock.notify();
			}
		}
	}

	static class Consumer {
		String name;
		Consumer(String name) {
			this.name = name;
		}
		
		void eat() {
			synchronized(lock) {
				if(isEmpty()) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(!isEmpty()) {
				count--;
				System.out.println(name+" consumed "+menu[count]);
				lock.notify();
				}
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Chef vegChef = new Chef("Veg");
		Chef nonVegChef = new Chef("Non-Veg");
		
		Consumer c1 = new Consumer("Consumer 1");
		Consumer c2 = new Consumer("Consumer 2");
		
		Runnable cookTaskVeg = ()->{
			for (int i = 0; i < 10; i++) {
				vegChef.produce();
				System.out.println(count);
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Done veg cooking");
		};
		
		Runnable cookTaskNonVeg = ()->{
			for (int i = 0; i < 10; i++) {
				nonVegChef.produce();
				System.out.println(count);
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Done non-veg cooking");
		};
		
		Runnable eatTask1 = ()->{
			for (int i = 0; i < 25; i++) {
				c1.eat();
				System.out.println(count);
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("C1: Done eating!");
		};
		
		Runnable eatTask2 = ()->{
			for (int i = 0; i < 25; i++) {
				c2.eat();
				System.out.println(count);
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("C2: Done eating!");
		};
		
		Thread chefThread1 = new Thread(cookTaskVeg);
		Thread chefThread2 = new Thread(cookTaskNonVeg);
		Thread consumerThread1 = new Thread(eatTask1);
		Thread consumerThread2 = new Thread(eatTask2);

		chefThread1.start();
		chefThread2.start();
		consumerThread1.start();
		consumerThread2.start();

		chefThread1.join();
		chefThread2.join();
		consumerThread1.join();
		consumerThread2.join();

	}


	
}
