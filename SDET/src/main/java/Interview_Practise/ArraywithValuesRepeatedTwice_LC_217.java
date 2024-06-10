package Interview_Practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ArraywithValuesRepeatedTwice_LC_217 
{
	@Test
	public void test1()
	{
		int[] nums = {1,2,3,1 };
		boolean containsDuplicate = containsDuplicate(nums) ;
		System.out.println( " test 1 " + containsDuplicate );

	}


	@Test
	public void test2()
	{
		int[] nums = {1,2,3,4};
		boolean containsDuplicate = containsDuplicate(nums) ;
		System.out.println( " test 2 " + containsDuplicate );

	}

	@Test
	public void test3()
	{
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		boolean containsDuplicate = containsDuplicate(nums) ;
		System.out.println( " test 3  " + containsDuplicate );

	}
	public boolean containsDuplicate_1(int[] nums) { // took 9 ms 

		Set<Integer> set = new HashSet<Integer>() ;

		for (Integer integer : nums) 
		{
			if  ( ! set.contains(integer))  set.add(integer) ;
			else return true;

		}
		return false;		

	}
	
	
	public boolean containsDuplicate(int[] nums)  // took 19 ms 
	{
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length - 1; i++) 
		{
			if ( nums[i] == nums[i + 1])  return true ;
		}
		
		
		return false;
		
	}
	
	
}
