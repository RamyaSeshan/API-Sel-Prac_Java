package Interview_Practise;

import org.junit.Test;
import org.openqa.selenium.devtools.v109.systeminfo.SystemInfo;

public class MoveZero_LC_283 
{
	// https://leetcode.com/problems/move-zeroes/description/

	@Test
	public void test1()
	{
		int[] nums = { 0,1,0,3,12} ;
		move_Zero(nums) ;
		for (int i : nums)
		{
			System.out.println(i);
		}
	}

	public void move_Zero1(int[] nums) 
	{
		int p1 =0 , p2 = 1 , temp =0;		

		while (p1 < nums.length && p2 < nums.length)
		{
			if(nums[p1] !=0 )   {  p1++ ; p2++ ; }
			else if (nums[p1] ==0  && nums[p2] == 0 ) p2++ ;
			else if (nums[p1] ==0  && nums[p2] != 0)
			{
				temp = nums[p1];
				nums[p1 ] = nums[p2 ];
				nums[p2] = temp;
				p1++ ; p2++ ;	
			}			
		}

	}	



	public void move_Zero(int[] nums) 
	{
       int a =0 , b =0 , temp ;
       
       while (b < nums.length)
       {
    	   if (nums[b] !=0 )
    	   {
    		   temp = nums[a] ;
    		   nums[a] = nums[b] ;
    		   nums[b] = temp ;
    		   a++ ; b++;   	   
    	  }else 
    	   { 
    		   b ++;
    	   }
       }

	}



}
