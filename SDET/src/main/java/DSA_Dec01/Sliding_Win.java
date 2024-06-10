package DSA_Dec01;

import org.junit.Test;

public class Sliding_Win {
	
	/*
	 * Int nums[] = {1,5,2,3,7,1};
Int k = 3; // Find the max value in k sub array items
	 */
	
	/* Time Complexity -- O[N]  ; Space Complexity O[1]
	 * Psuedo code
	 *  intiate 2 pointers , left =0 and right =0  , sum =0 , max = INteger.min
	 *  loop thru the string till right less than window k
	 *    make sum = sum + arr[right ] , right ++
	 *    
	 * find max of sum and max 
	 * 
	 * now iterate in while loop till right < arr.len
	 *    in the sum , sub arr[left ] , add arr[right]
	 *    find max of sum and max 
	 *    increment left and inc right 
	 *    
	 *    return max 
	 * 
	 */

	
	@Test
	public void max_arr()
	{
		int nums[] = {1,5,2,3,7,1}  ;
		int k =3;
		int findMax = findMax(nums , k)  ;
		System.out.println(findMax);
	}
	
	@Test
	public void test2()
	{
		int nums[] = {1,5,2,3,7,1}  ;
		int k =7;
		int findMax = findMax(nums , k)  ;
		System.out.println( " from test 2 " +findMax);
	}
	@Test
	public void test3()
	{
		int nums[] = { }  ;
		int k =7;
		int findMax = findMax(nums , k)  ;
		System.out.println( " from test 3 " +findMax);
	}
	
	@Test
	public void test4()
	{
		int nums[] = {-1,-2,0,7,-3,10 ,-1 }  ;
		int k =3;
		int findMax = findMax(nums , k)  ;
		System.out.println( " from test 4 " +findMax);
	}
	private int findMax(int[] nums ,int k) {
		if (nums.length  < k ) { return 0 ;}
		int left =0 , right =0 , max = Integer.MIN_VALUE  , sum =0;
		
		while (right < k)
		{  sum = sum +nums[right] ;
			right ++;}
		
		max = Math.max(max, sum	) ;		
		
		while (right < nums.length) 
		{
		    sum = sum - nums[left ] ;
			sum = sum + nums[right ] ;
			max = Math.max(max, sum	) ;
			//System.out.println("Current max " +max);
			left ++;
			right ++;			
		}
		return max;
		}
	
}
