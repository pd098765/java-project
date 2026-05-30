package module1.programs;
class Parent{
	final void login() {
		System.out.println("Login succesful");
	}
}

public class MethodOverRiding extends Parent {
	void login_Unsuccesful() {
		System.out.println("Login Unsuccesful");
		super.login();
	}

	public static void main(String[] args) {
		MethodOverRiding m1=new MethodOverRiding();
		m1.login();
	}

}
