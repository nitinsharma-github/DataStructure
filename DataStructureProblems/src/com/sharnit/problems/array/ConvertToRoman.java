package com.sharnit.problems.array;

public class ConvertToRoman {

	public static String convertThisNumberToRoman(int num) {
        String m[] = {"", "M", "MM", "MMM"}; 
        String c[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; 
        String x[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}; 
        String i[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; 
               
        String thousands = m[num/1000]; 
        String hundereds = c[(num/1000)/100];
        String tens = x[(num/100)/10]; 
        String ones = i[num%10]; 
        String result = thousands + hundereds + tens + ones; 
        return result;
	}
	
	public static void main(String[] str) {
		
		String roman = convertThisNumberToRoman(95);
		
		System.out.println(" roman number : "+roman);
	}
	
}
