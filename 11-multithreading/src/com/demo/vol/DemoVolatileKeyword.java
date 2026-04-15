package com.demo.vol;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoVolatileKeyword {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		executor.execute(counter);
		executor.execute(counter);
		executor.execute(counter);
		executor.execute(counter);

	}
	
}

