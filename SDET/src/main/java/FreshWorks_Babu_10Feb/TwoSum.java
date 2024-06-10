package FreshWorks_Babu_10Feb;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TwoSum 
{

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

	public int[] findSum_BF(int[] nums, int target) {  // Time Complexity O[N^2]

		for (int i = 0; i < nums.length; i++) 
		{
			for (int j = i+1 ; j < nums.length; j++)
			{
               if( nums [i] + nums[j] == target ) return new int[] { nums[i] , nums[j] } ;
			}	
		}
		return nums;
	}
	
	
	public int[] findSum_2Pointer(int[] nums, int target) // if Array not sorted , sort it .Time Complexity O[N]
	 // Arrays.Sort -- Time Complexity O[n (log n )) 
	{
		int left =0 , right = nums.length - 1;
		
		while ( left  <= nums.length - 1  && right >=0)
		{
			if( nums[left ] + nums [right] < target ) left ++;
			else if (  nums[left ] + nums [right] > target  ) right --;
			else if (  nums[left ] + nums [right] ==  target  ) return new int[] { nums[left] , nums[right] } ;			
		}
		
		return null;		
	}
	
	
	public int[] findSum(int[] nums, int target)  // .Time Complexity O[N]
	{
		Map <Integer , Integer> map = new HashMap<Integer , Integer>() ;
		
		for (int i = 0; i < nums.length; i++)
		{
			if (map.containsKey(target - nums[i]))  return new int[] { i , map.get(target - nums[i]) } ; 
			else map.put(nums[i], i) ;
		}
				
		return null;
		
	}
	
}
