package module1.programs;
class GransParent{
	void login() {
		System.out.println("Login using username");
	}
}
class Parentprogram extends GrandParent
{
	void login() {
		System.out.println("Login using email id");
	}
}

class child extends Parentprogram{
	void login() {
		super.login(); 

		System.out.println("Login using OTP");
		
	}
}
public class Method_Overriding extends child {
	void login() {
		super.login(); 
		System.out.println("Login using mobile no");

	}

	public static void main(String[] args) {

		Method_Overriding m1= new Method_Overriding();
		m1.login();
		
	}

}
