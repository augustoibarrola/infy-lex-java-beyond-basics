package lambdaexpressions.five;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import lambdaexpressions.three.Product;

public class ProductUtility {
	
	/*
	 * Consumer Interface
	 */

	public static void main(String[] args) {
		
		Product frock = new Product(1001, "Frock", 5.0, 100);
		Product watch = new Product(1002, "Watch", 4.9, 600);
		Product shirt = new Product(1003, "Shirt", 4.0, 500);
		Product violin = new Product(1004, "Violin", 3.5, 800);
		
		List<Product> list = Arrays.asList(frock, watch, shirt, violin);
		
		System.out.println("***** Generating Manager Report ****");
		generateReport(list, product -> System.out.println(product.getId() + " : " + product.getName() + " : " + product.getRating() + " : " + product.getPrice()));
		
		System.out.println("***** Generating Consumer Report ****");
		generateReport(list, product -> System.out.println(product.getName() + " : " + product.getRating() + " : " + product.getPrice()));
	}
	
	public static void generateReport(List<Product> list, Consumer<Product> consumer){
		for(Product product : list) {
			consumer.accept(product);
		}
	}

}
