package lambdaexpressions.six;

import lambdaexpressions.Product;

public class BestProduct extends Product {
	
	public BestProduct(Integer id, String name, Double rating, Integer price) {
		super(id, name, rating, price);
	}
	
	@Override
	public double generateDiscountSlip() {
		System.out.println("Discounted price for the best product: ");
		return (super.getPrice()/2);
	}

}
