package com.sharnit.problems;

public class LongestPallendrome {

	public static void main(String[] args) {

		String str = "mynnnnameisnitinandwhatisyoursthequickbrownfoxxofnworbquickthe";

		int len = str.length();
		char[] strArray = str.toCharArray();

		String sub = "";
		int subLen = 0;
		boolean b = false;
		for (int i = 0; i < len - 1; i++) {
			for (int j = len - 1; j > i; j--) {
				
				String subInner = str.substring(i, j);
				System.out.println("subinner : " + subInner);
				b = isPAllendrone(subInner);
				
				if (b) {
					if (subInner.length() > sub.length())
						sub = subInner;
				}
			}
		}

		System.out.println("Result : " + sub);

	}

	public static boolean isPAllendrone(String str) {

		boolean b = true;
		int len = str.length();
		char[] strArray = str.toCharArray();

		for (int i = 0, j = len - 1; i < j; i++, j--) {

			if (strArray[i] != strArray[j]) {
				b = false;
				return b;
			}
		}
		return b;

	}
}
