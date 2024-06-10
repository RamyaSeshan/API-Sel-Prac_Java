package Interview_Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TwoSum {

	// 2 Pointer Time Complexity Arrays.Sort   O(n log(n)) ,  O[N/2] , SPace Complexity NA 
	// Hash Map Time Complexity O[1] , Space Complexity O[N]

	@Test
	public void test1()
	{
		int[] nums = {1,2,3,4,5} ;
		int target = 3;		
		int[] findSum = findSum(nums ,target ) ;
		
		for (int i : findSum) 
		{
			System.out.println( i);
		}

	}

	public int[] findSum_2Pointer(int[] nums, int target) 
	{
		int p1 = 0 ,  p2 = nums.length -1  ;
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) 
		{
             if(nums[p1]+ nums[p2 ] > target)  p2 --;
             else if (nums [p1]+ nums[p2] < target ) p1++;
             else return new int[] { nums [p1] , nums[p2] };
		}
		return null;

	}
	
	public int[] findSum(int[] nums, int target) 
	{
		
		Map<Integer , Integer> map = new HashMap<Integer , Integer>() ;
		
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println("--" + nums[i]);
			if(map.containsKey(target - nums[i])) return new int[] { map.get(target - nums[i])  , i} ;
			else map.put(nums[i], i) ;
		}		
		
		return null;	
	}
	

}
