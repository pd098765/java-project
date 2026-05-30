package package3;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_at_runtime {

	public static void main(String[] args) {
     //syntax: datatype[] variable = new datatype[size];
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of your array:");
		int[] rollno=new int[s1.nextInt()];
		
		for(int i=0;i<rollno.length;i++) {
			System.out.println("Enter the value of array at the index position: "+i);
			rollno[i]=s1.nextInt();
			
		}
		System.out.println("The final array is:");
		System.out.println(Arrays.toString(rollno));
		
	}

}
