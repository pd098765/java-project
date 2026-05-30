package module1.programs;

public class Execution_SIB_IIB_MM_Constructor {
	
	Execution_SIB_IIB_MM_Constructor()
	{
		System.out.println("constructor");
	}
	Execution_SIB_IIB_MM_Constructor(int a)
	{
		System.out.println("constructor2");
	}
	static {
		System.out.println("SIB");
		
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) {

		Execution_SIB_IIB_MM_Constructor sa=new Execution_SIB_IIB_MM_Constructor();

		Execution_SIB_IIB_MM_Constructor sb=new Execution_SIB_IIB_MM_Constructor(15);
		
	    System.out.println("Main method");


	}

}
