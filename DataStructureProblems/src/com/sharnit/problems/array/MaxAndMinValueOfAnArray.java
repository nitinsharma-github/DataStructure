package com.sharnit.problems.array;

import java.util.Arrays;

public class MaxAndMinValueOfAnArray {

	public static void findMaxandMin(int[] arr) {
		
		int max = arr[0];
		int min = arr[0];
		int arrLen = arr.length;
		
		
		for(int i=0; i<arrLen ; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		findMaxandMin(arr);
		
	}
	
}



