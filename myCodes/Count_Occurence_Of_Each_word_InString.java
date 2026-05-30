package myCodes;

import java.util.HashMap;
import java.util.Map;

public class Count_Occurence_Of_Each_word_InString {

	    public static void main(String[] args) {	    	
	    	String s= "java selenium java testing";
	    	String[] words=s.split(" ");
	    	Map<String, Integer>map=new HashMap<>();
	    	for(String w:words) {
	    		map.put(w, map.getOrDefault(w, 0)+1);
	    	}
	    	System.out.println(map);
	    }
	}




