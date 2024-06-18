package DSA_Addtional.Day3;

import org.junit.Test;

public class ExactSum {
	
	/*
	Start with first element 
	If the sum is less than the desired sum, slide to the next element [Grow]
	Again, sum that and check if it is lesser, equal or greater
	If it is lesser, add the next element to slide [Grow]
	If it is greater, than shrink the last element on the left [Shrink]
	If it is equal, you got it and again do both Grow and Shrink [Slide]
	*/
	
	@Test
	public void test1()
	{
		int[] nums = {1,7,4,3,1,2,1,5,1};
		int k = 7;
		int[] findExactSumIndicies = findExactSumIndicies(nums, k);
		
		for (int i : findExactSumIndicies) 
		{
			System.out.println( i);
		}
	}
	
	@Test
	public void test2()
	{
		int[] nums = {1,7,4,3,1,2,1,5,1};
		int k = 8;
		int[] findExactSumIndicies = findExactSumIndicies(nums, k);
		
		for (int i : findExactSumIndicies) 
		{
			System.out.println( i);
		}
	}
	
	@Test
	public void test3()
	{
		int[] nums = {1,7,4,3,1,2,1,5,1};
		int k = 14;
		int[] findExactSumIndicies = findExactSumIndicies(nums, k);
		
		for (int i : findExactSumIndicies) 
		{
			System.out.println( i);
		}
	}
	

	public int[] findExactSumIndicies(int[] nums, int k) 
	{
		int sum = 0 , i =0 , startIndex =0;
	
		
		while ( i < nums.length )
		{
			sum = sum + nums[i] ;
			if ( sum < k ) i++;
			else if (sum > k )
			{ 
				sum = sum - nums[startIndex] ;
				if ( sum ==k ) return new int[] { startIndex + 1  , i } ;
				else {startIndex = startIndex+1 ; i++ ; }			
			}
		   else if ( sum ==k ) return new int[] { startIndex , i } ;
			
		}
		return new int[] { 0 , 0};
		
	}
	
}