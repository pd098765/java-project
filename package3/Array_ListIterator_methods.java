package package3;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_ListIterator_methods {

	public static void main(String[] args) {

		ArrayList<String> a1= new ArrayList<String>();
		a1.add("ram");
		a1.add("Alisha");
		a1.add("Naina");
		a1.add("Bheem");
		a1.add("Vishu");
		System.out.println(a1);
		
		ListIterator<String> itr = a1.listIterator();
		
        //hasnext->boolean   hasprevious->boolean   next->Object previous->object remove set
        //listiteartor is useful for both forward iteartion as well as backward iteartion

		System.out.println("Forward iteration using ListIterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Backward iteration using ListIterator");
		while(itr.hasPrevious())
		{
			System.out.println(itr.hasPrevious());
		}
		
	}

}
