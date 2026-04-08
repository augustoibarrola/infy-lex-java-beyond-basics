package lambdaexpressions.three;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ProductUtility {
	
	/*
	 * Predicate Functional Interface
	 */

	public static void main(String[] args) {
		
		Product frock = new Product(1001, "Frock", 5.0, 100);
		Product watch = new Product(1002, "Watch", 4.9, 600);
		Product shirt = new Product(1003, "Shirt", 4.0, 500);
		Product violin = new Product(1004, "Violin", 3.5, 800);
		
		List<Product> list = Arrays.asList(frock, watch, shirt, violin);
		
		System.out.println("Product based on price: ");
		evaluate(list, product -> (product.getPrice() > 500));
		
		System.out.println("Product based on rating: ");
		evaluate(list, product -> (product.getRating() > 4));

	}
	
	public static void evaluate(List<Product> list, Predicate<Product> predicate) {
		for(Product product : list) {
			if(predicate.test(product)) {
				System.out.println(product.getName());
			}
		}
	}

}
