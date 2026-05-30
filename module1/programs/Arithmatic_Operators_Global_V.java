package module1.programs;

public class Arithmatic_Operators_Global_V {
	void add() {
		int a=10;
		int b=20;
	    int sum =a+b;
	    System.out.println(sum);
	}
	static void sub() {
		int a=10;
		int b=20;
		int c =a-b;
		System.out.println(c);
		
		int x;//declaration
		x=10;// initialization
		System.out.println(x);//Utilization
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmatic_Operators_Global_V a= new Arithmatic_Operators_Global_V();
		a.add();
		sub();
	}

}
