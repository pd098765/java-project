package collections_Programs;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Class2 {

	public static void main(String[] args) {

    Vector<String> v1= new Vector<String>();
    v1.addElement("Java");
    v1.addElement("Ruby");
    v1.addElement("JavaScript");
    v1.addElement("Java");
    System.out.println(v1);
    
    //Enumeration
    Enumeration<String> e1= v1.elements();
    System.out.println("Forward iteration using Enumeration: ");
    while(e1.hasMoreElements()) {
    	System.out.println(e1.nextElement());
    }
    Iterator<String> i2= v1.iterator();
    System.out.println("Forward iteration using Iterator: ");
    while(i2.hasNext()) {
    	System.out.println(i2.next());
    }
    
    ListIterator<String> i3= v1.listIterator();
    System.out.println("Forward iteration using ListIterator: ");
    while(i3.hasNext()) {
    	System.out.println(i3.next());
    }
    System.out.println("Backward Iteration using ListIterator");
    while(i3.hasPrevious()) {
    	System.out.println(i3.previous());
    }

	}

}
