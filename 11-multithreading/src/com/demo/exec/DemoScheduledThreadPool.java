package com.demo.exec;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DemoScheduledThreadPool {

	public static void main(String[] args) {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		
		Runnable task1 = () -> System.out.println("Running Task 1: " + Thread.currentThread().getName() + " : " + LocalTime.now());
		Runnable task2 = () -> System.out.println("Running Task 2: " + Thread.currentThread().getName() + " : " +  LocalTime.now());
		Runnable task3 = () -> System.out.println("Running Task 3: " + Thread.currentThread().getName() + " : " +  LocalTime.now());
		
		System.out.println("Start Time: " + LocalTime.now());
		
		executor.schedule(task1, 10, TimeUnit.SECONDS);
		executor.schedule(task2, 20, TimeUnit.SECONDS);
		executor.schedule(task3, 30, TimeUnit.SECONDS);
		
		executor.shutdown();

	}

}
