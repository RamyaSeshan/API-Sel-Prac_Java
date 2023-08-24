package mandatoryHomeWork.Week4.Day3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
 * PSUEDO CODE
 * Did i understand the problem
 * input int[]
 * output   List<String>
 * 
 * Approach I -- Know
 * Alternate Approach  -- NO
 * 
 * Test Data [0,2,3,4,6,7,9]   [1,2,4,5,6,9,10]
 * 
 */
public class SummaryRanges_LC_228 {

	public List<String> SummaryRanges(int[] nums) {
		List<String> list = new  ArrayList<String>();
		int  RangeStart ;int cnt;
		
		if(nums.length != 0)
		{ RangeStart = nums[0];  cnt=0;}
		else return list;
         
	
		for (int i = 0; i < nums.length; i++) {

			if(i+1 < nums.length && nums[i]+1 == nums[i+1] ) {cnt = cnt +1;} // cnt 1
			else if((i+1 < nums.length && nums[i]+1 != nums[i+1])  || i == nums.length-1) 
			{
				if (cnt==0) {list.add( nums[i]+""); } 
				else if (cnt !=0)
				{list.add(RangeStart +"->" + nums[i]); } 

				if(i< nums.length-1 ) {
					RangeStart = nums[i+1];  //9
					cnt=0 ;
				}
			}
		}
		return list;		     
	}

	@Test
	public void Test1()
	{
		int[] A = {0,2,3,4,6,7,9};

		List<String> summaryRanges = SummaryRanges(A);
		System.out.println(summaryRanges);
	}
	@Test
	public void Test2()
	{
		int[] A = {1,2,4,5,6,9,10};

		List<String> summaryRanges = SummaryRanges(A);
		System.out.println(summaryRanges);
	}//0,1,2,4,5,7
	
	@Test
	public void Test3()
	{
		int[] A = {0,1,2,4,5,7};

		List<String> summaryRanges = SummaryRanges(A);
		System.out.println(summaryRanges);
	}//0,2,3,4,6,8,9
	
	@Test
	public void Test4()
	{
		int[] A = {0,2,3,4,6,8,9
				};

		List<String> summaryRanges = SummaryRanges(A);
		System.out.println(summaryRanges);
	}//0
	
	@Test
	public void Test5()
	{
		int[] A = {};

		List<String> summaryRanges = SummaryRanges(A);
		System.out.println(summaryRanges);
	}//0
	
}
