package lambdaexpressions.six;

import lambdaexpressions.Product;

public class ReasonableProduct extends Product{
	
	public ReasonableProduct(Integer id, String name, Double rating, Integer price) {
		super(id, name, rating, price);
	}
	
	@Override
	public double generateDiscountSlip() {
		System.out.println("Discounted price for the reasonable product: ");
		return (super.getPrice() - 100);
	}

}
