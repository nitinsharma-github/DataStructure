package com.sharnit.problems.array;

import java.util.Arrays;

public class SecondLargestElementInAnArray {

	public static void secondLargestElement(int[] arr, int n) {
		
		int counter = 1;
		Arrays.sort(arr);
		System.out.println(" Sorted Array : "+Arrays.toString(arr));
		
		for(int i = arr.length-1; i>=0 ; i--) {
			
			if(arr[i] > arr[i-1]) {
				
				
				if(counter == n) {
				    System.out.println(n+ " largest : "+arr[i]);
				    break;
				}
				
				++counter;
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,21,3,4,5,6,7,8,9,9,21};
		secondLargestElement(arr , 3);
	}
}
