package DSA_Addtional.Day1;

import java.util.Arrays;

import org.junit.Test;

public class FindSquares

{
	/*
	 * Given sorted integer array in non-decreasing order, return the 
	 * array of the squares of each number sorted in non-decreasing order
	 * 
	 */

	@Test
	public void test1()
	{
		int[] nums = {2,3,4,4,5};
		int[] squareAndSort = squareAndSort(nums) ;

		for (int i : nums) {
			System.out.println( i );
		}
		System.out.println( "----------------------------------" );
	}



	@Test
	public void test2()
	{
		int[] nums = {-7, -5, 1, 4, 7};
		int[] squareAndSort = squareAndSort(nums) ;

		for (int i : nums) {
			System.out.println( i );
		}
		System.out.println( "----------------------------------" );
	}


	@Test
	public void test3()
	{
		int[] nums = {};
		int[] squareAndSort = squareAndSort(nums) ;

		for (int i : nums) {
			System.out.println( i );
		}
		System.out.println( "----------------------------------" );
	}

	public int[] squareAndSort(int[] nums) {
		for (int i =0 ; i < nums.length ; i++) 
		{
			nums[i] = nums[i] * nums[i] ;
		}	

		Arrays.sort(nums); 
		return nums;
	}
}
