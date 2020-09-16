package com.sharnit.problems.array;

import java.util.Arrays;

public class PoppingBlocks {

	
			// ['A', 'B', 'C', 'C', 'B', 'D', 'A']
			// The two adjacent Cs pop off

			// ['A', 'B', 'B', 'D', 'A']
			// Two adjacent Bs pop off

			// ['A', 'D', 'A']
			// No more blocks can be popped off
	
	
	  public static char[] finalResult(char[] letters) {
			StringBuilder sb = new StringBuilder(new String(letters));
      
			int index = getRepeatingCharIndex(sb.toString());
			
			while (index != -1) {
					int end = index;
					while (end < sb.length() && sb.charAt(end) == sb.charAt(index))
							end++;
					sb.delete(index, end);
					index = getRepeatingCharIndex(sb.toString());
			}

			return sb.toString().toCharArray();

	}    

	public static int getRepeatingCharIndex(String str) {

			for (int i=0; i<str.length()-1; i++) {
					char c1 = str.charAt(i);
					char c2 = str.charAt(i+1);
					if (c1 == c2) {
							return i;
					}
			}
			return -1;
		
	} 

	
	public static void main(String[] args) {
		
		char[] arr =  {'A', 'B', 'C', 'C', 'B', 'D', 'A'};
		
		char[] newArr = finalResult(arr);
		
		System.out.println("***** new array ********"+ Arrays.toString(newArr));
		
	}
}
