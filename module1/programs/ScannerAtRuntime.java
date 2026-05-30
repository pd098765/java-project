package module1.programs;

import java.util.Scanner;

public class ScannerAtRuntime {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Please enter value of a:");
		String a= s1.next();

		System.out.println("Please enter value of b:");
		int b= s1.nextInt();

		System.out.println("Please enter value of d:");
		boolean d= s1.nextBoolean();

		System.out.println("Please enter value of f1:");
		float f1= s1.nextFloat();
		
		System.out.println("Please enter value of e:");
		double e= s1.nextDouble();
		
		System.out.println("Please enter value of s:");
		short s= s1.nextShort();
		
		System.out.println("Please enter value of h:");
		long h= s1.nextLong();
		
		System.out.println("Please enter value of j:");
		byte j= s1.nextByte();

		s1.close();
		
	}

}
