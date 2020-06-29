package com.sharnit.problems.string;

public class FindTheMaximumOccurringCharacterInAString {

	public static void findCharAndLEngth(String str) {
		
		char c = 'x';
		int number = 0;
		int strLen = str.length();
		
		for(int i=0; i<strLen ; ++i) {
			
			char chr = str.charAt(i);
			int num = 1;  // thee will always be first occurance :)
			int j = 0;
			for(j=i+1; j<strLen ; ++j) {
				
				if(chr == str.charAt(j)) {
					
					++num;
					System.out.println("***************");
					
				}
			}
			
			
			  //if(str.charAt()==chr) { ++num; }
			 
			
			if(num > number) {
				
				c = chr;
				number = num;
				System.out.println("number :"+number);
				
			}
			
		}
		
		System.out.println("character is : "+c+ " and occurance is : "+number);
		
		
	}
	
	public static void main(String[] args) {
		
		String str = "vdsvoisvjoiejfwekojfo";
		
		findCharAndLEngth(str);
		
	}
	
}
