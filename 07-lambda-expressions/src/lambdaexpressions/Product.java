package lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class Product {
	
	private Integer id;
	private String name;
	private Double rating;
	private Integer price;
	
	public Product() {
		
	}
	
	public Product(Integer id, String name, Double rating, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public double generateDiscountSlip() {
		System.out.println("Product price");
		return this.getPrice(); // no increment
	}
	
	public static List<Product> getProductList(){
		Product frock = new Product(1001, "Frock", 5.0, 100);
		Product watch = new Product(1002, "Watch", 4.9, 600);
		Product shirt = new Product(1003, "Shirt", 4.0, 500);
		Product violin = new Product(1004, "Violin", 3.5, 800);
		
		List<Product> list = Arrays.asList(frock, watch, shirt, violin);
		return list;
	}
	

}
