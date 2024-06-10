package Interview_Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ContainsDuplicate_LC_217 {

	// https://leetcode.com/problems/contains-duplicate/description/

	public boolean containsDuplicate1(int[] nums) { // time limit Exceeded 

		List<Integer> list = new ArrayList<Integer>() ;

		for (int i : nums)
		{
			if (list.contains(i)) return true ;
			else list.add(i) ;
		}		
		return false;

	}

	public boolean containsDuplicate2(int[] nums) { // // time limit Exceeded 

		for (int i = 0; i < nums.length; i++) {

			for (int j = i+1; j < nums.length; j++)
			{
				if(nums[i]== nums[j])
				{ return true; } 
			}
		}
		return false;
	}


	public boolean containsDuplicate3(int[] nums) { //took 33 ms 

		Map<Integer , Integer> map = new HashMap<Integer , Integer>() ;

		for (int i : nums) 
		{
			map.put(i, map.getOrDefault(i, 0) + 1 ) ;		
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
		{
			if (entry.getValue() > 1 ) return true ;
		}


		return false;
	}

	
	 // Time complexity: O(nlog(n))
	 // Space complexity: O(log(n))

	public boolean containsDuplicate(int[] nums) {  // 18 ms 

     Arrays.sort(nums);
     for (int i = 0; i < nums.length -1 ; i++) 
     {
		if (nums[i] == nums[i+1 ])  return true ;
	 }

		return false; 

	}



	@Test
	public void test1()
	{
		int[] nums = {1,2,3,1} ;
		boolean containsDuplicate = containsDuplicate(nums) ;
		System.out.println(containsDuplicate);
	}


	@Test
	public void test2()
	{
		int[] nums = {1,2,3,4} ;
		boolean containsDuplicate = containsDuplicate(nums) ;
		System.out.println(containsDuplicate);
	}

	@Test
	public void test3()
	{
		int[] nums = {1,1,1,3,3,4,3,2,4,2} ;
		boolean containsDuplicate = containsDuplicate(nums) ;
		System.out.println(containsDuplicate);
	}
}
