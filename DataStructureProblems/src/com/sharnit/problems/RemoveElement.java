package com.sharnit.problems;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		
		int[] arr = {3,2,2,3};
		int a = 3;
		int[] arrUpddated = removeElement(arr, a);
		
		System.out.println("arr  : "+Arrays.toString(arr));
		System.out.println("arr  : "+Arrays.toString(arrUpddated));
		
	}
	
	
	public static int[] removeElement(int[] arr, int a) {
		
		int l = arr.length;
		
		int valid_size = 0;
		
		for(int i = 0 ; i<l ;i++) {
			
			if(arr[i] != a) {
				arr[valid_size] = arr[i];
			
				valid_size++;
			}
		}
		return Arrays.copyOf(arr, valid_size);
	}
}
