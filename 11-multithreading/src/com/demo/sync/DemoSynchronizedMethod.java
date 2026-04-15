package com.demo.sync;

public class DemoSynchronizedMethod {
	
	private int balance = 2000;
	
	public synchronized void deposit(int amount) {
		System.out.println("Initial Balance: " + balance);
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			Thread.currentThread().interrupt();
		}
		
		balance = balance + amount;
		System.out.println("Final Balance: " + balance);
	}

	public static void main(String[] args) {
		
		var object = new DemoSynchronizedMethod();
		
		Runnable run1 = () -> object.deposit(1000);
		Runnable run2 = () -> object.deposit(1000);
		
		var thread1 = new Thread(run1);
		var thread2 = new Thread(run2);
		
		thread1.start();
		thread2.start();

	}

}
