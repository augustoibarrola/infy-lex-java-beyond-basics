package com.demo.executor.framework;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DemoScheduledExecutor {

	public static void main(String[] args) {

		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		
		System.out.println("Start Time: " + LocalTime.now());
		
		Runnable task1 = () -> System.out.println("Running Task One: " + LocalTime.now());
		Runnable task2 = () -> System.out.println("Running Task Two: " + LocalTime.now());
		Runnable task3 = () -> System.out.println("Running Task Three: " + LocalTime.now());
		
		executor.schedule(task1, 10, TimeUnit.SECONDS);
		executor.schedule(task2, 20, TimeUnit.SECONDS);
		executor.schedule(task3, 30, TimeUnit.SECONDS);
		
		executor.shutdown();

	}

}
