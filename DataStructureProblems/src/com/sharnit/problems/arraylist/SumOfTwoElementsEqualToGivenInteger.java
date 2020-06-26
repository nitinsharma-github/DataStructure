package com.sharnit.problems.arraylist;

import java.util.ArrayList;

public class SumOfTwoElementsEqualToGivenInteger {

	public static void findTwoNumbers(ArrayList al , int a) {
		
		for(int i=0; i<al.size() ; i++) {
			
			for(int j=i+1 ; j<al.size(); j++) {
				
				int m = ((Integer)(al.get(i))).intValue();
				int n = ((Integer)(al.get(j))).intValue();
				
				if((m+n) == a) {
				
					System.out.println(" numbers are " + m +","+n +" at index "+i+ " and "+j);
				}
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(21);
		al.add(5);
		al.add(10);
		al.add(2);
		al.add(51);
		al.add(41);
		al.add(31);
		al.add(71);
		
		int a = 92;
		
		findTwoNumbers(al, a);
		
	}
}
