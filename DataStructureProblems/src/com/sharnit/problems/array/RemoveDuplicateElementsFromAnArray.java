package com.sharnit.problems.array;

import java.util.Arrays;

public class RemoveDuplicateElementsFromAnArray {

	public static int[] shiftLeft(int[] arr, int j) {

		for (int i = j; i <= arr.length - 1; i++) {

			if (i == arr.length - 1) {

				arr[i] = -1;
			} else {

				arr[i] = arr[i + 1];

			}
		}

		return arr;
	}

	public static void duplicateElement(int[] arr) {

		String dups = "";
		int arrLength = arr.length;

		for (int i = 0; i < arrLength; i++) {

			for (int j = (i + 1); j < (arrLength); j++) {
				System.out.println(arr[i] + "==" + arr[j]);
				if (arr[i] == arr[j]) {
					dups = dups + arr[i] + " , ";
					arr = shiftLeft(arr, j);
					System.out.println("...........Arr......... " + Arrays.toString(arr));
				}
			}
		}

		System.out.println("...........Dups......... " + dups);
		System.out.println("...........Arr.....++++++++++.... " + Arrays.toString(arr));

	}

	
	static void unique_array(int[] my_array)
    {
        System.out.println("Original Array : ");
         
        for (int i = 0; i < my_array.length; i++)
        {
            System.out.print(my_array[i]+"\t");
        }
         
        //Assuming all elements in input array are unique
         
        int no_unique_elements = my_array.length;
         
        //Comparing each element with all other elements
         
        for (int i = 0; i < no_unique_elements; i++) 
        {
            for (int j = i+1; j < no_unique_elements; j++)
            {
                //If any two elements are found equal
                 
                if(my_array[i] == my_array[j])
                {
                    //Replace duplicate element with last unique element
                    System.out.println("");
                    System.out.println("");
                	System.out.println("my_array["+j+"] : "+my_array[j]);
                	System.out.println("my_array["+(no_unique_elements-1)+"] : "+my_array[no_unique_elements-1]);
                    my_array[j] = my_array[no_unique_elements-1];
                    
                    for (int m = 0; m < my_array.length; m++)
                    {
                        System.out.print(my_array[m]+"\t");
                    }
                    System.out.println("");
                    System.out.println("");
                    no_unique_elements--; // important step
                     
                    j--;
                }
            }
        }
         
        //Copying only unique elements of my_array into array1
         
        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
         
        //Printing arrayWithoutDuplicates
         
        System.out.println();
         
        System.out.println("Array with unique values : ");
         
        for (int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i]+"\t");
        }
         
        System.out.println();
         
        System.out.println("---------------------------");
    }
     
    public static void main(String[] args) 
    {        
        unique_array(new int[] {0, 3, -2, 4, 3, 2,5,2,6,4,6,4});
         
        //unique_array(new int[] {10, 22, 10, 20, 11, 22});
         
      }    
    
    /*
	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 2, 5, 6, 6, 8, 9, 9, 7, 7 };

		duplicateElement(arr);
	}*/

}
