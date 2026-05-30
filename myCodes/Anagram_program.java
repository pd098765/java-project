package myCodes;

import java.util.Arrays;

public class Anagram_program {

	public static void main(String[] args) {

String a="listen";
String b="silent";
if(a.length()!=b.length())
{
	System.out.println("They are not anagram");
	}else {
		char[] a1=a.toCharArray();
		char[] b1=b.toCharArray();
		System.out.println("Here converting string into array: ");
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(b1));
		Arrays.sort(a1);
		Arrays.sort(b1);
		if(Arrays.equals(a1, b1)) {
			System.out.println("The given strings are anagram");
		}
	}
}

}
