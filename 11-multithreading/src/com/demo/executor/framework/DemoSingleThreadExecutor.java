package com.demo.executor.framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoSingleThreadExecutor {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Runnable runTaskOne = () -> System.out.println("Running Task One... " + Thread.currentThread().getName());
		Runnable runTaskTwo = () -> System.out.println("Running Task Two... " + Thread.currentThread().getName());

		executor.execute(runTaskOne);
//		singleThreadExecutor.shutdown(); // returns RejectedExecutionException
		executor.execute(runTaskTwo);
	}

}

/*
 * When shutdown() method is called on ExecutorService it 
 * stops accepting new tasks and waits for previously 
 * submitted tasks to execute. After that it terminates 
 * the executor.  
 * Above, the code will throw  RejectedExecutionException
 * because execute() cannot be called once the executor 
 * is shutdown.
 */
