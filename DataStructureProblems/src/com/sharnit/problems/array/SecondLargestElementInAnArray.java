package com.sharnit.problems.array;

import java.util.Arrays;

public class SecondLargestElementInAnArray {

	public static void secondLargestElement(int[] arr, int n) {
		
		Arrays.sort(arr);
		System.out.println(" Sorted Array : "+Arrays.toString(arr));
		System.out.println(" Second largest : "+arr[arr.length-n]);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,21,3,4,5,6,7,8,9};
		secondLargestElement(arr , 2);
	}
}
