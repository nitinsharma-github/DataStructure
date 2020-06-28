package com.sharnit.problems.string;

public class RemoveDuplicatesFromAGivenString {

	static void printRemoveDuplicatesFromAGivenString(String str) {
		
		char[] charArray = str.toCharArray();
		StringBuffer sb = new StringBuffer(charArray[0]);
		
		
		// first method
		for(int i = 0; i<charArray.length ; i++) {
			boolean b = false;
			for(int j = i+1; j<charArray.length ; j++) {
				
				if(charArray[i] == charArray[j]) {
					
					b = true;
				}
			}
			
			if(!b) {
				sb = sb.append(charArray[i]);
			}
		}
		
		System.out.println(".............."+sb.toString());
		
		
		// second method (better one)
		String targetString = "";
		
		for(int i=0; i<charArray.length-1; i++) {
			
			if(targetString.indexOf(charArray[i]) == -1) {
				
				targetString += charArray[i];
			}
			
		}
		
		System.out.println("............. "+ targetString);
		
		
		
	}
	
	public static void main(String[] args) {
		
		String str = "lreagglaejpaejsknkmkmmfdmmglgsmlkdlbnklbnltn";
		
		printRemoveDuplicatesFromAGivenString(str);
		
	}
	
	
	
}
