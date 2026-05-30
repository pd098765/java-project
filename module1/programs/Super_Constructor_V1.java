package module1.programs;
class V3{
	V3(){
		System.out.println("Constructor 3");
	}
}
class V2 extends V3{
	V2(){
		super();
	
		System.out.println("Constructor 2");
	}
}

public class Super_Constructor_V1 extends V2 {
	Super_Constructor_V1()
	{
		super();
		System.out.println("Constructor 1");
		
	}

	public static void main(String[] args) {

       new Super_Constructor_V1();
       //new V2();
       //new V3();
 
	}

}
