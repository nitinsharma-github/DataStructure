package com.sharnit.problems.array;

public class RecursionArraySum {

	public static void printSum(int[] arr, int sum, int arrLen, int len) {

		if (len == arrLen) {
			System.out.println(" Sum : " + sum);
			return;
		}

		sum = sum + arr[len];
		++len;
		printSum(arr, sum, arrLen, len);
	}

	public static void printSum2(int[] arr, int sum, int arrLen) {

		if (arrLen == 0) {
			System.out.println("Sum " + sum);

		} else {

			sum = sum + arr[arrLen - 1];
			--arrLen;
			System.out.println("arrLen : " + arrLen);
			printSum2(arr, sum, arrLen);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		int arrLen = arr.length;
		int len = 0;

		printSum(arr, sum, arrLen, len);

		printSum2(arr, 0, arr.length);

	}

}
