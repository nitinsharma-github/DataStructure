package com.sharnit.problems.array;

import java.util.Arrays;

public class MoveTheZerosToTheEnd {

	public static void moveZerosToRight(int[] arr) {

		int arrLen = arr.length;

		int[] newArr = new int[arrLen];
		int j = arrLen - 1;

		for (int i = 0; i < arrLen; i++) {

			if (arr[i] == 0) {
				newArr[j] = 0;
				--j;
			}

		}

		int k = 0;
		for (int i = 0; i < arrLen; i++) {

			if (arr[i] != 0) {
				newArr[k] = arr[i];
				k++;
			}

		}

		System.out.println("old arrays is : " + Arrays.toString(arr));
		System.out.println("new arrays is : " + Arrays.toString(newArr));
	}

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 3, 5, 0, 4, 6, 0, 7, 9, 8, 0 };

		moveZerosToRight(arr);

	}
}
