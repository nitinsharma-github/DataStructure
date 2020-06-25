package com.sharnit.problems.array;

public class FindPairWithExpectedSum {

	public static void printPairOfNumbers(int[] arr , int a) {
		
		boolean found = false;
		
		for(int i=0 ; i < arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if((arr[i] + arr[j]) == a) {
					
					System.out.println("pair : "+ arr[i] +" and "+ arr[j]);
					found = true;
				}
				
			}
		}
		if(!found) {
			
			System.out.println("not found");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int a = 12;
		printPairOfNumbers(arr , a);
		
	}
}
