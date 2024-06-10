package DSA_19Nov;

import java.util.Arrays;

import org.junit.Test;

public class Square_Nunber {
	
	/*
	 * Problem 
	 * Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

	 */
	
	/*
	 * BF -- Psuedo code
	 * loop thur , mul each value by itsef and add beck to array 
	 * when loop ends , sort the arry and return 
	 * Time comlexity -- O [n logn]
	 */
	
	/*
	 * Psuedo code -- 2 pointers 
	 *  have p1 =0 and p2 at array len -1
	 *  take the abs value of pi & p1 
	 *    if p2 < p1 , swap and decrement p2
	 *      else decrement p2 
	 */

	@Test
	public void  Square_Nunber_test1()
	{
		int[] nums = {-4,-1,0,3,10} ; 
		int[] verify_Square_Nunber = verify_Square_Nunber(nums) ;
		System.out.println(Arrays.toString(verify_Square_Nunber));
	}
	
	@Test
	public void  Square_Nunber_test2()
	{
		int[] nums = {-7,-3,2,3,11} ;  
		int[] verify_Square_Nunber = verify_Square_Nunber(nums) ;
		System.out.println(Arrays.toString(verify_Square_Nunber));
	}
	
	private void verify_Square_Nunber_BF(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i] ;
		}
	     Arrays.sort(nums);  // Arrays.sort is N[log N ]
		System.out.println(Arrays.toString(nums) );		
	}
	
	private int[] verify_Square_Nunber(int[] nums) {
		int[] result = new int[nums.length] ;
		int left =0 , right = nums.length -1  ;
		
		for (int i = nums.length -1 ; i >= 0 ; i--) {			
			if (Math.abs(nums[left] ) < Math.abs(nums[right] ))
					{
				  result[i] = nums[right] * nums[right];
				  right --;
					}
			else
					{
					result[i] = nums[left] * nums[left];
					left ++;
					}			
		}
		return result ;
	}
	
}
