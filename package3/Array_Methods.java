package package3;

import java.util.ArrayList;

public class Array_Methods {

	public static void main(String[] args) {

		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(80);
		//a1.add(0, null);
		a1.addAll(a1);
		a1.add(12);
		a1.add(10);
		System.out.println(a1);
		ArrayList<Integer> a2= new ArrayList<Integer>();
        a2.add(4);
        a2.add(5);
        a2.add(6);
        System.out.println(a2);
        boolean b1= a1.equals(a2);
        System.out.println(b1);
        
        a1.clear();
        boolean b3= a1.isEmpty();
        System.out.println(b3);
        System.out.println(a1);
        
	}

}
