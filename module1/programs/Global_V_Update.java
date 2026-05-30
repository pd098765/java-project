package module1.programs;

public class Global_V_Update {
	static int a=10;
	static int b=20;
	
	public static void add(){
		int a1=20;
		int b1=30;
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);

		Global_V_Update g1 = new Global_V_Update();
		g1.a=50;
		System.out.println(g1.a);
		g1.b=60;
		System.out.println(g1.b);

	}

}
