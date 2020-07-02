package com.sharnit.problems.array;

public class ProductOfDigitsOfSum {

	// 22 42 -> 64
	// 6 *4 = 24
	// 2 * 4 = 8
	static void printProductOfDigitsOfSum(int a, int b) {
		
		int m = a + b;
		int d1 = m/10;
		int d2 = m%10;
		int sum = d1*d2;
		sum = getSum(d1, d2 , sum);
		System.out.println(" ********** sum ***********"+sum);
		
	}
	
	
	static int getSum(int d1 ,int d2, int sum) {
		
		System.out.println("before if"+d1+" "+d2);
		
		sum = d1*d2;
		
		if(sum>=10) {
			
			d1 = sum/10;
			d2 = sum%10;
		
			sum= getSum(d1,d2,sum);
		}
		System.out.println(" SUM "+ sum);
			return sum;
		
		
		
	}
	
	public static void main(String[] args) {
		
		printProductOfDigitsOfSum(22, 42);
	}
	
	
	
}
