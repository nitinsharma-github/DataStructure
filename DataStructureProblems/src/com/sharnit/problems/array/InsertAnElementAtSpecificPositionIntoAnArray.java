package com.sharnit.problems.array;

import java.util.Arrays;

public class InsertAnElementAtSpecificPositionIntoAnArray {

	public static void insertElement(int[] arr , int a, int index) {
		
		int arrayLen = arr.length;
		
		// increase size of array by 1
		arr = Arrays.copyOf(arr, (arrayLen+1));
		
		for(int i = (arr.length-1); i>index; i--) {
			
			arr[i] = arr[i-1];
			
		}
		
		arr[index] = a;
		
		System.out.println(".......................array................... "+Arrays.toString(arr));
		
	}
	
	
	public static void main (String[] args) {
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		insertElement(arr, 21, 5);
	}
	
	
}
