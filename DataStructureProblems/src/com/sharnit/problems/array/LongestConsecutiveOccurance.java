package com.sharnit.problems.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestConsecutiveOccurance {

	public static int printLongestConsecutiveOccurance(int[] arr) {
		int counter=1;
		int highest=1;
		boolean asc=false;
	
		
		if(arr[0] < arr[1]){
			asc=true;
		} 
		
		//ascending
		for(int i=0;i<arr.length-1;i++){
					
			        if(asc && arr[i] + 1 == arr[i+1]){
						counter++;
						if(counter > highest){
							highest=counter;
							}
					}else{
						counter=1;
					}
		}
		
		//decending
		for(int i=0;i<arr.length-1;i++){
					if(!asc && arr[i] - 1 == arr[i+1]){
						counter++;
						if(counter > highest){highest=counter;}
					}else{
						counter=1;
					}
		}
		
		
		return highest;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16 };

		int longest = printLongestConsecutiveOccurance(arr);
		
		System.out.println(".............."+longest);

	}
}
