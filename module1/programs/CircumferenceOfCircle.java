package module1.programs;

import java.util.Scanner;

public class CircumferenceOfCircle {

	public static void main(String[] args) {

	   Scanner s1=new Scanner(System.in);
       System.out.println("Please enter the value of r:");
       double r = s1.nextDouble();
       double circumference = 2*Math.PI*r;
       System.out.println("Circumference is :");
       System.out.println(circumference);
       
       s1.close();
	}

}

