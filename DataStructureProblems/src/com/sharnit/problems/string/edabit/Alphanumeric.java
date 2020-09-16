package com.sharnit.problems.string.edabit;

public class Alphanumeric {

	public static void main(String[] args) {
		
		String str = "sjhskj498735AASABFD6828";
		
		String str2 = str.replaceAll("[a-zA-Z0-9]", "");
		
		System.out.println("...str2.... "+str2);
		
				
	}
	
}
