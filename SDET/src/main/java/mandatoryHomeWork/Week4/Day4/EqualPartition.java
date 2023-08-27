package mandatoryHomeWork.Week4.Day4;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

//https://leetcode.com/problems/array-partition/

/*
 * PSUEDO CODE 
 * UnderStand Problem -- Yes
 * Input -- int[]
 * OutPut --int
 * Know 1 solution -- YES 
 * Alternate Solution -- NO 
 * 
 * LOGIC 
 * sort the given input array 
 * declare int sum=0;
 * traverse thur the array from o till < input.length , increament i by i+2
 *   sum = sum+input[i]
 * 
 * return sum
 *   
 * 
 */
public class EqualPartition {
	
	 public int arrayPairSum(int[] nums) {
		 if (nums.length == 0) {return 0;}
		 int Sum=0;
		 Arrays.sort(nums);
		 for (int i = 0; i < nums.length; i=i+2) {
			Sum = Sum+nums[i];
			}
	
		 return Sum;    
	    }
	 
	 
	 @Test
	 public void Test1()	 {
		 int[] nums = {1,4,3,2};
		 Assert.assertEquals(4, arrayPairSum( nums));		 
	 }
	
	 @Test
	 public void Test2()	 {
		 int[] nums = {6,2,6,5,1,2};
		 Assert.assertEquals(9, arrayPairSum( nums));		 
	 }
	 
	 @Test
	 public void Test3()	 {
		 int[] nums = {};
		 Assert.assertEquals(0, arrayPairSum( nums));		 
	 }
	 @Test
	 public void Test4()	 {
		 int[] nums = {1,1,1,1};
		 Assert.assertEquals(2, arrayPairSum( nums));		 
	 }
	
}
