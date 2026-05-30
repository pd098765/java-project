package module1.programs;

abstract class one 
    {
	abstract void method1();// abstract method
    }
    public class Concrete_class extends one{

	public static void main(String[] args) {

	}

	@Override
	void method1() 
	{
    System.out.println("Hide from customer:real logic");		
	}

}
