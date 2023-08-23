package mandatoryHomeWork.Week4.Day2;

import org.junit.Assert;
import org.junit.Test;


/*
 * Psuedo Code
 * Input int[]
 * OutPut int[]
 * 
 * Know Solution -- Yes 
 * Alternate Sol -- Did not Try
 * 
 * Test Data [1,2,2,4,5]  [1,1] [1,2,3,4,5,5]
 * 
 * Logic
 * Declare nums[] 
 * take firt index value of nums in temp var 
 * iterate thur for loop from 1 to n
 *  
 *    check if nums[i] =temp+1  then make  temp = temp+1 
 *       otherwise return new int[] {temp,temp+1};
 * O Notation -- O[N] 
 */

public class SetMismatch_LC_645 {

	public int[] findErrorNums(int[] nums) { //[2,3,3]  [1,1]  [1,2,2,4]
		
		int temp = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if(nums[i] == temp+1)  { temp = temp+1 ;}
			else 
			{
				return new int[] {temp,temp+1};			
			}
		}
		return null;
	}
	
	@Test
	public void Test1()
	{
	   int[] input = {1,1,3,4,5};
	   Assert.assertArrayEquals(new int[] {1, 2} ,findErrorNums(input));
	}


	@Test
	public void Test2()
	{
	   int[] input = {1,1};
	   Assert.assertArrayEquals(new int[] {1, 2} ,findErrorNums(input));
	}
	@Test
	public void Test3()
	{
	   int[] input = {1,2,3,4,5,5};
	   Assert.assertArrayEquals(new int[] {5, 6} ,findErrorNums(input));
	}


	@Test
public void Test4()
{
   int[] input = {1,2,3,3,5,6};
   Assert.assertArrayEquals(new int[] {3, 4} ,findErrorNums(input));
}


}