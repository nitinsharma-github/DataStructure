package com.sharnit.problems.array;

import java.util.Arrays;

public class SecondSmallestElementInAnArray {

	
	public static int findSeconSmallest(int[] arr) {
		
		int secondSmallest = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		int arrLen = arr.length;
		
		for(int i = 0; i<arrLen ; i++) {
			
			if(arr[i] == min) {
				if(secondSmallest > min) {
					secondSmallest = min;
				}
			} else if(arr[i] < min) {
				secondSmallest = min;
				min = arr[i];
			}else if(arr[i] < secondSmallest) {
					secondSmallest = arr[i];
			}
		}
		
		return secondSmallest;
	}
	
public static int findSeconSmallest2(int[] arr, int n) {
		
		int counter = 1;
		Arrays.sort(arr);
		System.out.println(" Sorted Array : "+Arrays.toString(arr));
		
		for(int i = 0; i<arr.length ; i++) {
			
			if(arr[i+1] > arr[i]) {
				
				
				if(counter == n) {
				    System.out.println(n+ " smallest : "+arr[i]);
				    return arr[i];
				}
				
				++counter;
			}
			
		}
		
			return 0;
}
	
	public static void main(String[] args) {
		
		int[] arr = {21,12,35,4,25,6,7,18,9,};
		int secondSmallestElement = findSeconSmallest(arr);
		System.out.println("second smallest element : "+secondSmallestElement);
		
		int secondSmallestElement2 = findSeconSmallest2(arr, 2);
		System.out.println("second smallest element 2 : "+secondSmallestElement2);
		
	}
}
