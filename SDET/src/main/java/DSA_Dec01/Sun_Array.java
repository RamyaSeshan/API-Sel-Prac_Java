package DSA_Dec01;

import org.junit.Test;

public class Sun_Array {
	
	/*
	 * 1,7,4,3,1,2,1,5,1   , get subarray which has sum of 7 
	 */

	/*
	 * Psueod code 
	 *    have pointers left =0 , right =0 , sum =0 , target = 7 , List <List <Integer > > list 
	 *    
	 *    iterate thru while loop till right less than array len 
	 *      chck if sum = nums[right ] + sum == target  , print left and right  , inc left and  right
	 *      sum = nums[right ] + sum  < target increment right 
	 *      sum = nums[right ] + sum  > target , sum as sum - nums[left ] , inc left
	 */
	
	/*
	 * Psuedo code from Babu 
	 * Start with first element 
•If the sum is less than the desired sum, slide to the next element [Grow]
•Again, sum that and check if it is lesser, equal or greater
•If it is lesser, add the next element to slide [Grow]
•If it is greater, than shrink the last element on the left [Shrink]
•If it is equal, you got it and again do both Grow and Shrink [Slide]
	 */
	
	@Test
	public void test1()
	{
		int nums[] = { 1,7,4,3,1,2,1,5,1}  ;
		int k =7;
		 subArray(nums , k)  ;
		//System.out.println(findMax);
	}

	private void subArray(int[] nums , int k ) {
		
		int left = 0 , right =0 ,target  = k , sum =0 ;
		
		sum = sum + nums[right ] ;
		
		while (right < nums.length)   // { 1,7,4,3,1,2,1,5,1}
		{			
			if (sum == target) 
			{ 
				System.out.println( left  + "  " +  right );
				sum = sum  - nums[left ];
				left ++ ; right ++ ;
				if (right < nums.length)
			       { sum = sum + nums [right ] ;  } 
			} 
			else if (sum < target) 
			{ 
				right ++;
			    if (right < nums.length)
			       { sum = sum + nums [right ] ;  } 
			}		
			else if (sum > target)
			{
				sum = sum - nums[left ];
				left ++ ;
			}		
			
		    }		
	}
	
}
