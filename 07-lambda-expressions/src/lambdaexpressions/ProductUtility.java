package lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class ProductUtility {

	public static void main(String[] args) {
		
		List<String> productList = Arrays.asList("Frock", "Watch", "Shirt", "Violin");
//		productList.sort((String p1, String p2) -> p1.compareTo(p2));
//		productList.sort((p1, p2) -> p1.compareTo(p2));
		productList.sort((p1, p2) -> {
			return p1.compareTo(p2);
		});
		
		for(String productName : productList){
			System.out.println(productName);
		}

	}

}
