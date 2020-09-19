package com.sharnit.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyCalendarI {

	
	private static Map hashMap = null;
	
	public MyCalendarI() {
		hashMap = new HashMap<Integer, Integer>();
	}
	
	public static void main(String[] args) {
		MyCalendarI cal = new MyCalendarI();
		
		System.out.println("=>" + MyCalendarI.book(10, 15)); // T
		System.out.println("=>" + MyCalendarI.book(11, 16)); // F
		System.out.println("=>" + MyCalendarI.book(15, 18)); // F
		System.out.println("=>" + MyCalendarI.book(21, 23)); // T
		System.out.println("=>" + MyCalendarI.book(19, 21)); // F
		System.out.println("=>" + MyCalendarI.book(23, 17)); // T
	}
	
	
	 public static boolean book(int start, int end) {
		
		Boolean b = false;
		
		if(hashMap.size() == 0) {			
			hashMap.put(start, end);
			b= true;
			return b;
		}
		
		Set<Entry<Integer, Integer>> elements = hashMap.entrySet();
		
		for(Entry<Integer, Integer> element : elements) {
			
			if(element.getKey() >= start && element.getKey() < end) {
				b= false;
				return b;
			}
			if(element.getValue() >= start && element.getValue() < end) {
				b= false;
				return b;
			}
			if(element.getKey() == end) {
				b= false;
				return b;
			}
				hashMap.put(start, end);
				b= true;
				return b;
		}
				return b;
	    }
	
}


