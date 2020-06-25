package com.sharnit.problems.array;

public class CommonElementsFromSortedArray {

	public static void findCommonElements(int[] arr1, int[] arr2, int[] arr3) {

		int arrLen1 = arr1.length;
		int arrLen2 = arr2.length;
		int arrLen3 = arr3.length;
		boolean b = false;

		for (int i = 0; i < arrLen1; i++) {

			for (int j = 0; j < arrLen2; j++) {

				for (int k = 0; k < arrLen3; k++) {

					if ((arr1[i] == arr2[j]) && (arr2[j] == arr3[k])) {

						System.out.println("Common elements is : " + arr1[i]);
						b = true;
					}
				}
			}
		}

		if (!b) {
			System.out.println("There is no common element.");
		}

	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int[] arr2 = { 2, 4, 6, 8, 10, 12 };
		int[] arr3 = { 3, 6, 9, 12 };

		findCommonElements(arr1, arr2, arr3);

	}
}
