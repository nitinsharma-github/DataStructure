package com.sharnit.problems;

import java.util.Arrays;

public class AddNumbers {

	public static void addTheseNumbers(int[][] arr) {
		
		
		String[] strArray = new String[arr.length];
		int k = 0;
		
		for(int i=0; i<arr.length ; i++) {
			
			strArray[k] = "";
			for(int j=arr[i].length-1; j>=0; j--) {
				strArray[k] += arr[i][j]+"";
			}
			++k;
		}
		
		
		int sum = Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[1]);
		
		System.out.println("Given Array : "+ Arrays.deepToString(arr));
		System.out.println("integer 1 : "+ Integer.parseInt(strArray[0]));
		System.out.println("integer 2 : "+ Integer.parseInt(strArray[1]));
		System.out.println("Sum : "+ sum);
		
	}
	
	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{2,3,5},{6,5,7}};		
		addTheseNumbers(arr);		
		
	}
}
