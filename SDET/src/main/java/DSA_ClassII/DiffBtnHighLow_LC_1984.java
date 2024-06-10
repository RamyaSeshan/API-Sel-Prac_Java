package DSA_ClassII;

import java.util.Arrays;

import org.junit.Test;

//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/solutions/3688672/java-solution-using-sliding-window/

/* nums = [9,4,1,7], k = 2
 * sort  the Array  1,4,7,9
 *  declare currentMax = Interger.Min
 *  iterate thur for loop for(int i=0 ; i < nums.lenght-k ; i++ )
 *      currentMax = Math.Max(currentMax , nums[i+k-1]- nums[i] )  //3 ,3 , 2
 *      
 *    return currentMax
 */
public class DiffBtnHighLow_LC_1984 {
	
	 public int minimumDifference(int[] nums, int k) {
		 int currentMax = Integer.MAX_VALUE;		 
		 Arrays.sort(nums);
		 
		 for (int i = 0; i <= nums.length-k; i++) 
		    {			
			 currentMax = Math.min(currentMax, nums[i+k-1] - nums[i]);			 			 
		     }		
		 return currentMax;
	    }
	
 @Test
	public void Test1()
		{
			int [] nums = {9,4,1,7};  // 
			 int target =2;
			int conseSum = minimumDifference(nums , target);
			System.out.println(conseSum);	
			}
 @Test
	public void Test2()
		{
			int [] nums = {90};  // 
			 int target =1;
			int conseSum = minimumDifference(nums , target);
			System.out.println(conseSum);	
			}
}
