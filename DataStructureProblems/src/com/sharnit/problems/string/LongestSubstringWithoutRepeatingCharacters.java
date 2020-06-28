package com.sharnit.problems.string;

public class LongestSubstringWithoutRepeatingCharacters {

	static void printLongestSubstringWithoutRepeatingCharacters(String str) {
	
		String newSubStr = "";
		boolean b = true;
		
		for(int i=0; i<str.length()-1; i++){
			
			for(int j=i+1; j<str.length()-1; j++) {
				
				b = doesStringIsHavingRepeatedChar(str.substring(i,j));
			
				if(b) {
					break;
				}else {
					if(str.substring(i,j).length() > newSubStr.length())
						newSubStr = str.substring(i,j);
				}
			
			}
			}
		
		System.out.println("...........SubString............. "+ newSubStr);
	}

	static boolean doesStringIsHavingRepeatedChar(String str) {

		boolean b = false;

		for (int i = 0; i < str.length() - 1; i++) {

			for (int j = i + 1; j < str.length() - 1; j++) {

				if (str.charAt(i) == str.charAt(j)) {

					b = true;
					break;
				}
				if(b)
				  break;
			}
		}
		return b;
	}

	
	public static void main(String[] args) {
		String str = "afhroiqjgvrejvvkgkbgjsdfgjagkvflanldnakgjfkmbajadjbmadbmnfafkrjgfangfngbfdma";
		printLongestSubstringWithoutRepeatingCharacters(str);
	}

}
