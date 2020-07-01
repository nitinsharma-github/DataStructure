package com.sharnit.problems.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortContacts {

	
	public static String[] sortContacts(String[] arr, String sortBy) {
		ArrayList<String> aList = new ArrayList<String>();

		if (arr != null) {
				String[] result = new String[arr.length];
				
				aList.addAll(Arrays.asList(arr));
				
				Collections.sort(aList, nameComparator);

				if (sortBy.equals("DESC")) {
						Collections.reverse(aList);
				}
		}

		return aList.toArray(new String[aList.size()]);	
	}
	
	 public static Comparator nameComparator = new Comparator() {         
	       @Override         
	       public int compare(Object name1, Object name2) { 
	            String[] name1Parts = ((String)name1).split(" ");
	            String[] name2Parts = ((String)name2).split(" ");

	            return name1Parts[1].compareTo(name2Parts[1]);
	       }     
	     };  	
	
	public static void main(String[] args) {
		
		String[] str=  {
						  "John Locke",
						  "Thomas Aquinas",
						  "David Hume",
						  "Rene Descartes"
				  		};
		
		System.out.println( "***************"+ Arrays.toString(sortContacts(str , "AESC")));
		 
	}
}
