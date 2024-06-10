package DSA_19Nov;

import org.junit.Test;

public class Max_Consecutive_LC_1004 {
	
	// https://leetcode.com/problems/max-consecutive-ones-iii/
	
	/*// 1,1,1,0,0   ,0,1,1,1,1,0  k =2 
	 * 2 Pointers psuedo code 
	 * have p1 =0 , p2 = 0 , iterate in while loop while p1 less than lenght of array 
	 *   --> check if k >0 && nums[p2] ==0 , then decrement k and p2++ , increment counter 
	 *   -->  check if k >0 && nums[p2] ==1  , p2++ increase cunter 
	 *   --> if (k ==0 )  counter  = right - left   , find the max of counter & max , left = right 
	 *   
	 *   finally returm max 
	 */  
@Test
public void Max_Consecutive_LC_1004_test()
{
	int[] nums = {1,1,1,0,0,0,1,1,1,1,0} ; int  k = 2 ;
	int longestOnes = longestOnes( nums,  k) ;
	System.out.println(longestOnes);
}

@Test
public void Max_Consecutive_LC_1004_test2()
{
	int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1} ; int  k = 3 ;
	int longestOnes = longestOnes( nums,  k) ;
	System.out.println(longestOnes);
}

@Test
public void Max_Consecutive_LC_1004_test3()
{
	int[] nums = {0,0,0,1} ; int  k = 4;
	int longestOnes = longestOnes( nums,  k) ;
	System.out.println(longestOnes);
}



	private int longestOnes(int[] nums, int k) { // takes 1618 ms 
		 int count = 0 , max = Integer.MIN_VALUE ; // 
	       int left =0 , right =0 , temp = k ;
	       
	       while ( right < nums.length)
	       { 
	    	   if ( nums[right] == 0)
	             {
	    		   if (temp > 0 ) 
	    		   { temp= temp-1 ;  count ++ ; 
	    		     if (right == nums.length -1) max = Math.max(max, count);
	    		     right ++; 
	    		   }	   		              
	               else if (temp == 0 || right == nums.length -1 )
	              {	max = Math.max(max, count) ;	                  
	                  temp =k ;              
	                   count =0; 
	                   left ++ ;
	                   right = left ;
	                   System.out.println("max is   " + max );
	              }
	              
	              } 
	    	   
	             else if( nums[right] == 1 )
	             {	 count ++ ; right ++;	            
	             if (right == nums.length)
	             { max = Math.max(max, count) ; }
	             }
	             
	       }      
	       return max;		
	}

}
