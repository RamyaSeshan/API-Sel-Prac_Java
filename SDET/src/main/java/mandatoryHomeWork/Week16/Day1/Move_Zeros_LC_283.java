package mandatoryHomeWork.Week16.Day1;

import org.junit.Test;

import groovyjarjarantlr4.v4.parse.ANTLRParser.action_return;

public class Move_Zeros_LC_283 {
	
	//  https://leetcode.com/problems/move-zeroes/
	
	
	/*
	 * Psuedo Code
	 *   have pointer p1 = nums[o] , p2 = nums[1]
	 *   
	 *   Iterate in while loop while p12 less than nums/lenght
	 *     if p1 != 0 , p1++ , p2++
	 *     if p1 ==0 , p2!=0 , swap , p1++ ,p2++
	 *     else if  p1=0 , p2=0 ,p2++
	 * finally return nums 
	 * 
	 * 
	 * 
	 */
	   public void moveZeroes1(int[] A) 	 // tales 4 ms     
	   {		   				   
		   int p1 = 0 , p2 = 1;
		   int temp ;		   
		   while (p1 < A.length && p2 < A.length)
		   {
			   if(A[p1 ]!=0 ) {p1 ++ ; p2++ ; }
			   else if (A[p1 ] ==0 && A[p2] ==0 ) {p2++ ;  }
			   else if (A[p1] ==0 && A[p2 ]!=0 ) 
			   { 
				   temp = A[p1];
				   A[p1] = A[p2] ;
				   A[p2] = temp ;
				   p1++ ; p2 ++ ;				   
			   }			   
		   } 		   
	   }
	   
    public void moveZeroes2(int[] A) 	   // takes 45 ms
	   {		   				   
		int temp ;   
    	for (int i = 0; i < A.length; i++) {
			   
			   if(A[i] == 0)
			   {
				   for (int j = i+1; j < A.length; j++) 
				   {
					  if(A[j] != 0 )
					  {
						  temp = A[i];
						   A[i] = A[j] ;
						   A[j] = temp ; break ;
					  }
				   }
			   }			
		}   
	   }
    public void moveZeroes(int[] A)  // took 2 ms 
    {
    	int temp ;
    	int a = 0 , b=0; // 4,5,0,1,2    0,1,0,3,12   1,0,0,3,12  1,3,0,0,12
    	
    	while (b < A.length)
    	{
    		if (A[b] != 0)
    		{
    			temp = A[a] ;
    			A[a] = A[b] ;
    			A[b] = temp ;
    			a++; b++;
    		} else
    		{
    			b++;
    		}
    	}
    	
    	
    }
	   
@Test
public void test1()
{
	 int[] nums = {0,1,0,3,12};
	 moveZeroes(nums) 	 ;
	for (int i : nums) {
		System.out.println(i);
	}	
}


@Test
public void test2()
{
	 int[] nums = {0};
	 moveZeroes(nums) 	 ;
	for (int i : nums) {
		System.out.println(i);
	}	
}




}
