package com.sharnit.problems.string;

public class ReplaceAllTheFoxWithCat {

	public static void replaceString(String str) {
		
		String new_str = str.replaceAll("Fox", "Cat");
		System.out.println(" new string : "+new_str);
		System.out.println(" old string : "+str);
		
		
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
		System.out.println(s1);  
		System.out.println(replaceString);  
	}
	
	
	public static void main(String[] args) {
		
		String str = "ReplaceAllTheFoxWithCat ReplaceAllTheFoxWithCat";
		
		replaceString(str);
		
		
	}
}
