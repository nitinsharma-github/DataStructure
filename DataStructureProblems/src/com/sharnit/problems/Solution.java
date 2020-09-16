package com.sharnit.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    
    
    public static void twoSum(int[] nums, int target) {
            
    	
    	int[][] da = new int[10][2];
    	int k = 0;
    	
    	List<int[]> l = new ArrayList<int[]>();
    	 
    	 
        for(int i=0; i<(nums.length)-1; ++i){
            
           for(int j=i+1 ; j<(nums.length)-1; ++j){
               
        	  
               if(target == (nums[i]+nums[j])){
                   
                   System.out.println( nums[i] +" , "+nums[j]);
                    da[k][0] = nums[i];
                    da[k][1] = nums[j];
                    ++k;
                    
                    
                    l.add(new int[] {nums[i], nums[j]});
               }
               
           }    
            
        }
        System.out.println("*****************");
        System.out.println(Arrays.toString(da[0]));         
        System.out.println(Arrays.toString(da[1]));
        
        System.out.println("*****************");
        
        for(int[] array : l) {
        	   System.out.println(Arrays.toString(array));
        	}
        System.out.println("*****************");

        
     	   System.out.println(Arrays.toString(l.get(0)));
     	   System.out.println(l.get(0)[1]);

        
       
           System.out.println("*****************");
        
        int[] arr =  new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        
                 
        
    }
    
    public static void main(String[] args){
        
        int[] nums = {21,23,27,26,5,6,8,9,31,22,5};
        int target = 53;
        
        twoSum(nums, target);
        
      
        
    }
}