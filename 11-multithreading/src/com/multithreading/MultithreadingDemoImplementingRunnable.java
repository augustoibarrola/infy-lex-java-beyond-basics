package com.multithreading;

public class MultithreadingDemoImplementingRunnable {

	public static void main(String[] args) {

		Runnable runObject = () -> System.out.println("Thread created by implementing the Runnable Interface.");
		
		Thread thread = new Thread(runObject);
		thread.start();

	}

}
