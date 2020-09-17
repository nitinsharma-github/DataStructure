package com.sharnit.problems;

import java.util.HashMap;

public class ValidParentheses {
	
	public static void main(String[] args) {
		
		System.out.println("start...");
		
		
		String str = "({<>})[]";
		boolean b = true;
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("(", ")");
		hm.put("{", "}");
		hm.put("[", "]");
		hm.put("<", ">");
		
		
		int len = str.length();
		
		if(len%2 != 0 ) {
			b = false;
		}else {
			
			char[] charArray = str.toCharArray();
			
			for(int i=0, j=len-1; i<j ; i++, j--) {
				
				//System.out.println("loop start...");
				
				if(hm.get(charArray[i]+"").equals(charArray[j]+"")) {
					
					continue;
					
				}else {
					b = false;
				}
				
			}
			
			
			
		}
		
		if(b) {
			System.out.println("String is valid");
		}else {
			System.out.println("String is invalid");
		}
		
		
	}

}
