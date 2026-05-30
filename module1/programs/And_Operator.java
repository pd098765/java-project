package module1.programs;

public class And_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int c=30;
		if(a>10 && b==20)//false,true
		{
			System.out.println("1");//false
		}
		if(a>10 || b==20)//false, true
		{
			System.out.println("2");//true
		}
		if(!(a>10 && b==20))//false,true->false->true
		{
			System.out.println("3");//true
		}
		if(!(a>10 || b>=20))//false,true->true->false
		{
			System.out.println("4");//false
		}
		if((a!=b || b==20) || c==90)
        {
	    System.out.println("5");
        }
	}

}
