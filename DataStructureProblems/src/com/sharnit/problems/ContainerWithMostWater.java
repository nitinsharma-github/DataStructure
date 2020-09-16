package com.sharnit.problems;

public class ContainerWithMostWater {
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,8,6,2,5,4,8,3,7};
		int len = arr.length;
		int volume = 0;
		int distance = 0;
		int height = 0;
		int firstElement = 0;
		int secondElement = 0;
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				
				distance = j-i;
				if(arr[i] > arr[j]) {
					height = arr[j];
				}else {
					height = arr[i];
				}
				int vol = distance * height;
				
				if(vol > volume) {
					volume = vol;
					firstElement = arr[i];
					secondElement = arr[j];
				}
				
			}
			
		}
		
		System.out.println(" volumne "+volume);
		System.out.println(" firstElement "+firstElement);
		System.out.println(" secondElement "+secondElement);
		
	}

}
