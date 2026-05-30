package collections_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_Property {

	public static void main(String[] args) {

		Set s1= new HashSet();//it follows hashcode value
		s1.add("Java");
		s1.add("Ruby");
		s1.add("TypeScript");
		s1.add("javaScript");
		s1.add(null);
		s1.add("Python");
		//s1.add("Python+does not allow duplicates");//does not allow duplicates

		System.out.println(s1);
		Set<String> s2 = new HashSet<>(Arrays.asList("C++", "C#", "Selenium"));
        s1.addAll(s2);
        System.out.println(s1);
		System.out.println(s1.addAll(s1));
		System.out.println(s1.contains("Selenium"));
		System.out.println(s1.equals(s2));
		System.out.println(s2.size());
		System.out.println(s2.isEmpty());
		
	}

}
