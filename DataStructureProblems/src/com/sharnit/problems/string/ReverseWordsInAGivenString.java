package com.sharnit.problems.string;

public class ReverseWordsInAGivenString {

	public static void printReverseWords(String str) {

		StringBuilder sb = new StringBuilder();
		String[] strArray = str.split(" ");

		for (int i = strArray.length - 1; i >= 0; i--) {

			sb.append(strArray[i] + " ");

		}

		System.out.println("New reversed words String : " + sb.toString());

	}

	public static void printReverseWordAndStrings(String str) {

		StringBuilder sb = new StringBuilder();
		String[] strArray = str.split(" ");

		for (int i = strArray.length - 1; i >= 0; i--) {

			sb.append(reverseString(strArray[i]) + " ");

		}

		System.out.println("New reversed words String : " + sb.toString());

	}

	static String reverseString(String str) {

		char[] charArray = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {

			sb.append(charArray[i]);

		}

		return sb.toString();

	}

	public static void main(String[] args) {

		String str = "India is my country";

		printReverseWords(str);
		printReverseWordAndStrings(str);
	}
}
