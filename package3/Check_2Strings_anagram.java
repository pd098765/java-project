package package3;

import java.util.Arrays;

public class Check_2Strings_anagram {

	public static void main(String[] args) {

		String a="north";
		String b="thorn";
		
		if(a.length()!=b.length())
		{
			System.out.println("They are not Anagram");
		}else 
		{
			//convert string into array
			char[]c1= a.toCharArray();
			char[]c2= b.toCharArray();
			
			System.out.println("Converting String into Array: ");
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2)) 
			{
				System.out.println("The given 2 strings are Anagram");
			}else 
			{
				System.out.println("The given 2 strings are not Anagram");
			}
		}
	}

}
