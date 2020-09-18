package com.sharnit.problems;

public class ImplementStrstr {

	public static void main(String[] args) {
	
		String haystack = "hellossfdsfernntryrtyr";
		String needle = "nntry";
		
		int index = findIndex(haystack, needle);
		
		System.out.println(" => " + index);
		
	}
	
	
	public static int findIndex(String h , String n) {
		
		int index = 0;
		
		int lenH = h.length();
		int lenN = n.length();
		
		char[] charH = h.toCharArray();
		char[] charN = n.toCharArray();
		
		for(int i = 0; i<lenH ; i++) {
			
			for(int j=0; j<lenN ; j++) {
				
				if(charH[i] == charN[j]) {
					
					if(h.substring(i,i+n.length()).equals(n)) {
						
						index = i;
						
						return index;
						
					}
				}
				
			}
			
		
			
		}
		
		return index;
	}
	
}
