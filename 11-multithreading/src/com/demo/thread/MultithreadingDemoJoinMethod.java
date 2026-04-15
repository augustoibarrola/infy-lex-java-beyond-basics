package com.demo.thread;

public class MultithreadingDemoJoinMethod {

	public static void main(String[] args) {
		
		Runnable run1 = () -> {
			var thread = Thread.currentThread();
			System.out.println(thread.getName() + " Started");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println(thread.getName() + " Ended");
		};
		
		var thread1 = new Thread(run1);
		
		Runnable run2 = () -> {
			var thread = Thread.currentThread();
			System.out.println(thread.getName() + " Started");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println(thread.getName() + " Ended");
		};
		
		var thread2 = new Thread(run2);
		
		thread1.start();

//		Uncomment the below and run again to see the difference
//		try {
//			thread1.join();
//		}catch(InterruptedException e) {
//			Thread.currentThread().interrupt();
//		}
		
		thread2.start();

	}

}
