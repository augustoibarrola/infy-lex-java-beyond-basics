package com.streams.demo;

import java.util.stream.IntStream;

public class StreamsDemoLazyLoading {

	public static void main(String[] args) {
		
		IntStream stream = IntStream.range(1, 5);
		stream = stream.peek(System.out::println)
				.filter(i -> {
					System.out.println("Starting Filter");
					return i%2==0;
				});
		System.out.println("Invoking terminal method count.");
		System.out.println("The count is: " + stream.count());
		
	}
}
