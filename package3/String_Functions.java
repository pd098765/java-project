package package3;

public class String_Functions {

	public static void main(String[] args) {

		String a="pooja";
		String b="automation";
		String d="Automation testing";
		String a1=a.toLowerCase();//write string in uppercase
		System.out.println(a1);
		
		String a2=b.toUpperCase();// write string in lowercase
		System.out.println(a2);
		
		System.out.println(b.substring(1));//write string from starting index
		System.out.println(b.subSequence(1, 9));//write string between start index and end index i. e 1-9=8, cant use length function due to index mention
		
		boolean c=a.equals(b);//		boolean c=a.equals(automation);
		boolean c1=a.equalsIgnoreCase(a);//does not care about equality only chek the string
		System.out.println(c);
		System.out.println(c1);
		
		boolean d1= d.contains("testing");
		System.out.println(d1);
		//how you can iterate all characters present in the given string
				for(int i=0;i<=a.length();i++) {
					System.out.println(a.charAt(i));
				}
		
		//Reverse the string
		String reverse="";
		for(int i=a.length()-1;i>=0;i--) {
			char C=a.charAt(i);
			reverse=reverse+C;
		}
		System.out.println("The input String is:"+ a);
		System.out.println("The output String is:"+ reverse);

	}

}
