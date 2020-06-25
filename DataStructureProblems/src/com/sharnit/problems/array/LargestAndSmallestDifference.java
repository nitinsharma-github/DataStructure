package com.sharnit.problems.array;

import java.util.Arrays;

public class LargestAndSmallestDifference {

	public static void largestSmallestDifference(int[] arr) {
		
		int arrLen = arr.length;
		
		Arrays.sort(arr);
		
		int diff = arr[arrLen-1] - arr[0];
		
		System.out.println("difference : "+ arr[arrLen-1] +" - " +arr[0] +" = "+diff);
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {50,2,5,3,21,18,6,10,20,30};
		
		largestSmallestDifference(arr);
	
		
	}
}
