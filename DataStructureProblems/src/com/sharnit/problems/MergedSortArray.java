//https://terriblewhiteboard.com/merge-sorted-array-leetcode-88/

package com.sharnit.problems;

import java.util.Arrays;

public class MergedSortArray {

	
	
	  public static void main(String[] args) {
		  
		  int[] arr1 = new int[] {1,2,3,6,8,9,0,0,0,0};
		  int[] arr2 = new int[] {2,5,7,9};
		  
		  arr1 = merge(arr1, 6, arr2, 4);
		  
		  System.out.println(Arrays.toString(arr1));
		  
	  }
	  public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
	        int first = m - 1;
	        int second = n - 1;
	        
	        for (int i = nums1.length - 1; i >= 0; i--) {
	            if (second < 0) {
	                return nums1;
	            }
	        
	            if (first >= 0 && nums1[first] > nums2[second]) {
	                nums1[i] = nums1[first];
	                first--;
	            } else {
	                nums1[i] = nums2[second];
	                second--;
	            }
	        }
	        
	        return nums1;
	    }
	
}
