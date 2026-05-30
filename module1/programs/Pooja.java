package module1.programs;

public class Pooja {
	static void add()
	{
		System.out.println("Addition");
	}

	void sub()
	{
		System.out.println("Substraction");
	}
	void mul()

	{
		System.out.println("Multiplication");
		
	}
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
      add();
      Pooja P = new Pooja();//syntax of creating an object 
      P.sub();//calling non static method
      P.mul();//calling non static method
	}

}
