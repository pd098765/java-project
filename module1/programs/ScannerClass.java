package module1.programs;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a= s1.nextInt();
		System.out.println("Please enter the value of b");
		int b= s1.nextInt();
		int sum=a+b;
		System.out.println("The sum of the two number:");
		System.out.println(sum);
		s1.close();
	}

}
