package lambdaexpressions.four;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import lambdaexpressions.three.Product;

public class ProductUtility {
	
	/*
	 * Function Interface
	 */

	public static void main(String[] args) {
		
		Product frock = new Product(1001, "Frock", 5.0, 100);
		Product watch = new Product(1002, "Watch", 4.9, 600);
		Product shirt = new Product(1003, "Shirt", 4.0, 500);
		Product violin = new Product(1004, "Violin", 3.5, 800);
		
		List<Product> list = Arrays.asList(frock, watch, shirt, violin);
		
		for(Product product : list) {
			int price = computeDiscount(product, p1 -> p1.getPrice()-100);
			
			System.out.println(product.getName() + ": old price: " + product.getPrice() + ", new price: " + price);
		}

	}
	
	public static int computeDiscount(Product product, Function<Product, Integer> fn) {
		return fn.apply(product);
	}

}
