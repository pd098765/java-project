package module1.programs;
class V_3{
	V_3(int a, int b){                             //Parent class
		System.out.println("Constructor 3");
	}
}
class V_2 extends V_3{
	V_2(){
		super(10,20);
	
		System.out.println("Constructor 2");
	}
}

public class SuperConstructor_child extends V2 {                //child class 
	SuperConstructor_child()
	{
		super();
		System.out.println("Constructor 1");
		
	}

	public static void main(String[] args) {

		new SuperConstructor_child();
		
	}

}
