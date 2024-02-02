package Interview_Practise;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SummaryRanges_LC_228_WEEK7_DAY6 
{
	// Time Complexity -- O [N ]  ; Space Complexity O[ N ]

	@Test
	public void test1()
	{
		int[]  nums = {0,1,2,4,5,7 };
		List<String> summaryRanges = summaryRanges(nums) ;
		System.out.println(summaryRanges);
	}
	
	@Test
	public void test2()
	{
		int[]  nums = {0,2,3,4,6,8,9 };
		List<String> summaryRanges = summaryRanges(nums) ;
		System.out.println(summaryRanges);
	}
	
	
	@Test
	public void test3()
	{
		int[]  nums = {1,3,5,7};
		List<String> summaryRanges = summaryRanges(nums) ;
		System.out.println(summaryRanges);
	}
	

	@Test
	public void test4()
	{
		int[]  nums = {1,2,3,7};
		List<String> summaryRanges = summaryRanges(nums) ;
		System.out.println(summaryRanges);
	}
	
	public List<String> summaryRanges(int[] nums)   
	{
		List <String > list = new ArrayList<String> ();  // 0,2,3,4,6,8,9

		int start =0;
		for (int i = 0; i < nums.length; i++) 
		{
			if(  ( i != nums.length -1  && nums[i] != nums[i+1] -1 )  ||   i == nums.length -1 )
			{
				if(start == i )
				{
					list.add(nums[i] + "") ;					
				} 
				else 
				{list.add(nums[ start ] + "->" + nums[i] ) ;				 
				}
				start = i + 1;
			}
		}
		
		return list;
	}
	
	
	
}
