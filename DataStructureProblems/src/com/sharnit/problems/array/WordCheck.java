package com.sharnit.problems.array;

public class WordCheck {

	public static boolean canBuild(String[] arr) {
		for (int i=0; i< arr.length -1; i++) {
			String word1 = arr[i];
			String word2 = arr[i+1];
			if (word2.length() - word1.length() != 1) {
				return false;
			}
			int index = word2.indexOf(word1);
			if (index == -1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String[] arr = {"a", "at", "ate", "late", "plate", "plates"};
		String[] arr1 = {"a", "at", "ate", "late", "plate", "plater", "platter"};
		
		System.out.println("******************** "+ canBuild(arr));
		System.out.println("******************** "+ canBuild(arr1));
	}
	
}
