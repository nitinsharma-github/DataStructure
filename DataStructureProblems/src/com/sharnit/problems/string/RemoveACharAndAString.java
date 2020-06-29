package com.sharnit.problems.string;

public class RemoveACharAndAString {

	public static void printRemoveACharAndAString(String str, char c, String s) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			
			if((str.charAt(i) != 'c') && !(str.charAt(i) == 'k' && str.charAt(i+1) == 'e'))
				
				sb.append(str.charAt(i));
			
			if((str.charAt(i) == 'k' && str.charAt(i+1) == 'e') && ((i+2) < str.length())) {
				
				i = i+1;
			}
		}
		
		System.out.println("new String is : "+sb.toString());
		
	}
	
	public static void main(String[] args) {
		
		String str = "I would like to play cricket";
		char c = 'c';
		String s = "ke";
		
		printRemoveACharAndAString(str,  c,  s);
		
	}
}
