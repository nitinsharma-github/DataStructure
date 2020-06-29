package com.sharnit.problems.string;

import java.util.Arrays;

public class ReverseAStringUsingRecursion {

	static void reverseString(String str) {

		StringBuilder sb = new StringBuilder();
		char[] charArray = str.toCharArray();

		for (int i = charArray.length - 1; i >= 0; --i) {

			sb.append(charArray[i]);

		}

		System.out.println("Reversed String : " + sb.toString());

	}

	static void reverseStringUsingRecursion(String str, char[] charArray, int len, int i) {

		if (len == 0) {
			System.out.println("Reverse String using Recursion : " + String.valueOf(charArray));
			return;
		}

		charArray[i] = str.charAt(len - 1);
		System.out.println("input String : " + charArray[i]);
		++i;
		--len;

		reverseStringUsingRecursion(str, charArray, len, i);

	}

	public static void main(String[] args) {

		String str = "I Love My India";
		char[] charArray = str.toCharArray();
		reverseString(str);
		reverseStringUsingRecursion(str, charArray, str.length(), 0);

	}
}
