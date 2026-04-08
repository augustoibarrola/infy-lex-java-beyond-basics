package functionalinterface;

@FunctionalInterface
public interface Shape {

	public void draw();

//	public void area();

	public default Double area(Integer radius) {
		return radius * 3.14;
	}

	public default void fill(String color) {
		System.out.println("Inside default method fill()");
	}

	public static void clean() {
		System.out.println("Inside static method clean()");
	}

}
