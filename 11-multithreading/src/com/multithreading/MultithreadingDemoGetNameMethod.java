package com.multithreading;

public class MultithreadingDemoGetNameMethod {

	public static void main(String[] args) {
		
		Runnable run = () -> {
			var thread1 = Thread.currentThread();
			System.out.println("Current Thread Name: " + thread1.getName());
		};
		var thread2 = new Thread(run);
//		thread2.setName("Child"); // Uncomment to see how the Current Thread Name changes
		thread2.start();

	}

}
