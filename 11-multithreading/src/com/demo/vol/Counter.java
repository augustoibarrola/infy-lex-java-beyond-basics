package com.demo.vol;

import java.time.LocalTime;

public class Counter implements Runnable {

	volatile int count = 10;
//  Replace volatile with static and observe the output
//	static int count = 10; 
	
	@Override
	public void run() {
		System.out.println("Initial value of count by: " + Thread.currentThread().getName() + " at " + LocalTime.now() + ":" + count);
		count = 30;
		System.out.println("Final value of count by:   " + Thread.currentThread().getName() + " at " + LocalTime.now() + ":" + count);
	}
	
	
}
