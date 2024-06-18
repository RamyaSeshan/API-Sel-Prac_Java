package DSA_Addtional.Day2;

import org.junit.Test;

public class TwoSum {

	/*
	 * Given the input int array, find the sum of any two distinct indices of the matching 
	 * given the target 
	 * 
	 */

	@Test
	public void test1()
	{
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] twoSum_TwoPointer = twoSum_TwoPointer(nums, target);
		for (int i : twoSum_TwoPointer)
		{
			System.out.print( i  + " ");
		}
		System.out.println( "------------------------------ ");
	}

	@Test
	public void test2()
	{
		int[] nums = {1,2,2,3,4,6,7};
		int target = 5;
		int[] twoSum_TwoPointer = twoSum_TwoPointer(nums, target);
		for (int i : twoSum_TwoPointer)
		{
			System.out.print( i  + " ");
		}
		System.out.println( "------------------------------ ");
	}

	@Test
	public void test3()
	{
		int[] nums = {1,2,2,4,6,8};
		int target = 100;
		int[] twoSum_TwoPointer = twoSum_TwoPointer(nums, target);
		for (int i : twoSum_TwoPointer)
		{
			System.out.print( i  + " ");
		}
		System.out.println( "------------------------------ ");
	}
	
	public int[] twoSum_TwoPointer(int[] nums, int target) 
	{
		int p1 =0 , p2 = nums.length -1 ;

		while ( p1 < p2)
		{
			if ( nums[p1] + nums[p2] == target)
			{ return new int [] { p1,p2} ; 	}
			else if ( nums[p1] + nums[p2] >  target ) p2--;
			else if ( nums[p1] + nums[p2] <  target ) p1++;
		}
		return new int [] {0,0} ;
	}

}
