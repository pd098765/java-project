package module1.programs;

import java.util.Scanner;

public class Circumference_Of_Triangle {

	public static void main(String[] args) {

	 Scanner s1 = new Scanner(System.in);
     
     System.out.println("Please enter 1st side:");
     int a=s1.nextInt();

     System.out.println("Please enter 2nd side");
     int b=s1.nextInt();

     System.out.println("Please enter 3rd side");
     int c=s1.nextInt();

     int Circumference = a + b + c;
     System.out.println("Circumference of Triangle is : " + Circumference);
     
	}

}
