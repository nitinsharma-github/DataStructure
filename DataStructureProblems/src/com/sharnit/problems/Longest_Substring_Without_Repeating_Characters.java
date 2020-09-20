package com.sharnit.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

	
	public static void main(String[] args) {
		
		String s = "abcdeabcdefabcdefgh";
		String s1 = "Nitin";
		String result = findLongest(s, s1);		
		System.out.println("Result => "+result);

	}
	
	
	public static String findLongest(String s, String s1) {
		
		int len = s.length();
		int setLen = 0;
		Set finalSet = null;
		Set<String> set = new HashSet<String>();
		
		for(int i=0; i<len; i++) {
			
			for(int j=i; j<len; j++) {
				if(!set.contains(s.charAt(j)+""))
						
					set.add(s.charAt(j)+"");
				
				else if(setLen < set.size()) {
					
					setLen = set.size();
					finalSet = set;
					set.clear();
					break;
				}
				
			}
		}
		
		// Object[] a=collection.toArray(); 
		// Integer[] a = new Integer[5];  
        //          Integer[] b =  collection.toArray(a); 
		
		
		String[] sArr = set.toArray(new String[0]); // convert set to String Array 
		return Arrays.toString(sArr);
		
	}
	
	
}
