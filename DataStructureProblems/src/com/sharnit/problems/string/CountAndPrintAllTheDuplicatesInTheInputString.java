package com.sharnit.problems.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountAndPrintAllTheDuplicatesInTheInputString {

	public static void printDuplicate(String str) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			if (!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), 1);
			} else {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			}
		}

		System.out.println(" hashmap " + hm);
		
		Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();
		
		for(Map.Entry<Character, Integer>es : entrySet) {
			
			if(es.getValue() > 1) {
				System.out.println(" Character : "+ es.getKey());
				System.out.println(" Occurrance : "+ es.getValue());
				System.out.println("");
			}
			
		}

	}

	public static void main(String[] args) {

		String str = "crickettennisbasketballhockeyfootball";

		printDuplicate(str);

	}

}
