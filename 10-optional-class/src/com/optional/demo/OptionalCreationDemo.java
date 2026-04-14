package com.optional.demo;

import java.util.Optional;

public class OptionalCreationDemo {

	public static void main(String[] args) {
		
		String nullString = null;
		String string1 = "Java";
		
		//Empty
		Optional<String> optionalObject1 = Optional.empty();
		System.out.println(optionalObject1);
		
		//Of
		Optional<String> optionalObject2 = Optional.of(string1);
		System.out.println(optionalObject2);
		
//		Uncomment the below line and see the output (NullPointerException)
//		Optional<String> optionalObject3 = Optional.of(nullString);
//		System.out.println(optionalObject3);
		
		//OfNullable
		Optional<String> optionalObject4 = Optional.ofNullable(nullString);
		System.out.println(optionalObject4);
		Optional<String> optionalObject5 = Optional.ofNullable(string1);
		System.out.println(optionalObject5.get());
		Optional<String> optionalObject6 = Optional.ofNullable(nullString);
//		Uncomment the below line and see the output
//		System.out.println(optionalObject6.get());
		
		//isPresent
		if(optionalObject6.isPresent()) {
			System.out.println(optionalObject6.get());
		}
//		orElse
		System.out.println(optionalObject6.orElse("Default value"));
	}

}
