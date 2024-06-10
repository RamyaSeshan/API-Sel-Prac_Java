package DSA_19Nov;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Max_Sum_Pair_Equal_Digit_LC_2342 {

	// https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/
	
	/*
	 * Psuedo code 
	 * 
	 * declare a map  , max = integer.Min
	 * find logic to get the sum of digits 
	 * iterate and traverse from firts till last ele of the array 
	 *   take the sumOfDigits of ele
	 *   chekc if sumOfDigits already exists as value in map 
	 *     -- > then get the key of the value 
	 *     --> add key to curren sumOfDigits , mark it int_Sum
	 *     --> chk max and int_Sum and get the max 
	 *  otherwise add the sumOfDigits as value and nums[i] as key to the map 
	 */
	
	/*@Test
	public void test1()
	{
	int[]  num = { 18,43,36,13,7 };	 // 9,7,9,4,7
	int maximumSum = maximumSum( num) ;
	System.out.println(maximumSum);	
	}
	
	@Test
	public void test2()
	{
	int[]  num = { 10,12,19,14 };	 // 10 , 3,10 , 5
	int maximumSum = maximumSum( num) ;
	System.out.println(maximumSum);	
	}  */

	@Test
	public void test3()
	{
	int[]  num = {229,398,269,317,420, 464, 491, 218, 439, 153,482,169,411,93,147,50,347,210,251,366,401 };	 
	/* 9
	5
	7
	6
	3
	3
	5
	5
	3
	8
	6
	5 */
	
	int maximumSum = maximumSum( num) ;
	System.out.println(maximumSum);	
	}
	
	public int maximumSum(int[]  nums) {
		 
		 int digitsSum=0 , currentMax = 0 ,max = -1;
		 Map<Integer , Integer> map = new HashMap< Integer , Integer>() ;
		 
		for (int i = 0; i < nums.length; i++) {	  // map key == 	9,0
			 digitsSum = digitsSum(nums[i]) ;
			 System.out.println(digitsSum);
			 
			 if(! map.containsKey(digitsSum))
			 {
				 map.put( digitsSum ,i) ;
			 }else 
			 {
				Integer index = map.get(digitsSum) ;
				currentMax= nums[i] + nums[index ] ;				
				max = Math.max(currentMax, max) ;
			 }		 	
			 }
	
		return max;	        
	    }
	 
	 
	 public int  digitsSum(int n) 
	 {
		 int q , r  ;  
		 int  it = 1 ;
				 
		 while ( n > 0 )  
		 {
		 if(n <= 9 )  return n;		
		 r = n %10 ;  
		 q = n / 10 ;  
		 n = q  + r ;	
		 if (it == 1 && n==0 ) { it = 0 ; return n; }
		 }			 
		return n; 		 
	 }
}
