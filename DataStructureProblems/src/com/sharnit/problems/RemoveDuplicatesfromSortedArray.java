package com.sharnit.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,1,2,3,4,4,4,5,6,7,7,8,8,9,9};
		
		removeDuplicate(arr);
		
		System.out.println(" Result "+Arrays.toString(arr));
	}
	
	public static void removeDuplicate(int[] nums) {
		
		 int i = 0;
		 
		for(int j=0 ; j<nums.length ; j++) {
			
		if(nums[i] == nums [j]) {
			
			continue;
			
			
		}else {
			
			nums[i+1] = nums[j];
			++i;
			
			
		}
			
		}
		
	}
}
