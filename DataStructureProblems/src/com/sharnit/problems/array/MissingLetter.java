package com.sharnit.problems.array;

public class MissingLetter {

	// {"a","b","c","e","g","i"}

	public static String missingLetters2(String[] arr) {
		String tmp = "";
		String str = "";
		for (String s : arr) {
			tmp += s;
		}
		System.out.println("tmp.......... " + tmp);
		for (int i = 1; i < tmp.length(); i++) {
			System.out.println("tmp.charAt(i).......... " + tmp.charAt(i));
			System.out.println("tmp.charAt(i-1)+1.......... " + (tmp.charAt(i - 1) + 1));
			if (tmp.charAt(i) != tmp.charAt(i - 1) + 1) {
				int j = tmp.charAt(i - 1) + 1;
				str = str + String.valueOf((char) j);
			}
		}
		return str;
	}

	public static void main(String[] args) {


		String[] strArr = { "a", "b", "c", "e", "g", "i" };
		System.out.println("Missing String " + missingLetters2(strArr));
	}

}
