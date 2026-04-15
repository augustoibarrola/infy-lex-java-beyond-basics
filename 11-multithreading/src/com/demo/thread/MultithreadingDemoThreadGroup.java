package com.demo.thread;

public class MultithreadingDemoThreadGroup {

	public static void main(String[] args) {
		
		ThreadGroup threadGroup = new ThreadGroup("ThreadGroup");
		
		Runnable runnable = () -> System.out.println("Thread Created is: " + Thread.currentThread().getName());
		
		var thread1 = new Thread(threadGroup, runnable, "one");
		var thread2 = new Thread(threadGroup, runnable, "two");
		var thread3 = new Thread(threadGroup, runnable, "three");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("Thread Group Name: " + threadGroup.getName());
		threadGroup.list();

	}

}
