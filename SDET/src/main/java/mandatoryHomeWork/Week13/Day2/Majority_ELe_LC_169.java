package mandatoryHomeWork.Week13.Day2;

import org.junit.Test;

public class Majority_ELe_LC_169 {
	
	//https://leetcode.com/problems/majority-element/description/
	
	// refer Week 15 . Day 1 -- Solved aspart of that week  "mandatoryHomeWork.Week15.Day1 "

	public int majorityElement(int[] nums) { // this took 1 ms 
		
		int element = nums[0] ;
		int repeat = 1 ; 
		
		for (int i = 1; i < nums.length; i++) 
		{
			if(nums[i] != element ) { repeat -- ; } else repeat ++;
			if(repeat ==0 ) {element = nums[i]  ; repeat =1 ;}			
		}
		
		return element;		
	}
	
@Test
public void test1()
{
	int[] nums =  {2,2,1,1,1,2,2 };
	int majorityElement = majorityElement( nums) ;
	System.out.println(majorityElement);	
}

@Test
public void test2()
{
	int[] nums =  {3,2,3};
	int majorityElement = majorityElement( nums) ;
	System.out.println(majorityElement);	
}
 
}
