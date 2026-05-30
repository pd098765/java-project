package module1.programs;

public class Global_Variable 
{
	static int a=10;//global
	static int b=20;
	double pi=3.14;//global, instance variable
	static void add()
	{
		int sum = a+b;
		System.out.println(sum);
	}
    static void sub()
    {
    	int sub= a-b;
    	System.out.println(sub);
    }
    static void mul()
    {
    	int mul = a*b;
        System.out.println(mul);
    	 
    }
    	public static void main(String[] args) 
    	{
    		add();
    		sub();
    		mul();
        }
     
	}


