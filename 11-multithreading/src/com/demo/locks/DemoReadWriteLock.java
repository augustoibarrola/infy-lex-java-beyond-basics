package com.demo.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DemoReadWriteLock {
	
	private int balance = 1000;
	
	ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		var object = new DemoReadWriteLock();
		
		executor.submit(() -> object.deposit(1000));
		executor.submit(object::getBalance);
		executor.submit(object::getBalance);

	}
	
	public void deposit(int amount) {
		lock.writeLock();
		try {
			Long duration = (long) (Math.random() * 10000);
			System.out.println("In deposit()             [" + Thread.currentThread().getId() + "] " + Thread.currentThread().getName() + " Time Taken: " + duration/1000);
			Thread.sleep(duration);
		} catch(Exception e) {
			Thread.currentThread().interrupt();
		} finally {
			balance = balance + amount;
			System.out.println("Balance after deposit by [" + Thread.currentThread().getId() + "] " + Thread.currentThread().getName() + " : " + balance);
			lock.writeLock().unlock();
		}
	}
	
	public void getBalance() {
		if(lock.isWriteLocked()) {
			System.out.println("Write Lock is Present");
			lock.readLock().lock();
			try {
				Long duration = (long) (Math.random() * 10000);
				System.out.println("In getBalance()      [" + Thread.currentThread().getId() + "] " + Thread.currentThread().getName() + " Time Taken: " + duration/1000);
				Thread.sleep(duration);
			} catch(Exception e) {
				Thread.currentThread().interrupt();
			} finally {
				System.out.println("Reading Balance By   [" + Thread.currentThread().getId() + "] " + Thread.currentThread().getName() + " : " + balance);
				lock.readLock().unlock();
			}
		}
	}

}
