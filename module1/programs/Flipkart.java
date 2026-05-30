package module1.programs;

public class Flipkart {
	Flipkart()
	{
		System.out.println("1st constructor");
	}
	Flipkart(int a)
	{
		System.out.println("2nd constructor");
	}
    Flipkart(double a,double b)
    {
    	System.out.println("3rd constructor");
    }
    Flipkart(long a, long b)
    {
    	System.out.println("4th constructor");
    }
	public static void main(String[] args) 
	{  
		Flipkart f1 = new Flipkart();//invoke constructor 1st constructor printed
		Flipkart f2 = new Flipkart(90);//we need to provide the correct arguments otherwise methods is not called 
		Flipkart f3 = new Flipkart(14,15);
		Flipkart f4 = new Flipkart(500, 1000);
	}

}
