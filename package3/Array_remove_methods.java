package package3;

import java.util.ArrayList;

public class Array_remove_methods {

	public static void main(String[] args) {

		ArrayList<String> a1= new ArrayList<String>();
		a1.add("ram");
		a1.add("Alisha");
		a1.add("Naina");
		a1.add("Bheem");
		a1.add("Vishu");
		a1.remove(1);

		System.out.println("After removing indexing 1->"+ a1);
		a1.remove("Naina");
		System.out.println("After removing the object Naina->"+ a1);
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("Kalpana");
		a2.add("Jaynath");
		a2.add("Jyoti");
		a2.add("Harish");
		a2.add("Gayatri");
		a2.addAll(a1);
		System.out.println(a2);
		
        a2.removeAll(a1);
        System.out.println(a2);
	}

}
