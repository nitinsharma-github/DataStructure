package com.sharnit.problems.string;

//Write a Java program to find longest Palindromic Substring within a string
public class LongestPalindromicSubstring {

	public static void printLongestPalindrom(String str) {

		int maxLength = 0;
		boolean b = false;
		String longestPalindrom = "";

		if (isPalindrom(str)) {
			longestPalindrom = str;			
		} else {
			for (int i = 0; i < str.length() - 1; i++) {

				for (int j = str.length() - 1; i < j; j--) {

					String s = str.substring(i, j);

					b = isPalindrom(s);

					if (b) {
						if (s.length() > maxLength) {
							maxLength = s.length();
							longestPalindrom = s;
							//System.out.println(" one of longest palindrom " + longestPalindrom);
							break;
						}
					}
					
				}

			}
		}
		System.out.println("Longest Palindrom " + longestPalindrom);

	}

	static boolean isPalindrom(String s) {

		boolean b = true;
		char[] charArr = s.toCharArray();

		for (int i = 0, j = charArr.length - 1; i <= j; i++, j--) {
			if (charArr[i] != charArr[j]) {
				b = false;
			}

		}
		
		return b;

	}

	public static void main(String[] args) {

		String str = "thequickbrownfoxxofnworbquickthe";
		printLongestPalindrom(str);

		str = "NitiN";
		printLongestPalindrom(str);
	}
}
