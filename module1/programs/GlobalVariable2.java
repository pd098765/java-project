package module1.programs;

public class GlobalVariable2 {
	static int a=10;//global
	int b=20;//global

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(a);
        GlobalVariable2 g1 =new GlobalVariable2();
        System.out.println(g1.b);
	}

}
