package module1.programs;

public class Case1Methods {
	
	public static void method() 
	{
		System.out.println("Public");
	}
    protected static void method1() 
    {
		System.out.println("Protected");

	}
    static void method2() 
    {
		System.out.println("static");

    }
    private static void method3() 
   {
		System.out.println("Private");

   }

	public static void main(String[] args) {

		method();
		method1();
		method2();
		method3();
		
	}

}
