package com.sharnit.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sum3 {
	
	public static void main(String[] args) {
		
		int[] nums = {-1,0,1,2,-1,-4};
		int len = nums.length;
		Set<String> set = new HashSet<String>();
		
		
		for(int i = 0 ; i<len ; i++) {
		
			for(int j = i+1; j<len ; j++) {
				
				for(int k = j+1; k<len; k++) {
					
					if(nums[i]+nums[j]+nums[k] == 0) {
						
						int[] arrTemp = new int[] {nums[i],nums[j],nums[k]};
						
						Arrays.sort(arrTemp);
						
						set.add(arrTemp[0]+","+arrTemp[1]+","+arrTemp[2]);

					}
					
				}
				
			}
		}
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
	}
}
