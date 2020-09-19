package com.sharnit.problems;

import java.util.Arrays;

public class SubstringWithConcatenationOfAllWords {

	//Input: s = "barfoothefoobarman", words = ["foo","bar"]
	//Output: [0,9]
	
	public static void main(String[] args) {
		
		String input = "barfoothefoobarman"; 
		String[] words = {"foo","bar"};
		
		String s1 = words[0]+words[1];
		String s2 = words[1]+words[0];
		
		String arr = findIndexes(input, s1, s2);
		
		System.out.println(" => "+Arrays.toString(arr.split(",")));
	}
	
	public static String findIndexes(String input, String s1, String s2){
		
		int array[];
		String arr = "";
		
		int inLen = input.length();
		int woLen = s1.length();
		
		for(int i = 0; i<inLen ; i++) {
			
			if(input.charAt(i) == s1.charAt(0)) {
				
				if(input.substring(i, i+woLen).equals(s1)) {
					
					arr = arr+","+i;
				}
				
			}
			
			if(input.charAt(i) == s2.charAt(0)) {
				
				if(input.substring(i, i+woLen).equals(s2)) {
					
					arr = arr+","+i;
				}
				
			}
			
		}
		
		return arr.substring(1);
		
	}
}
