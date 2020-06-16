package com.sharnit.problems.array;

public class SecondSmallestElementInAnArray {

	
	public static int findSeconSmallest(int[] arr) {
		
		int secondSmallest = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		int arrLen = arr.length;
		
		for(int i = 0; i<arrLen ; i++) {
			
			if(arr[i] == min) {
				if(secondSmallest > min) {
					secondSmallest = min;
				}
			}/*else if(arr[i] > min) {
				if(secondSmallest > min) {
					secondSmallest = min;
				}
			}*/
			else if(arr[i] < min) {
				
				//if(secondSmallest > min) {
					secondSmallest = min;
				//}
				min = arr[i];
			}else if(arr[i] < secondSmallest) {
					secondSmallest = arr[i];
			}
		}
		
		return secondSmallest;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {21,12,35,4,25,6,7,18,9,};
		int smallestElement = findSeconSmallest(arr);
		
		
		System.out.println("smallest element : "+smallestElement);
		
	}
}
