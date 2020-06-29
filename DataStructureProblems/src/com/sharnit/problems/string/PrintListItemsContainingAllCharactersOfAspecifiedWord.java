package com.sharnit.problems.string;

import java.util.ArrayList;
import java.util.Arrays;

// not right program

public class PrintListItemsContainingAllCharactersOfAspecifiedWord {

	
		static void printStrings(String str1, String str_to_search) {
			  int chk = 0;
			  char chhr = ' ';
			  int[] a = new int[Character.MAX_VALUE + 1];

			  System.out.println("Character max value"+(int)Character.MAX_VALUE); // 65535
			  
			  //System.out.println("in arraya "+Arrays.toString(a));
			  for (int i = 0; i < str1.length(); i++) {
			   chhr = str1.charAt(i);
			   System.out.println("************* "+chhr);
			   System.out.println("************* "+a[chhr]);
			   ++a[chhr];
			   System.out.println("************* "+a[chhr]);
			   System.out.println("********************************************* ");
			  }
			  for (int i = 0; i < str_to_search.length(); i++) {
			   chhr = str_to_search.charAt(i);
			   if (a[chhr] >= 1)
			    chk = 1;
			  }
			  if (chk == 1)
			   System.out.println(str1);
			   
			 }
	
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>() ;
		
		//al.add("India");
		//al.add("Australia");
		//al.add("Sydney");
		//al.add("Melbourne");
		//al.add("Delhi");
		al.add("Haldwani");
		
		String str = "ih";
		
		for(int i=0; i<al.size(); i++) {
			printStrings(al.get(i), str);
		}
		
		
		
	}
}
