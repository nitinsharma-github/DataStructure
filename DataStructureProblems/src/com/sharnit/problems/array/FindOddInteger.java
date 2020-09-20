package com.sharnit.problems.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindOddInteger {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,1,2,3,4,5,1,2,3};
		
		findOdd(arr);
		
	}
	
	
	public static void findOdd(int[] arr) {


		Set s = new HashSet();
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i] % 2 != 0) {
				s.add(arr[i]);
			}
			
		}
		
		System.out.println(" odd integers : "+Arrays.toString(s.toArray()));
		
		
	}
	
	
	public static void findOdd2(int[] arr) {
		HashMap<Integer, Integer> occurances = new HashMap<Integer, Integer>();
		for(int x: arr)
		{
			if(occurances.containsKey(x))
			{
				occurances.put(x, occurances.get(x)+1);
			}
			else
			{
				occurances.put(x,1);
			}
		}
		for(int x: occurances.keySet())
		{
			if(occurances.get(x) % 2 != 0)
			{
				System.out.println("odd integer : "+x);
			}
		}
		
	}
	
	
}
