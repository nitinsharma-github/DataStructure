package com.sharnit.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeadianOfArrays {

	public static void findMedian(int[] arr){
		
		int len = arr.length;
	
		double median = 0.0;
		
		if (len%2 == 0) {
			System.out.println("1 : "+arr[len/2-1]);
			System.out.println("2 : "+arr[len/2]);
			median = (arr[len/2-1]+arr[len/2])/2.0;
		}else {
			median = arr[(len+1)/2-1];
		}
		
		System.out.println("median : "+median);
	
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,5};
		int[] arr2 = {3,4};
		int[] arr = mergeArrays(arr1, arr2);
		findMedian(arr);
	}
	
	public static int[] mergeArrays(int[] firstArray, int[] secondArray) {
		
		 
		int length = firstArray.length + secondArray.length; //add the length of firstArray into secondArray  
		int[] mergedArray = new int[length];    //resultant array  
		int pos = 0;  
		for (int element : firstArray) //copying elements of secondArray using for-each loop  
		{  
		mergedArray[pos] = element;  
		pos++;              //increases position by 1  
		}  
		for (int element : secondArray) //copying elements of firstArray using for-each loop  
		{  
		mergedArray[pos] = element;  
		pos++;  
		}  
		System.out.println(Arrays.toString(mergedArray));   //prints the resultant array  
		
		return mergedArray;
	}  
	

}
