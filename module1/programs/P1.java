package module1.programs;
class P3{                             // P3 is a Grandparent class
	static void add()
{
		System.out.println("Addition");
		}
}
class P2 extends P3{                        // P2 is a parent class multilevel Inheritance 
	static void mul() {
		System.out.println("Multiplication");
		
	}
}

public class P1 extends P2 {              //  P1 is a child class multilevel inheritance
	static void sub() {
		System.out.println("Substraction");
		
	}

	public static void main(String[] args) {
		P1 p1=new P1();
		p1.add();
		p1.mul();
		p1.sub();
		p1.sub();
		

	}

}
