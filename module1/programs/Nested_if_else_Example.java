package module1.programs;

public class Nested_if_else_Example {

	public static void main(String[] args) {

		int a=10;
	    int b=20;
	    int c=30;
	    
	    if(a<c)//true
	    {
	    	System.out.println("1");
	    	
	    	if(a!=c) //true
	    	{
	    		System.out.println("2");
	    		
	    		if(b==10000)//false
	    		{
	    			System.out.println("3");
	    		}
	    	}
	    }
	    else
	    {
	    	System.out.println("4");
	    }
	}

}
