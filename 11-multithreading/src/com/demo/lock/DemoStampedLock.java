package com.demo.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.StampedLock;

public class DemoStampedLock {

	private int counter = 0;

	public static void main(String[] args) {
		DemoStampedLock object = new DemoStampedLock();
		StampedLock stampedLock = new StampedLock();
		Runnable writeTask = () -> {
			long stamp = stampedLock.writeLock();
			object.increment();
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch(Exception e) {
				Thread.currentThread().interrupt();
			}
			stampedLock.unlockWrite(stamp);
		};
		
		Runnable readTask = () -> {
			long stamp = stampedLock.readLock();
			try {
				System.out.println("The Counter Value: " + object.getCounter());
			} finally {
				stampedLock.unlockRead(stamp);
			}
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		executor.submit(writeTask);
		executor.submit(writeTask);
		executor.submit(readTask);
		executor.submit(writeTask);
		
		executor.shutdown();

	}
	
	public void increment() {
		counter++;
		System.out.println("Inside increment method: " + counter);
	}
	
	public int getCounter() {
		return this.counter;
	}

}
