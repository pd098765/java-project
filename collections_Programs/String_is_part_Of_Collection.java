package collections_Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class String_is_part_Of_Collection {

	public static void main(String[] args) {

		ArrayList<String> list= new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("Cucumber");
		list.add("TestNG");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals("Java")) {
				System.out.println("Java is a part of collection");
			}
		
		}
	}

}
