package methodreference;

import java.util.Arrays;
import java.util.List;

public class ProductUtility {

	public static void main(String[] args) {
		
		List<String> productList = Arrays.asList("Frock", "Watch", "Shirt", "Violin");
		productList.sort(String::compareTo);
		
		for(String productName : productList) {
			System.out.println(productName);
		}

	}

}
