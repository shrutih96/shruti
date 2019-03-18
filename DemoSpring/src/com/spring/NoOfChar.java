package com.spring;
import java.util.*;
public class NoOfChar {

	public static void main(String[] args) {
		String str = "WElcome to Legato.";

		// COUNTING THE NUMBER OF CHARACTERS
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' && !Character.isDigit(str.charAt(i))) {
				count++;

			}
		}
		System.out.println("No. of characters: " + count);

		// COUNT THE NUMBER OF OCCURRANCE
		str=str.toLowerCase(); 
		for (int i = 0; i < str.length(); i++) {
			int occ = 0;
			
			for (int j = 0; j < str.length(); j++) {
				
				if (str.charAt(i) == str.charAt(j)) {
					
					occ++;
					
				}

			}
			if (str.charAt(i) != ' ') {
				System.out.println(str.charAt(i) + "-" + occ);
			}
		}

		System.out.println();
		
		//COUNT THE NUMBER OF OCCURRANCE WITHOUT DUPLICATE VALUES

		HashMap<Character,Integer> m= new LinkedHashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
			int occ = 0;
			
			for (int j = 0; j < str.length(); j++) {
				
				if (str.charAt(i) == str.charAt(j)) {
					
					occ++;
					
				}
			}
			m.put(str.charAt(i),occ);
		
		}
		
		Set s= m.keySet();
		
		Iterator it=s.iterator();
		while(it.hasNext()) {
			
			Object obj= it.next();
			System.out.println(obj+" "+m.get(obj));
		}
	
	}
}
