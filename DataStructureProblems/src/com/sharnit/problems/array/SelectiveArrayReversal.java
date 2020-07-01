package com.sharnit.problems.array;

import java.util.Arrays;

public class SelectiveArrayReversal {

	 public static int[] selReverse(int[] arr, int n) {
		 if (arr == null || n < 2) {
      return arr;
    }
    for (int i = 0; i < arr.length; i += n) {
      
      // take n elements from input array and make new onw	
      int[] part = Arrays.copyOfRange(arr, i, Math.min(i + n, arr.length));
      
      
      // reverse short array
      reverse(part);
      
      
      // replace elements in input array
      System.arraycopy(part, 0, arr, i, part.length);
    }
    
    return arr;
  }

  private static void reverse(int[] part) {
    for (int i = 0, j = part.length - 1; i < j; i++, j--) {
      int swap = part[i];
      part[i] = part[j];
      part[j] = swap;
    }
  }
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		
		System.out.println("*********** old array ******** "+Arrays.toString(arr));
		
		int[] newArr = selReverse(arr , 3);
		
		System.out.println("*********** new array ******** "+Arrays.toString(newArr));
		
	}
}
