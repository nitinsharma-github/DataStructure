package com.sharnit.problems.array;

public class ReverseString {

	public static void reverseThisString(String str) {

		if (isNullOrEmpty(str)) {
			System.out.println("please don't try null or empty string");
			return;
		}

		if (str.length() == 1) {
			System.out.println("enter string more than 1 char");
			return;
		}

		char[] charArray = new char[str.length()];

		for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
			charArray[i] = str.charAt(j);
		}

		System.out.println("String Array : " + new String(charArray));

	}

	public static boolean isNullOrEmpty(String str) {

		if (str == null || str.equals("") || str.trim().equals("")) {
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
