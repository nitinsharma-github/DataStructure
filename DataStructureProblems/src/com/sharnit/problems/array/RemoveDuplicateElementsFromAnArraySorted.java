package com.sharnit.problems.array;

import java.util.Arrays;

public class RemoveDuplicateElementsFromAnArraySorted {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 20, 2, 20, 5, 6, 9, 5, 8, 7, 9 };

		Arrays.sort(arr);
		/*
		 * int index = 0; for(int i=0 ; i<arr.length; i++) {
		 * 
		 * if(arr[i] != arr[i+1]) {
		 * 
		 * }
		 * 
		 * }
		 */

		System.out.println("array : " + Arrays.toString(arr));
		
		int index = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[index - 1]){
				System.out.println("");
			System.out.println("");
			System.out.println("----------in---------------");
			System.out.println(" i " + i);
			System.out.println(" index " + index);
			System.out.println(" arr[i] " + arr[i]);
			System.out.println(" arr[index] " + arr[index]);
			System.out.println("---------------------------");
			System.out.println("---------------------------");
			System.out.println("array : " + Arrays.toString(arr));
			arr[index] = arr[i];
			++index;
			System.out.println("---------------------------");
			System.out.println("---------------------------");
			System.out.println(" arr[i] " + arr[i]);
			System.out.println(" arr[index] " + arr[index]);
			System.out.println("array : " + Arrays.toString(arr));
			System.out.println("----------out---------------");
			
			System.out.println("");
			System.out.println("");
			}
		}

		System.out.println("array : " + Arrays.toString(arr));
		System.out.println("index : " + index);


	/*	
		 int index = 1;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] != arr[index-1])
	            	arr[index++] = arr[i];
	        }
	        
	        System.out.println("array : " + Arrays.toString(arr));
	        System.out.println("index : " + index);*/
	}
}
