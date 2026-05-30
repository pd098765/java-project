package package3;

import java.util.Arrays;

public class Copy_Array_To_another_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] input=new int[4];
      input[0]=45;
      input[1]=100;
      input[2]=40;
      input[3]=40;
      
      int[] output=new int[input.length];
      
      for(int i=0;i<output.length;i++) {
    	  output[i]=input[i];
      }
      System.out.print("your input array is:");
      System.out.println(Arrays.toString(input));
      System.out.print("your output array is");
      System.out.println(Arrays.toString(output));

	}

}
