package collections_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Vector_add_methods {

	public static void main(String[] args) {

		Vector<String> v1= new Vector<String>();
		v1.add("Pooja");
		v1.add(1, "Manish");
		
		List<String> list = Arrays.asList("Somesh", "Sujata");
		v1.addAll(2, list);
		v1.addElement("Sonali");
		v1.addAll(v1);
		System.out.println(v1);

		System.out.println(v1.size());
	}

}
