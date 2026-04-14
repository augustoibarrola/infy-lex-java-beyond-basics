package com.multithreading;

public class MultithreadingDemoSleepMethod {

	public static void main(String[] args) {
		
		new Thread(() -> {
			System.out.println("Going to sleep");
			try {
				Thread.sleep(10000);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("After Sleep");
		}).start();

	}

}
