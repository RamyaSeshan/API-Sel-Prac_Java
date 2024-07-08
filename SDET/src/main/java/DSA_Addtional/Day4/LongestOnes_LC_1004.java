package DSA_Addtional.Day4;

import org.junit.Test;

public class LongestOnes_LC_1004 
{

	//@Test
	public void test2()
	{
		int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k = 3;
		int longestOnes = longestOnes(nums,k);
		System.out.println( "test2   ---   " +  longestOnes );
	}
	@Test
	public void test1()
	{
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		int longestOnes = longestOnes(nums,k);
		System.out.println( "test1   ---   " +  longestOnes );
	}
	
	public int longestOnes(int[] nums, int k) {
		
		int left = 0, right =0, max=0; // slow pointer
		for (right = 0; right < nums.length; right++) {
			if(nums[right] == 0) {
				k--; // decrement k --> flip zeros to ones !!
			}
			
			if(k < 0) {
				
				if(nums[left] == 0) { // move the left and reset the k
					k++;
				}
				left++;
				
			}
			max = Math.max(max, right-left+1);
			System.out.println(  "right ---"  +right + " || left ---"  +left + " || max---" +max);

		}
		return max;
	}
	//@Test
	public void test3()
	{
		int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k = 3;
		int longestOnes = longestOnes(nums,k);
		System.out.println( "test3   ---   " +  longestOnes );
	}
	
	//@Test
	public void test4()
	{
		int[] nums = {0,0,0,1};
		int k = 4;
		int longestOnes = longestOnes(nums,k);
		System.out.println( "test4   ---   " +  longestOnes );
	}

	
	public int longestOnes_2(int[] nums, int k) {
		
		int left =0 , right =0 , intermim =k , max =0,count =0;
		
		while (left < nums.length && right < nums.length)
		{
			if(nums[right] !=0)
			{
			  count = count + 1; 
			  if( right == nums.length -1 ) { max = Math.max(max, count) ; }
			  right ++;
			}
			else 
			{
				intermim --;
				if ( intermim < 0)
				{
					max = Math.max(max, count) ;
					count =0;
					intermim =k ;
					left = left + 1;
					right = left ;
							
				}else if( intermim >= 0)
				{
					count = count + 1;
					if( right == nums.length -1 ) { max = Math.max(max, count) ; }
					right ++;
				}
				
			}
			
		}		
		return max;
		
	}
	
  public int longestOnes_1(int[] nums, int k)
{
	int left =0 , max =0 , interim = k;
	
	for (int right =0 ; right < nums.length; right++)
	{
		if( nums[right] ==0) { interim = interim -1 ;}
		if(interim < 0)
		{
			interim =k;
			left = left +1 ;
		}
		
		max = Math.max(max, right - left +1) ;	
	}
		
	return max;
	
}

  
  
}