package package3;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		        // 1. Define the source array
		        int[] a = {1, 2, 3, 4, 5};
		        
		        // 2. Create a destination array of the same size
		        int[] b = new int[a.length];

		        // 3. Copy elements in reverse order
		        for (int i = 0; i < a.length; i++) {
		            // Index logic: length - 1 (last index) minus current position
		            b[i] = a[a.length - 1 - i];
		        }
		        System.out.println("input: " + Arrays.toString(a));
		        System.out.println("reversed output: " + Arrays.toString(b));
		    }

	}

