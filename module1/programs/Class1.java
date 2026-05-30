package module1.programs;
abstract class Class3{
	
	abstract void method2();
	static void method1() {
		System.out.println("this logic will be exposed 1");
	}

}
   abstract class Class2 extends Class3{
	
	abstract void method3();
	abstract void method4();
    
	static void method5() 
    {
    System.out.println("this logic will be exposed 2");	
    }
    public class Class1 extends Class2 
    {

	    public static void main(String[] args) 
	{
	}
	void method3() 
	{
	System.out.println("this logic will not be exposed");

	}
	void method4() 
	{	
		System.out.println("this logic will not be exposed");
	}
	void method2() 
	{		
		System.out.println("this logic will not be exposed");

	}
}
   }
