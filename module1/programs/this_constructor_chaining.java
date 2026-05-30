package module1.programs;

public class this_constructor_chaining {
	this_constructor_chaining(){
		System.out.println("1st constructor");
	}
	this_constructor_chaining(int a){
		System.out.println("2nd constructor");
	}
	public static void main(String[] args) {

		new this_constructor_chaining(10);  
	}

}
