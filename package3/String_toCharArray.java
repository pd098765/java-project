package package3;

import java.util.Arrays;

public class String_toCharArray {

	public static void main(String[] args) {


		String a="auto";
		char[]cl=a.toCharArray();
		System.out.println(cl[0]);
		System.out.println(cl[1]);
		System.out.println(cl[2]);
		System.out.println(cl[3]);

		
		String b="automation";
		char[]c2=b.toCharArray();
		for(int i=0;i<c2.length;i++) {
			System.out.println(c2[i]);
		}
		System.out.println(Arrays.toString(cl));
		System.out.println(Arrays.toString(c2));

	}

}
