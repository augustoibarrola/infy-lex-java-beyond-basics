package com.demo.lock;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoReentrantLock {
	
	private int balance = 1000;
	
	Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		var object = new DemoReentrantLock();
		
		executor.submit(() -> object.deposit(1000));
		executor.submit(() -> object.deposit(1000));

	}
	
	public void deposit(int amount) {
		lock.lock();
		System.out.println("Initial Time: " + LocalTime.now());
		getBalance();
		try {
			Thread.sleep(10000);
		} catch(Exception e) {
			Thread.currentThread().interrupt();
		}
		balance = balance + amount;
		getBalance();
		System.out.println("Final Time: " + LocalTime.now());
		lock.unlock();
	}

	public void getBalance() {
		lock.lock();
		try {
			Thread.sleep(4000);
		} catch(Exception e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("Balance by [" + Thread.currentThread().getId() + "] " + Thread.currentThread().getName() + ": " + balance);
		
		lock.unlock();
	}
}
