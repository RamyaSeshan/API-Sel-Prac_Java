package Naga_Practise;

import org.junit.Test;

public class MaxConsecutivesOnes_III_LC_1004 {

	
	@Test
	public void test1()
	{
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0 } ;
		int k = 2;
		int longestOnes = longestOnes( nums,  k) ;
		System.out.println( "test 1 -- "  + longestOnes);		
	}
	
	@Test
	public void test2()
	{
		int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1 } ;
		int k = 3;
		int longestOnes = longestOnes( nums,  k) ;
		System.out.println( "test 2 -- "  + longestOnes);		
	}
	

	public  int longestOnes1(int[] nums, int k) {
		
		int left =0 , right =0 , max =0 , winsize =0  , index = k;
		
		while (right < nums.length) 
		{
			if (nums[right] == 0)  index = index -1 ;
			
			if (right ==nums.length - 1  ||  index < 0)
			{
				winsize = (  (right -1 ) - left ) + 1;
				max = Math.max(max, winsize) ;
				System.out.println( "max "  + max);
				left = left  + 1 ;						
			}				
		}
		
		return max ;
		
	}
	
	
	public  int longestOnes(int[] nums, int k)
	{
		int left =0 , right =0 , max =0 , winsize =0  , index = k;
		
		
		
		while ( right < nums.length)  //1,1,1,0,0,0,1,1,1,1,0
		{
			if (nums[right] == 0)  index = index -1 ;
			
			if (  index < 0)
			{
				winsize = (  (right -1 ) - left ) + 1;
				max = Math.max(max, winsize) ;
				//System.out.println( "winsize "  + winsize);
				//System.out.println( "max "  + max);
				
				while ( nums[left] != 0 && left < right )  { left ++; }
				left= left + 1;
				index =0 ;
				//System.out.println( "left "  + left);
				//System.out.println( " --------------------");
			}
			
			if (right ==nums.length - 1)
			{
				winsize = (  right  - left ) + 1;
				max = Math.max(max, winsize) ;
			}
			
			right ++ ;
		}
		
		return max;
		
	}
	
	
	
}
