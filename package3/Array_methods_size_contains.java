package package3;

import java.util.ArrayList;

public class Array_methods_size_contains {

	public static void main(String[] args) {

		ArrayList<String> s1= new ArrayList<String>();
		s1.add("Pooja");
		s1.add("Prasad");
		s1.add("kamal");
		s1.add("smita");
		System.out.println("1st List "+ s1);
		
		s1.add(1,"snehal");
		System.out.println("After inserting:"+ s1);
       
		String s2= s1.get(0);
		System.out.println("Name at index 0: "+ s2);
	
		s1.set(2, "Manavi");
		System.out.println("After insertion: "+s1);
		
		System.out.println(s1.remove("Pooja"));
		System.out.println(s1.size());
		System.out.println(s1.contains("smita"));
		System.out.println(s1.isEmpty());
		
	}

}
