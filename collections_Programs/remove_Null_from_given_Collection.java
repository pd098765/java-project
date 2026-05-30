package collections_Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class remove_Null_from_given_Collection {

	public static void main(String[] args) {
		
				ArrayList a1=new ArrayList();
				a1.add("Upmanyu");
				a1.add("Raju");
				a1.add(null);
				a1.add("Vikram");
				a1.add("Sai");
				a1.add("Mahanta");
				a1.add(null);
				a1.add("Arati");
				a1.add("Harish");
				System.out.println(a1);
				
				Iterator s1=	a1.iterator();
				while(s1.hasNext())
				{
					if(s1.next()==null)
					{
						s1.remove();
					}
				}
				System.out.println(a1);
				
			}
		
				
	}

