package com.sharnit.problems.string;

import java.util.ArrayList;

public class FirstNonRepeatingChar {

	static void printFirstNonRepeatingWord(String str) {

		int strLen = str.length();
		int index = -1;
		ArrayList<Character> al = new ArrayList<Character>();

		for (int i = 0; i < strLen; i++) {

			if (!al.contains((Character) str.charAt(i))) {

				for (int j = i + 1; j < strLen; j++) {

					if (str.charAt(i) == str.charAt(j)) {
						al.add(str.charAt(i));
						break;
					}
					if (j == (strLen - 1)) {
						index = i;
						System.out.println("index : " + i);
					}
				}
			}

			if (index != -1) {
				break;
			}
		}

		System.out.println("First char : " + str.charAt(index));

	}

	public static void main(String[] args) {

		String str = "djdfpwjfwnvwjfwjefwjefpvsuivhs";

		printFirstNonRepeatingWord(str);

	}
}
