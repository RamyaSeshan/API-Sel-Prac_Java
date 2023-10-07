package DSA_DailyConnect;

import org.junit.Test;

public class Array_Only0OR1 {
	
	public int[] moveZeros1 (int[] nums) 
	{
		int left = 0 , right = nums.length -1 ,  temp ;
		
		while (left  <= nums.length -1 && right >= 0)
		{			
			if(nums[left] == 1)
			{ 
				left ++;
				
			} else if (nums[right] == 0)
			{
				right --;
				
			} else if (nums[left] == 1 && nums[right] == 1)
			{
				left ++ ;
				right ++ ;
			} else 
			{
				temp= nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left ++ ;
				right --;				
			}			
			
		}		
		
		return nums;
	}

	
	public int[] moveZeros (int[] nums)   // { 0,1,1,0,1,0,}   1,0,1,0,1,0,   1,1,0 ,0,1 ,0,     1,1,1 ,0,0 ,0, 
	{
		int left =0 , right = left +1 ,temp ;
		
		while (right < nums.length)
		{
		  if (nums[left] == 0 && nums[right] == 1 )
		  {
			  temp = nums[left] ;
			  nums[left]  = nums[right] ;
			  nums[right] = temp;
			  
			  left ++ ; right ++ ;
		  } else if (nums[left] == 0 && nums[right] == 0)
		  {
			  right ++;
		  } else if (nums[left] == 1 && nums[right] == 0)
		  {
			  left ++ ; right ++ ;
		  } else 
		  {
			  left ++ ; right ++ ;
		  }
		
		}
	
		return nums;
	}
	@Test
	public void Test1()
	{
		int[] nums = { 0,1,1,0,1,0,}; // 1,0,1,0,1,0,
		int[] moveZeros = moveZeros ( nums);
	
		for (int i = 0; i < moveZeros.length; i++) {
			System.out.println(moveZeros[i]);
		}
		
	}
}
