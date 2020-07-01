package com.sharnit.problems.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestConsecutiveOccurance {

	public static int printLongestConsecutiveOccurance(int[] arr) {
		int maxRun = 1;
		int currentRun = 1;
		int asc = 0;
		for(int i = 0; i < arr.length-1; i++) {
			
			// descending run
			if(arr[i] - arr[i+1] == -1 && (asc <= 0)) {
				asc = -1;
				currentRun++;
			}
			// ascending run
			else if(arr[i] - arr[i+1] == 1 && (currentRun == 0 || asc >= 0)) {
				asc = 1;
				currentRun++;
			}
			else {
				// run is over
				if(currentRun > maxRun) {
					maxRun = currentRun;
				}
				currentRun = 1;
				asc = 0;
				
			}
		}
		if(currentRun > maxRun) {
			maxRun = currentRun;
		}
		return maxRun;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16 };

		int longest = printLongestConsecutiveOccurance(arr);
		
		System.out.println(".............."+longest);

	}
}
