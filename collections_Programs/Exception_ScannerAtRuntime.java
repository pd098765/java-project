package collections_Programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_ScannerAtRuntime {

	public static void main(String[] args) {

		try {
			Scanner s1 = new Scanner(System.in);

			System.out.println("Please enter value of a:");
			String a = s1.next();

			System.out.println("Please enter value of b:");
			int b = s1.nextInt();

			System.out.println("Please enter value of d:");
			boolean d = s1.nextBoolean();

			String sum = a + b;
			System.out.println(sum);

			s1.close();
            
		}catch (InputMismatchException i1) 
		{
           System.out.println("Exception handled");
		}
		}
	}

		

	

