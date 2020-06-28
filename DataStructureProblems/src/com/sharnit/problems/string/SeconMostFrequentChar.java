package com.sharnit.problems.string;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.List;

public class SeconMostFrequentChar {

	public static void printSecondMostFrequentChar(String str) {
		
		char[] charArr = str.toCharArray();
		
		// Hashmap implementation
		
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		
		for(int i=0 ; i<charArr.length; i++) {
			
			if(!m.containsKey(charArr[i]+"")) {
				
				m.put(charArr[i] , 1);
				
			}else {
				
				m.put(charArr[i] , m.get(charArr[i])+1);
			}
		}
		
		
		//sort hash map by value
		
		List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(m.entrySet());
		
		Collections.sort(
				list, 
				new Comparator<Map.Entry<Character, Integer>>()
				{
			            public int compare(Map.Entry<Character, Integer> o1, 
			            		           Map.Entry<Character, Integer> o2) {
			            	return (o1.getValue().compareTo(o2.getValue()));
			            }
				}
		);
		
		
		System.out.println("second most often char is { "+ 
		          ((Map.Entry<Character, Integer>)list.get(list.size()-2)).getKey() +
		          " } and repetition is { " + 
		          ((Map.Entry<Character, Integer>)list.get(list.size()-2)).getValue()+" }");
	}
	
	public static void main(String[] args) {
		
		String str = "IIII Lovvve My India Nation";
		
		printSecondMostFrequentChar(str);
		
		
	}
}
