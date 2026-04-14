package com.streams.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemoCreatingStreams {

	public static void main(String[] args) {
		
		// From Values
		Stream<String> fromValues = Stream.of("mouse", "charger", "keyboard");
		
		// From Collections
		List<String> list = List.of("mouse", "charger", "keyboard");
		Stream<String> fromCollections = list.stream();
		
		// From Arrays
		String[] array = {"mouse", "charger", "keyboard"};
		Stream<String> fromArrays = Arrays.stream(array);

	}
}
