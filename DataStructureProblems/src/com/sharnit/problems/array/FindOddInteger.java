package com.sharnit.problems.array;

import java.util.HashMap;

public class FindOddInteger {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,1,2,3,4,5,1,2,3};
		
		findOdd(arr);
		
	}
	
	public static void findOdd(int[] arr) {
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
