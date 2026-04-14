package com.multithreading;

public class MultithreadingDemoExtendingThread extends Thread {
	
	public static void main(String[] args) {
		
		MultithreadingDemoExtendingThread demo = new MultithreadingDemoExtendingThread();
		demo.start();

	}

	public void run() {
		System.out.println("Thread created by extending the Thread Class.");
	}
	
}
