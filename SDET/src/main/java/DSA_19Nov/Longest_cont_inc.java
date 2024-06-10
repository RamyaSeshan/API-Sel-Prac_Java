package DSA_19Nov;

import org.junit.Test;

public class Longest_cont_inc {

	
	 /*
	  * Given an unsorted array of integers nums,
	  *  return the length of the longest continuous increasing subsequence
	  *   (i.e. subarray). int nums[] = {1,3,5,4,7} Output: 3
	  */
	 
	/*
	 * 2 pointers psuedo code 
	 * have 2 pointer , p1 =0 , p2 = p1+1 , counter =1  , max len = 0 
	 * 
	 * iterate thru while loop till right less that arrya lenght 
	 *  if nums[p1] < nums [p2 ]  incremtn p1 & p1  , increment counter 	
	 *  else   make i=j , j ++ take max of counter and amx and make it as Max
	 */
	
	
	@Test
	public void Longest_cont_inc_test1()
	{
		int nums[] = {1,3,5,4,7,8,9,10,11,0} ;
		int verify_Longest_cont_in = verify_Longest_cont_in(nums) ;
		System.out.println(verify_Longest_cont_in );
	}

	private int verify_Longest_cont_in(int[] nums) {  // 1,3,5,4,7
		
		int left = 0 , right =0 , counter =0 , max = -1 ;
		
		while (right < nums.length-1 )  // 1,3,5,4,7
		{
			if (nums[right] <= nums[right +1 ])
			{
				right ++;
				counter = counter +1 ;
				System.out.println(right);
			}else 
			{
				max = Math.max(max, counter+1 ) ;
				System.out.println("max is    " +max);
				left = right;
				right ++;
				counter =0 ;
				//.out.println("left is   " + left );
				//System.out.println("right is   " + right );
			}
		}
		return max;		
		
	}
	
	
}
