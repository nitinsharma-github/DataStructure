package com.sharnit.problems.array;

public class FindEvenAndOddInteger {


	public static void findEvenAndOdd(int[] arr) {
		
		int arrLen = arr.length;
		
		String even = "";
		String odd = "";
		
		for(int i=0; i<arrLen ; i++) {
			
			if(arr[i]%2==0) {
				even = even+ " "+arr[i] + " ";
			}else {
				odd = odd+ " "+arr[i] + " ";
			}
			
		}
		
		System.out.println("even : "+even.trim());
		System.out.println("odd  : "+odd.trim());
		
	}



	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,20,30,21,18};
		
		findEvenAndOdd(arr);
		
	}

}
