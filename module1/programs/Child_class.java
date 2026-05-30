package module1.programs;

public class Child_class extends Parent_class {//single inheritance

	static void searchingProduct()
	{
		System.out.println("SearchingProduct");
	}
	static void GoToCart()
	{
		System.out.println("Go to cart succesfully");
	}
	public static void main(String[] args) {
		
		searchingProduct();
		GoToCart();
		login();//inherited from parent class
		logout();//inherited from parent class
		
		
	}

}
