package DSA_ClassIv;

import org.junit.Test;

/*
 * Given an integer array nums , find the continious sub array [containing atleast 1 pos no ]
 * which has the largest sum and return the sum
 * [ an subayyar is a continious part of the array ]
 *  input = -2 1 -3 4 -1 2 1 -5 4 
 */

public class Largest_Sum {
	
	public int largest_suArr(int[] nums)
	{
		
		  int maxSum =0; int tempSum =0; //-2 1  -3 4 -1 2 1 -5 4 
	        int left =0 , right =0,  index =0;
		
	        while (right < nums.length)  
	        {     
	           if(nums[right] < 0)
	        	{
	        		if(right != nums.length - 1)  right ++;       	
	        	}          	
	        	else  if (nums[right] >=0) 
	        	{
	        		index = left ;
	        		while (index < right)
	        		{
	        			System.out.println("------------"+ right );
	        			System.out.println("------------"+ index );
	        			tempSum = tempSum + nums[left];  //-1
	        			index ++ ; // 2
	        		
	        		}	      	
	        	    if (maxSum < tempSum)  {maxSum = tempSum ;  }// 1 2 
	        		
	        		//System.out.println("------------"+ maxSum );
	        	    left++ ;
	        		right = left+1 ;  ; 	        		
	        		tempSum =0;
	        	} 
	        }
	        
	        while (left < right) {
    			tempSum = maxSum + nums[left];      			
    		}	
    		if (maxSum < tempSum)  {maxSum = tempSum ;  }//3 			
	        return  maxSum;	 
	}

@Test
public void Test1()
{
	int[] nums = { -2 ,1 ,-3, 4, -1, 2, 1, -5, 4 };
	int largest_suArr = largest_suArr( nums);
	System.out.println(largest_suArr);
	
	
}
}
