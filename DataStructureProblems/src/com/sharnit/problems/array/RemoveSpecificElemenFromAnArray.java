package com.sharnit.problems.array;

import java.util.Arrays;

public class RemoveSpecificElemenFromAnArray {

	public static int[] removeElement(int[] arr, int a) {

		if (arr == null) {

			System.out.println("You can not pass a null array.");
			return arr;
		}

		int arrayLen = arr.length;

		// find the index of element
		int index = -1;

		for (int i = 0; i < arrayLen; i++) {

			if (a == arr[i]) {
				index = i;
				break;
			}

		}

		for (int i = index; i <= arrayLen - 1; i++) {

			arr[i] = arr[i + 1];

			if (i == (arrayLen - 2)) {
				arr[i + 1] = -1;
				break;
			}
		}

		System.out.println(".........array.......... : " + Arrays.toString(arr));
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int a = 5;

		arr = removeElement(arr, a);
		System.out.println(".........array.......... | " + Arrays.toString(arr));
	}

}
