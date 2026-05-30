package package3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_Iterator_methods {

	public static void main(String[] args) {

		ArrayList<String> a1= new ArrayList<String>();
		a1.add("ram");
		a1.add("Alisha");
		a1.add("Naina");
		a1.add("Bheem");
		a1.add("Vishu");
		System.out.println(a1);
		
		Iterator<String> itr = a1.iterator();
		
        //hasnext->boolean   hasprevious->boolean   next->Object previous->object remove set
        //listiteartor is useful only for forward iteartion 
		// it is applicable to entire collection

		System.out.println("iteration using Iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
