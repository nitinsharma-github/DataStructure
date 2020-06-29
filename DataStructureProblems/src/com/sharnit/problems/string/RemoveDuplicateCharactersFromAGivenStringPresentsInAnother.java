package com.sharnit.problems.string;


// Write a Java program to remove duplicate characters from a given string presents in another given string.

public class RemoveDuplicateCharactersFromAGivenStringPresentsInAnother {


	
	static void removeDups(String str1 , String str2){
		
		StringBuilder sb = new StringBuilder(str1);
		int len = str1.length();
		for(int i=0; i<str2.length(); i++) {
			
		char c_i = str2.charAt(i);
			
			for(int j=0; j<str1.length(); j++) {
				
			char c_j = str1.charAt(j);
				
					if(c_i == c_j)
					{
					
							for(int k=j+1; k<len; k++) {
								
								char c_k = str1.charAt(k);
								
									if(c_j == c_k) {
										System.out.println("***********"+c_i +" "+c_j+" "+c_k + " "+sb.toString() );
										--len;
										sb.deleteCharAt(k);
										
									}
								
							}
					}
				
			}
			
		}
		
		System.out.println("Final String : "+ new String(sb));
		
	}
	
	public static void main(String[] args) {
		
		String str1 = "Sharrmaa";
		String str2 = "kra";
		
		removeDups(str1, str2);
		
	}
	
}
