package com.sharnit.problems.array;

public class RemoveTheLettersInTheStringFromTheArray {

	static void removeChars(String str, char[] arr) {

		StringBuilder sb = new StringBuilder(str);
		int counter = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < str.length() - counter; ++j) {
				System.out.println(" j : " + j + " " + sb.charAt(j));
				if (sb.charAt(j) == arr[i]) {

					System.out.println(" before deletion  " + sb.charAt(j) + "  " + arr[i]);
					sb = sb.deleteCharAt(j);
					System.out.println(" sb after deletion : " + sb.toString());
					++counter;
					--j;
				}
			}
		}

		System.out.println("********* updated String **********" + sb.toString());
	}

	public static void main(String[] args) {

		char[] arr = { 'e', 'l', 'n' };
		String str = "england";

		removeChars(str, arr);
	}
}
