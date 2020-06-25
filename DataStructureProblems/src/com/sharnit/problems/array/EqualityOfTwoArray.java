package com.sharnit.problems.array;

public class EqualityOfTwoArray {

	public static void compareArrays(int[] arr1, int[] arr2) {
		
		int arrLen1 = arr1.length;
		int arrLen2 = arr2.length;
		boolean b = true;
		
		if(arrLen1 != arrLen2) {
			
			System.out.println("Arrays length are not equal");
			
		}else {
			
			for(int i=0 ; i<arrLen1 ; i++) {
				
			if (arr1[i] != arr2[i]) {
				
				b = false;
				
			}
				
			}
			
			if(b) {
				System.out.println("Arrays are equal");
			}else {
				System.out.println("Arrays are not equal");
			}
			
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = {1,2,3,4,5,6,7,8,9};
		
		int[] arr3 = {1,2,3,4,5,6,7,8,9};
		int[] arr4 = {1,2,3,4,5,6,7,8,0};
		
		int[] arr5 = {1,2,3,4,5,6,7,8,9};
		int[] arr6 = {1,2,3,4,5,6,7,8,9,0};
		
		compareArrays(arr1 , arr2);
		System.out.println("======================");
		compareArrays(arr3 , arr4);
		System.out.println("======================");
		compareArrays(arr5 , arr6);
		
	}
	
}
