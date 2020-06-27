package com.sharnit.problems.string;

public class CompareTwoStringsLexicographically {

	// compareTo or compareToIgnoreCase

	public static void compareString(String s1, String s2) {

		if (s1.compareTo(s2) > 0) {
			System.out.println(s1 + " is greater than " + s2);
		} else if (s1.compareTo(s2) < 0) {
			System.out.println(s1 + " is lesser than " + s2);
		} else {
			System.out.println(s1 + " is equal to" + s2);
		}

	}

	public static void main(String[] str) {

		String s1 = "I love my India /\";
		String s2 = "I love my Country";

		compareString(s1, s2);

	}

}
