package DSA_Addtional.Day3;

import org.junit.Test;

public class MaxSum {
	
	@Test
	public void test1()
	{
		int[] nums = {1,5,2,3,7,1};
		int k = 3;
		int findMaxSum = findMaxSum(nums, k);
		System.out.println( "test1 -- " +findMaxSum) ;		
	}
	
	@Test
	public void test2()
	{
		int[] nums = {8,4,2,3,11,15,2,1};
		int k = 3;
		int findMaxSum = findMaxSum(nums, k);
		System.out.println( "test2 -- " +findMaxSum) ;		
	}
	

	public int findMaxSum(int[] nums, int k) {
		
		int max = Integer.MIN_VALUE ;
	    int i =0 , sum =0;
	    
	    while ( i < k)
	    {
	    	sum = sum + nums[i] ; i++;
	    }
	   max = Math.max(max, sum) ;
	   
	   while ( i < nums.length )
	   {
		   sum = sum + nums[i] - nums[i -k ];
		   max = Math.max(max, sum) ;
		   i ++;		   
	   }
		
	   
	   return max;
	}

}
