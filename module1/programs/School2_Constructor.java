package module1.programs;

public class School2_Constructor {

	School2_Constructor(){//constructor
		System.out.println("This is constructor");
	}
	static void add() {
		System.out.println("Addition");
	}
	void sub() {
		System.out.println("Subtrction");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       School2_Constructor s1 =new School2_Constructor();
       add();
       s1.sub();
       School2_Constructor s2 = new School2_Constructor();
       s2.sub();
	}

}
