package package3;

public class Palindrome {

	public static void main(String[] args) {

		String a="mom";    //dad,did,madam,radar,
		String reverse="";
		for(int i=a.length()-1;i>=0;i--) {
			char C=a.charAt(i);
			reverse=reverse+C;
		}
		System.out.println("The input String is:"+ a);
		System.out.println("The output String is:"+ reverse);
		if(a.equalsIgnoreCase(reverse)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}

		
	}

}
