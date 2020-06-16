package com.sharnit.problems.array;

public class SumValuesOfAnArray {

	public static void sumArrayValues(int[] arr) {
		
		if(arr == null) {
			
			System.out.println("this is a null array");
			return;
		}
		
		int arrayLen = arr.length;
		int sum = 0;
		
		
		for(int i = 0; i<arrayLen ; i++)
		{
			sum += arr[i];
		}
		
		System.out.println("Array sum : "+sum);
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		sumArrayValues(null);
		sumArrayValues(arr);
		
	}
	
}
