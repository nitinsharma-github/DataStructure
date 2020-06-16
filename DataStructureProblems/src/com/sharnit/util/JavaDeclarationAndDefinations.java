package com.sharnit.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
	
	
	private static double parseStringToDouble(String value, double defaultValue) {
	    return value == null || value.isEmpty() ? defaultValue : Double.parseDouble(value);
	}
	// also, external libraries like Guava and numberutils can be used
	
	
	
}
