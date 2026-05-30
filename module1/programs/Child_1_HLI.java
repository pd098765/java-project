package module1.programs;

public class Child_1_HLI extends Parent_Class_HLI{
	static void addToCart() {
		System.out.println("Product added to cart");
	}
	

	public static void main(String[] args) {

		browserlaunch();
		loginToApplication();
		addToCart();
		
	}

}
