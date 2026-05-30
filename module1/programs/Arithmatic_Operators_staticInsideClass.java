package module1.programs;

public class Arithmatic_Operators_staticInsideClass {
	
	public static void add()
	{
		int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);
	}
	public static void substract()
	{
		int a = 30;
        int b = 20;
        int substract = a-b;
        System.out.println(substract);
	}
	public static void mul()
	{
		int a = 30;
        int b = 20;
        int mul = a*b;
        System.out.println(mul);
	}
	public static void div()
	{
		int a = 30;
        int b = 20;
        int div = a%b;
        System.out.println(div);
	}

	public static void main(String[] args) {

		add();
		substract();
		mul();
		div();
	}

}
