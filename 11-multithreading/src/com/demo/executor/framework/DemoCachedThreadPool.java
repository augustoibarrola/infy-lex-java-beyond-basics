package com.demo.executor.framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoCachedThreadPool {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newCachedThreadPool();
		
		Runnable task1 = () -> System.out.println("Running Task 1: " + Thread.currentThread().getName());
		Runnable task2 = () -> System.out.println("Running Task 2: " + Thread.currentThread().getName());
		Runnable task3 = () -> System.out.println("Running Task 3: " + Thread.currentThread().getName());
		
		executor.execute(task1);
		executor.execute(task2);
//		Uncomment the below and run to see how the threads are reused
//		try {
//			Thread.sleep(7000);
//		}catch(InterruptedException e) {
//			Thread.currentThread().interrupt();
//		}
		executor.execute(task3);
		
		executor.shutdown();

	}

}
