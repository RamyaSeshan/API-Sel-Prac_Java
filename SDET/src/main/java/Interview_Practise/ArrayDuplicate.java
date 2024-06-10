package Interview_Practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ArrayDuplicate {

	// Time Complexity O[1] , SPace Complexity O[N]

	@Test
	public void test1()
	{
		int[] nums = {10,20,30,20,40 };
		Boolean findDuplicate = findDuplicate_B(nums) ;
		System.out.println("findDuplicate from test1 with duplicates " +findDuplicate);
	}
	

	@Test
	public void test2()
	{
		int[] nums = {10,20,30,50,40 };
		Boolean findDuplicate = findDuplicate_B(nums) ;
		System.out.println(findDuplicate);
	}
	

	public  Boolean findDuplicate(int[] nums) {

		Set<Integer> set = new HashSet<Integer>();
		for (Integer val : nums) 
		{ if ( ! set.add(val)) return true; }

		return false;

	}
	

	public  Boolean findDuplicate_B(int[] nums) {

        Arrays.sort(nums);
        for (int i = 1; i <= nums.length - 1; i++)
        {
			if(nums[i] == nums[i-1])  return true ;
		}
		return false;

	}

}
