package module1.programs;

public class Example2_Nested_if_else_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int c=30;
		
		if(a<b)//true
			{
			System.out.println("1");
			
			if(a<=b)//false
			{
				System.out.println("2");
			}if(b<=c)//false
			{
				System.out.println("3");
			}
		else if(c>a)//true
			{
				System.out.println("4");
			}if(a==10)//true
			   {
				   System.out.println("5");
			   }else if(b==20)//true
			   {
				   System.out.println("6");
			   }else
			   {
				   System.out.println("7");
			   }
		}else
		{
			System.out.println("8");
		}if(c==30)//true
		   {
			   System.out.println("9");
		   }else {
			   System.out.println("10");
		   }
	}

}
