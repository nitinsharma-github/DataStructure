package com.sharnit.problems;

import java.util.Arrays;
import java.util.Stack;

public class BasicCalculatorII {

	 public static int calculate(String s) {
	        s = s.trim().replaceAll(" ","");
	        String[] nums = s.split("[\\+\\-\\*/]");
	        System.out.println(Arrays.toString(nums));
	        String[] ops = s.split("[\\d]+");
	        System.out.println(Arrays.toString(ops));
	        
	        Stack<Integer> numsStack = new Stack<Integer>();
	        numsStack.push(Integer.parseInt(nums[0]));

	        for (int i = 1; i < ops.length; i ++) {
	            int curr = Integer.parseInt(nums[i]);
	            if (ops[i].equals("*")) {
	                curr = numsStack.pop() * curr;
	            }
	            if (ops[i].equals("/")) {
	                curr = numsStack.pop() / curr;
	            }
	            if (ops[i].equals("-")){
	                curr = -curr;
	            }
	            if (ops[i].equals("+")){
	                curr = curr;
	            }
	            numsStack.push(curr);
	        }
	        
	        
	        int result = 0;
	        while (numsStack.size() > 0) {
	            result += numsStack.pop();
	        }
	        return result;
	    }
	 
	 public static void main(String[] args) {
		 
		 int result = calculate("1+20-1+6*2");
		 
		 System.out.println(" result "+ result);
	 }
}
