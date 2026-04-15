package com.demo.thread;

public class MultithreadingDemoPriority {

	public static void main(String[] args) {
		
		Runnable run1 = () -> System.out.println("Thread 1 Created");
		var thread1 = new Thread(run1);
		
		Runnable run2 = () -> System.out.println("Thread 2 Created");
		var thread2 = new Thread(run2);
		
		thread1.setPriority(Thread.MIN_PRIORITY); // minimum priority is 1
		thread2.setPriority(9); // priority is from 1 to 10
		
		thread1.start();
		System.out.println("Thread 1 Priority is: " + thread1.getPriority());
		
		thread2.start();
		System.out.println("Thread 2 Priority is: " + thread2.getPriority());

	}

}
