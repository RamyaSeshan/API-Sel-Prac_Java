package DSA_Addtional.Day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SingleNumber {

	/*
	 * Given a non-empty array of integers nums, 
	 * every element appears twice except for one. 
	 * Find that single one.
	 * 
	 */
	@Test
	public void test1()  
	{
		int[] nums = {2,2,1};
		Integer findSingleNumber = findSingleNumber(nums) ;
		System.out.println( findSingleNumber);
		System.out.println( "---------------------");
	}

	@Test
	public void test2()  
	{
		int[] nums = {1};
		Integer findSingleNumber = findSingleNumber(nums) ;
		System.out.println( findSingleNumber);
		System.out.println( "---------------------");
	}

	@Test
	public void test3()  
	{
		int[] nums = {4,1,2,1,2};
		Integer findSingleNumber = findSingleNumber(nums) ;
		System.out.println( findSingleNumber);
		System.out.println( "---------------------");
	}

	@Test
	public void test4()  
	{
		int[] nums = {4,1,2,1,2,4};
		Integer findSingleNumber = findSingleNumber(nums) ;
		System.out.println( findSingleNumber);
		System.out.println( "---------------------");
	}



	public Integer findSingleNumber1(int[] nums) {
		Map<Integer ,Integer> map = new HashMap<Integer ,Integer>() ;

		for (int i : nums) 
		{
			map.put(i, map.getOrDefault(i, 0) + 1 ) ;			
		}		

		for(Map.Entry<Integer ,Integer> entry : map.entrySet())
		{
			if (entry.getValue() ==1  ) return entry.getKey() ;
		}
		return -1;			
	}

	public int findSingleNumber(int[] nums)
	{
		Arrays.sort(nums);
		int i =0; 

		while ( i < nums.length ) 
		{
			if ( i == nums.length -1 )  return nums[i]  ;
			else if ( nums[i] != nums[i +1])	 return nums[i]  ; 
			else if ( nums[i] == nums[i +1] ) i = i+ 2;
		}
		return -1;

	}

}
