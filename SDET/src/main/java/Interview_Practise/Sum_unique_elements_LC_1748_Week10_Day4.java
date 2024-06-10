package Interview_Practise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Sum_unique_elements_LC_1748_Week10_Day4 
{

	@Test
	public void Test1()
	{
		int[] nums = {1,2,3,2};
		int sumOfUnique = sumOfUnique( nums) ;
		System.out.println(sumOfUnique);
	}

	@Test
	public void Test2()
	{
		int[] nums = {1,1,1,1,1};
		int sumOfUnique = sumOfUnique( nums) ;
		System.out.println(" test2  "+sumOfUnique);
	}
	
	
	@Test
	public void Test3()
	{
		int[] nums = {1,2,3,4,5};
		int sumOfUnique = sumOfUnique( nums) ;
		System.out.println( " test3  " +sumOfUnique);
	}

	
	
	public int sumOfUnique(int[] nums) {

		Map< Integer , Integer > map = new HashMap< Integer , Integer >() ;
        int count = 0 ;

		for (int i = 0; i < nums.length; i++) 
		{
             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1) ;
		}

		for (Map.Entry<Integer , Integer> entry : map.entrySet() )
		{
			if (entry.getValue() == 1 ) count= count+ entry.getKey() ;
		}
		
		return count;
		
		
	}



}
