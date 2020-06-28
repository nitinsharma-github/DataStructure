package com.sharnit.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class JavaDeclarationAndDefinations {

	public static void main(String[] args) {
		
	// Declare an Array
	char[] JavaCharArray_1;
	
	
	// Initializing Char Array
	char[] JavaCharArray_2 = new char[4];
	
	
	//loops in Array
	char[] JavaCharArray_3 = {'r', 's', 't', 'u', 'v'};
	
	for (char c:JavaCharArray_3) {
	System.out.println(c);
	}
	
	char[] JavaCharArray_4 = {'r', 's', 't', 'u', 'v'};
	for (int i=0; i<JavaCharArray_4.length; i++) {
	System.out.println(JavaCharArray_4[i]);
	}
	
	
	//Sorting a Char Array
	char[] JavaCharArray_5 = {'r', 't', 'u', 's', 'v'};
	Arrays.sort(JavaCharArray_5);
	System.out.println(Arrays.toString(JavaCharArray_5));
	
	
	
	// Converting A String Array Into Char Array
	String value = "hello";	
	char[] array = value.toCharArray();
	
	
	
	// 2d Array initialisation
	int[][] arr = {{5, 12, 17, 9, 3}, {13, 4, 8, 14, 1}, {9, 6, 3, 7, 21}};
	int[][] arr2 = { { 1, 2 }, { 3, 4 } }; 
	int[][] arr3 = new int[10][20];	
	char[][] arrayOfCharArray = { { 'b', 'a' }, { 'e', 'l', 'd', 'u' }, { 'n', 'g' } }; 
	
	
	//scanner
	Scanner in = new Scanner(System.in);
	String username = in.nextLine();
	int n = in.nextInt();
	
	//Array to ArrayList
	String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
	ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));
	

	//ArrayList to Array
	ArrayList<String> arrList = new ArrayList<String>();
	arrList.add("Python");
	arrList.add("Java");
	String[]  myArr = new String[arrList.size()];
	arrList.toArray(myArr);
	System.out.println("array elements "+Arrays.toString(myArr));
	
}
	
	
	// char array to String
	@Test
	public void whenStringConstructor_thenOK() {
	    final char[] charArray = { 'b', 'a', 'e', 'l', 'd', 'u', 'n', 'g' };
	    String string = new String(charArray);
	    // or
	    // String string = String.valueOf(charArray);
	    assertThat(string, is("baeldung"));
	}
	
	
	private static String nullOrEmpty(String value) {
	    return value == null || value.isEmpty() ? "invalid" : "valid";
	}
	// also, external libraries like Guava and numberutils can be used
	
	
	
	//MAP
	{
	String word = "mystring";
	int i = 0;
	Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	char[] characters = word.toCharArray();
	if(charMap.containsKey(characters[i])) {
		charMap.put(characters[i], charMap.get(characters[i])+1);
	}else{
		charMap.put(characters[i], 1);
	};
	
	Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
	for (Map.Entry<Character, Integer> entry : entrySet) 
	{ 
		if (entry.getValue() > 1) 
		       { 
			       System.out.printf("%s : %d %n", entry.getKey(), entry.getValue()); 
			    } 
	}
	
	
	// Set
	
	{
		Set<String> store = new HashSet<String>(); 
			
			if (store.add("element") == false) { 
				System.out.println("found a duplicate element in array : " + "element"); 
				} 
	}
	
	
	}
	
	
	//String:
	{
		
		//String str1 = "example.com", str2 = "Example.com";
	    //StringBuffer strbuf = new StringBuffer(str1);
		//str1.contentEquals(strbuf)
		//**************************************************
		
		
		{
			// Character array with data.
	        char[] arr_num = new char[] { '1', '2', '3', '4' };
	        String str = String.copyValueOf(arr_num, 1, 3);
	        
	        
	        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
	        String myStr2 = "";
	        myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
	        System.out.println("Returned String: " + myStr2);
	        
	        //string to char array
			char[] chars = str.toCharArray();
			System.out.println(chars.length);
			
			//char at specific index
			char c = str.charAt(2);
			System.out.println(c);
			
			//Copy string characters to char array
			char[] chars1 = new char[7];
			str.getChars(0, 7, chars1, 0);
			System.out.println(chars1);
			
			// Get the hash code for the above string.
	        int hash_code = str.hashCode();
			
		}
		
		{
			// boolean ends1 = str1.endsWith(end_str);
			// boolean equals1 = columnist1.equalsIgnoreCase(columnist2);
			// int a = str.indexOf("a", 0); // starts from index 0
			// int a = str.lastIndexOf("a", str.length() - 1);
			// int len = str.length();
			// String new_str = str.replace('d', 'f');
			// String new_str = str.replaceAll("Fox", "Cat");
			// boolean starts1 = str1.startsWith(startStr);
			// String new_str = str.substring(10, 26);
			// String lowerStr = str.toLowerCase();
			// String upper_str = str.toUpperCase();
			// String new_str = str.trim();
			// 
		}
		
		
		
	
		
		
	}
	
}
