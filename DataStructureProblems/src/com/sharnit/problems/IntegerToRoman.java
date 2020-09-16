package com.sharnit.problems;

public class IntegerToRoman {
	
	public static void main(String[] args) {
		
		String[] units = {"", "I", "II", "III", "IV", "V", "VI" , "VII", "VIII", "IX"};
		String[] tens  = {"", "X", "XX","XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] hundeads  = {"", "C", "CC","CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] thousands  = {"", "M", "MM","MMM"};
		
		int num = 3294;
		
		String roman = thousands[num/1000]+
				       hundeads[(num%1000)/100]+
				       tens[(num%100)/10]+
				       units[num%10];
		
		System.out.println("roman : "+roman);
		
	}
	

}

/*
 * 
 * class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                    result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
                } else {
                    result += map.get(s.charAt(i));
                }
            }
            return result;
    }
}
 */



