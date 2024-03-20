package Interview_Practise;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SingleNumber_LC_136 {
	
	// https://leetcode.com/problems/single-number/description/
	
	@Test
	public void test1()
	{
		int[] nums = { 2,2,1 };
		int singleNumber = singleNumber( nums) ;
		System.out.println( "test 1 --- " + singleNumber);
	}
	
	@Test
	public void test2()
	{
		int[] nums = {4,1,2,1,2};
		int singleNumber = singleNumber( nums) ;
		System.out.println( "test 2 --- " + singleNumber);
	}
	
	@Test
	public void test3()
	{
		int[] nums = {1};
		int singleNumber = singleNumber( nums) ;
		System.out.println( "test 3 --- " + singleNumber);
	}
	
	

	public  int singleNumber(int[] nums) 
	{
		if ( nums.length ==1  ) return nums[0] ;
		
		Set<Integer > set = new HashSet<  Integer>() ;
		
		for (int i = 0; i < nums.length; i++)
		{
			if ( set.contains(nums [i]))  set.remove(nums[i]) ;
			else set.add(nums[i]) ;				
		}
		
		return set.iterator().next() ;
	}

}
