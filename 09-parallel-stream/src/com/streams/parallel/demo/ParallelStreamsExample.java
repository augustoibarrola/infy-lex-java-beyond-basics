package com.streams.parallel.demo;

import java.util.stream.IntStream;

public class ParallelStreamsExample {

	public static void main(String[] args) {
		
		System.out.println("******* THREADS *******");
		
		System.out.println("Normal...");
		
		IntStream range1 = IntStream.rangeClosed(1, 10);
		range1.forEach(x -> {
			System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
		});
		
		System.out.println("\nParallel...");
		
		IntStream range2 = IntStream.rangeClosed(1, 10);
		range2.parallel()
			.forEach(x -> {
				System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
			});

	}

}
