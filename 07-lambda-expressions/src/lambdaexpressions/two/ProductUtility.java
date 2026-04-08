package lambdaexpressions.two;

import java.util.Arrays;
import java.util.List;

public class ProductUtility {
	
	/*
	 * Traversing Collections Using Lambdas
	 */

	public static void main(String[] args) {
		
		Product frock = new Product(1001, "Frock", 5.0, 100);
		Product watch = new Product(1002, "Watch", 4.9, 600);
		Product shirt = new Product(1003, "Shirt", 4.0, 500);
		Product violin = new Product(1004, "Violin", 3.5, 800);
		
		List<Product> list = Arrays.asList(frock, watch, shirt, violin);
		
		list.forEach(product -> System.out.println(product.getName()));

	}

}
