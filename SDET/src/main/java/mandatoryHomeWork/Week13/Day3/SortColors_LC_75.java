package mandatoryHomeWork.Week13.Day3;

import java.util.Arrays;

import org.junit.Test;

public class SortColors_LC_75 {	
		
	// https://leetcode.com/problems/sort-colors/

	/*
	 * Psuedo code
	 * Solved this usign Insertion Sort
	 */
	
    public void sortColors1(int[] nums) { // took 2 ms
    	
    	int temp ;
    	for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j <=i; j++) {
				
				if(nums[i] < nums[j])
				{
				 temp = nums[i] ;
				 nums[i] = nums[j] ;
				 nums[j] = temp ;
				}
				}
		}        
    }
  
    public void sortColors(int[] nums)  // took hint 
    {
    	int start =0;
    	int end = nums.length -1 ;    			
    	int index =0 ;
    	
    	while (index <= end && start < end )
    	{
    	   if (nums[index] == 0 ) {    		  
    		   nums[index] = nums[start] ;
    		   nums[start] = 0;
    		   start++ ;
    		   index ++;    		 
    	   }else if (nums[index] == 2)
    	   {
    		   nums[index] = nums[end];
    		   nums[end] = 2;
    		   end -- ;
    	   } else 
    	   {  index ++ ;    }    	
    	}
    }
    
    @Test
    public void Test1()
    {
    	int[] A = {2,0,2,1,1,0};
        sortColors(A ) ;
    	System.out.println(Arrays.toString(A ));
    	}
    
    
    @Test
    public void Test2()
    {
    	int[] A = {2,0,1};
        sortColors(A ) ;
    	System.out.println(Arrays.toString(A ));
    	}
}
