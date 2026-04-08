package lambdaexpressions.six;

import java.util.List;
import java.util.function.Supplier;

import lambdaexpressions.Product;

public class ProductUtility {

	public static void main(String[] args) {
		
		List<? extends Product> list = Product.getProductList();
		for(Product product : list) {
			generate(() -> product);
		}

	}


	public static void generate(Supplier<? extends Product> supplier) {
		System.out.println(supplier.get().getName() + ":" + supplier.get().generateDiscountSlip());
	}

}
