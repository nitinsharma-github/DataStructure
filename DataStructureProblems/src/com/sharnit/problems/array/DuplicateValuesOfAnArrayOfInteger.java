package com.sharnit.problems.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValuesOfAnArrayOfInteger {

public static void duplicateElement(int[] arr) {
	
	
	//for (String name : names) { Integer count = nameAndCount.get(name); if (count == null) { nameAndCount.put(name, 1); } else { nameAndCount.put(name, ++count); } } // Print duplicate elements from array in Java Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet(); for (Entry<String, Integer> entry : entrySet) { if (entry.getValue() > 1) { System.out.printf("duplicate element '%s' and count '%d' :", entry.getKey(), entry.getValue()); } }


	Set set = new HashSet();
	
	for(int i=0; i<arr.length ; i++) {
		
		//if(!set.contains(arr[i]+""))
		if(set.add((arr[i]+"")) == false)
			System.out.println("dup element : "+ arr[i]);
	}
	
	 
	 /*
	String dups = "";
	int arrLength = arr.length;
	
	for(int i=0; i<arrLength; i++) {
		
		for(int j=(i+1); j<(arrLength); j++) {
			System.out.println(arr[i] +"=="+ arr[j]);
			if((arr[i] == arr[j]) && (i!=j)) {
				
				dups = dups + arr[i] +" , " ;
			}
			
		}
		
	}
	
	System.out.println("...........Dups......... "+dups);
	*/
	
}
	
public static void main (String[] args) {
			
		int[] arr = {1,2,4,2,5,6,6,8,9,9,9,9,9};
		
		duplicateElement(arr);
	}
}
