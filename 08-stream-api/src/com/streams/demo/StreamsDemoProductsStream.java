package com.streams.demo;

import java.util.List;

public class StreamsDemoProductsStream {

	public static void main(String[] args) {

		List<Product> productList = Product.getProductList();
		System.out.println("The Original List of Products:");
		productList.forEach(System.out::println);
		
		System.out.println("The list after filtering and sorting:");
		
		//Filter, sort, and print
		productList.stream()
			.filter(p -> p.getPrice()<1000)
			.sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
			.forEach(System.out::println);

	}
}
