package Interview_Practise;

import java.util.Arrays;

import org.junit.Test;

public class DiffBtnHighLow_LC_1984_DSA_ClassII 
{

	@Test
	public void test1()
	{
		int[] nums = {9,4,1,7} ;
		int k = 2 ;
		int minimumDifference = minimumDifference( nums,  k) ;
		System.out.println("test 1 ---  " + minimumDifference);

	}
	
	@Test
	public void test2()
	{
		int[] nums = {90} ;
		int k = 1 ;
		int minimumDifference = minimumDifference( nums,  k) ;
		System.out.println("test 2 ---  " + minimumDifference);

	}
	

	public int minimumDifference(int[] nums, int k) 
	{
		Arrays.sort(nums);
		int currMin  = Integer.MAX_VALUE ;
		for(int i =0 ; i <= nums.length -k ; i++)
		{
			currMin = Math.min(currMin,  nums[ i+k -1 ] - nums[i]) ;
		}
		return currMin;
	}


}
