package com.sharnit.problems.array;

public class ReverseStringUsingSB {

	
	public static void reverseThisString(String str) {
		
		if(isNullOrEmpty(str)) {
		    System.out.println("please don't try null or empty string")	;
		    return;
		}
			
		if(str.length() == 1) {
		    System.out.println("enter string more than 1 char")	;
		    return;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length()-1; i>=0 ;i--) {
		
			sb.append(str.charAt(i));            //can use : "  char[] ch = str.toCharArray(); " logic if not charAt 
		}
		
		System.out.println("reversed string : "+new String(sb));
		
	}
	
	public static boolean isNullOrEmpty(String str) {
		
		if(str == null || str.equals("") || str.trim().equals("")) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
	
		reverseThisString("");
		
		System.out.println("******************************************");
		
		reverseThisString(" ");
		
		System.out.println("******************************************");
		
		reverseThisString(null);
		
		System.out.println("******************************************");
				
		reverseThisString("a");
		
		System.out.println("******************************************");
		
		reverseThisString("I am a software engineer");
		
		System.out.println("******************************************");
		
		reverseThisString("I am a software % $ engineer");
		
		System.out.println("******************************************");
		
	}
	
	
	
}
