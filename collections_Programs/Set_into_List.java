package collections_Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_into_List {

	public static void main(String[] args) {


		Set s1= new HashSet();
		s1.add("Java");
		s1.add("Ruby");
		s1.add("Python");
		s1.add("JavaScript");
		s1.add("TypeScript");
		s1.add("NodeJs");
		
		System.out.println(s1);
		
		List l1= new ArrayList(s1);
		//System.out.println(l1);
		
		l1.add("Java");
		System.out.println(l1);
		
	}

}
