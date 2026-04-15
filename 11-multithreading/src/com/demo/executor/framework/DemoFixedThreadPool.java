package com.demo.executor.framework;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoFixedThreadPool {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable task1 = () -> System.out.println("Running Task 1: " + Thread.currentThread().getName());
		Runnable task2 = () -> System.out.println("Running Task 2: " + Thread.currentThread().getName());
		Runnable task3 = () -> System.out.println("Running Task 3: " + Thread.currentThread().getName());
		
		executor.execute(task1);
		executor.execute(task2);
		executor.execute(task3);
		
		executor.shutdown();

	}

}
