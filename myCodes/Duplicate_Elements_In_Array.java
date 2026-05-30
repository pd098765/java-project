package myCodes;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Elements_In_Array {

	public static void main(String[] args) {

		int[]arr= {1,2,1,2,3,4,3};
		Set<Integer> set=new HashSet<>();
		for(int i:arr) {
			if(!set.add(i)) {
				System.out.println(i);
			}
		}     
	}
}
