package com.sharnit.problems.string;

import java.util.Arrays;

public class SingleLetterSwapsAndAnagram {

	public static boolean checkAnagram(String s1, String s2)
    {
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return (Arrays.equals(arr1, arr2));
    }

    public static boolean checkSwap(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }
        int diffs = 0;
        for(int i=0; i<word1.length(); i++){
            if(word1.charAt(i) != word2.charAt(i)){
                diffs++;
            }
        }
        if(diffs == 0){
            return true;
        }
        if(diffs != 2){
            return false;
        }
        return checkAnagram(word1, word2);
    }

    public static boolean[] validateSwaps(String[] arr, String str) {
        boolean[] ans = new boolean[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = checkSwap(arr[i], str);
        }
        return ans;
    }
    
    public static void main(String[] args) {
    	
    	String[] arr = {"BACDE", "EBCDA", "BCDEA", "ACBED"};
    	boolean[] b = validateSwaps(arr, "ABCDE");
    	System.out.println("*********** "+ Arrays.toString(b));
    	
    }
    
}
