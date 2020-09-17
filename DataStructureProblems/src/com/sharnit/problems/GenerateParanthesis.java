//https://www.youtube.com/watch?v=N-3fyoKD8-k

package com.sharnit.problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

	
	public static void main(String[] args ) {
		
		ArrayList<String> al = new ArrayList<String>();
		int totalOpenPerenthesis = 3;
		String s = "";
		int open = 0;
		int close = 0;
		
		findTotalCombinations(al, s, open, close, totalOpenPerenthesis);
		
		System.out.println("Result : "+al.toString());
		
	}
	
	public static void findTotalCombinations(ArrayList a, String s, int open, int close, int p) {
		
		if(s.length() == p*2) {
			a.add(s);
			return;
		}
		
		if(open < p) {
			findTotalCombinations(a, s+"(", open+1, close, p );
						
		}
		
		if(close < open){
			findTotalCombinations(a, s+")", open, close+1, p );
			
			
		}
		
	}
	
} 
