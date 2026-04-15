package com.demo.thread;

public class MultithreadingDemoImplementingRunnable {

	public static void main(String[] args) {

		Runnable runObject = () -> System.out.println("Thread created by implementing the Runnable Interface.");
		Thread thread = new Thread(runObject);
		thread.start();
		
		// Alternate statement
		new Thread(() -> System.out.println("In Thread Lambda way 2")).start();

	}

}
