package DSA_CW;

import java.util.Arrays;

public class ArrayTest {
	
	public static void EleInArray(int[] A)
	{
		for (int i : A) {
			System.out.println(i);
		}
			
	}

	public static void main(String[] args) {
	     int[][] arr2 = {{1,2,3} ,{2,4}};
	     
	      int[] arr = {1,2,3};	  
	       int[] arr1 = arr; // both the arrays point to same memory location
	       arr1[2] = 5;
	        System.out.println(Arrays.toString(arr));
	        System.out.println(Arrays.toString(arr1));        
	        
	        int[] A = {1,2,3,4,5};
	        EleInArray(A);
	        

			int[] primaryArray = {1,2,3};  
			int[] secondaryArray = primaryArray; 
			secondaryArray[2] = 5;  
			System.out.println(Arrays.toString(primaryArray)); 
			System.out.println(Arrays.toString(secondaryArray)); 
	        
	        System.out.println("---------------");
	        System.out.println(A.toString()); // this will give only the memory address
	        System.out.println(Arrays.toString(A));
	        System.out.println(Arrays.toString(arr1));
	        System.out.println(Arrays.deepToString(arr2));  // this is to print 2d array
	        
	    Arrays.fill(secondaryArray, 0); //will fill secondaryArray all elememts with zero
	   
		System.out.println(Arrays.toString(secondaryArray)); 
	     
	}

}
