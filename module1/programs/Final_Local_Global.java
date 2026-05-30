package module1.programs;

public class Final_Local_Global {
	final static double pi=3.14;//global final variable
	
	static void Class() {
		final int a=10;//local final variable
		System.out.println(pi);
		System.out.println(a);
	}

	public static void main(String[] args) {
		Final_Local_Global p1 = new Final_Local_Global();
		p1.Class();			
	}
		}


