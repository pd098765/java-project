package module1.programs;

public class Nested_If_else_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int c=30;
		if(a<c)
		{
			System.out.println("1");
			
			if(a==b)//if it is true then print 2 otherwise else will execute and print 2
			{
				System.out.println("2");
			}
			else
			{
				System.out.println("4");
			}
			}
		else
		{
			System.out.println("3");
		}
	}

}
