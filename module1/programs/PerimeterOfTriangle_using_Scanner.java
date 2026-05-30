package module1.programs;

import java.util.Scanner;

public class PerimeterOfTriangle_using_Scanner {

	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      
	  System.out.println("Enter value of side A:");
	  int a =sc.nextInt();
	  
	  System.out.println("Enter value of side B:");
	  int b=sc.nextInt();
	
	  System.out.println("Enter value of side c:");
	  int c=sc.nextInt();
	  
	  int Perimeter_of_Triangle =a+b+c;
	  System.out.println(Perimeter_of_Triangle);
	}

}
