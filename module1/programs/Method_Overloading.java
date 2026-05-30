package module1.programs;

public class Method_Overloading {
	static void add(int a, int b)//method overloading for static method
	{
		int sum = a+b;
		System.out.println(sum);
	}
	static void add(int b, float a) {
		float sum = b+a;
		System.out.println(sum);
	}
	void sub(int a, int b) {
		int sub = a-b;
		System.out.println(sub);
	}
	void add(long a, long b) {
		long add = a + b;
		System.out.println(add);
		
	}
	public static void main(String[] args) {

		add(10,20);//calling static method (int,int)
		add(11,1.1f);//calling static method (int,float)
		
		Method_Overloading s1 =new Method_Overloading();//calling non static method (int,int)
		s1.sub(5, 6);
		s1.add(461233789l, 528);
		
		
	}

}
