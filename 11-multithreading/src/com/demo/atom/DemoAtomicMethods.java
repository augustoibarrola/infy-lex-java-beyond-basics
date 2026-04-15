package com.demo.atom;

import java.util.concurrent.atomic.AtomicLong;

public class DemoAtomicMethods {

	public static void main(String[] args) {
		
		AtomicLong count = new AtomicLong(10);
		
		System.out.println("The initial value:     " + count);

//		Return type of getAndIncrement the data type of atomic variable
		System.out.println("getAndIncrement:       " + count.getAndIncrement());
		System.out.println("After getAndIncrement: " + count.get());

//		Return type of getAndSet the data type of atomic variable
		System.out.println("getAndSet:             " + count.getAndSet(20));
		System.out.println("After getAndSet:       " + count.get());
		
		count.set(30);
		System.out.println("After set:             " + count);

	}

}
