package myCodes;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_characters_In_String {

	public static void main(String[] args) {
		
		String s="automation";
		Map<Character, Integer> map = new HashMap<>();
		for ( char c: s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		map.forEach((k,v)->{
			if(v>1)
				System.out.println(k+":"+v);
		});
		}
	}


