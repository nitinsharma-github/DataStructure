package com.sharnit.problems.array;

public class DuplicateValuesOfAnArrayOfInteger {

public static void duplicateElement(int[] arr) {
	
	String dups = "";
	int arrLength = arr.length;
	
	for(int i=0; i<arrLength; i++) {
		
		for(int j=(i+1); j<(arrLength); j++) {
			System.out.println(arr[i] +"=="+ arr[j]);
			if(arr[i] == arr[j]) {
				
				dups = dups + arr[i] +" , " ;
			}
			
		}
		
	}
	
	System.out.println("...........Dups......... "+dups);
	
	
}
	
public static void main (String[] args) {
			
		int[] arr = {1,2,4,2,5,6,6,8,9};
		
		duplicateElement(arr);
	}
}
