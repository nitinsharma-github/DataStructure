package com.sharnit.problems.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnIntegerArrayFromAlphaNumericArray {

	public static void main(String[] args) {

		String[] arr = { "1", "2", "a", "6", "7", "b", "8", "9" };
		String[] arr1 = findIntArray(arr);

		System.out.println("..... " + Arrays.toString(arr1));

	}

	public static String[] findIntArray(String[] str) {
		ArrayList<String> out = new ArrayList<String>();
		for (String i : str) {
			try {
				Integer.parseInt(i); // this will throw an exception in case  String
				if (!out.contains(i)) {
					out.add(i);
				}
			} catch (NumberFormatException e) {

			}
		}
		return out.toArray(new String[out.size()]);
	}

}
