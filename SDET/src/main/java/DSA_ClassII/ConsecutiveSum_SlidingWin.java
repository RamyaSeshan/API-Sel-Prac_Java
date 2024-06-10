package DSA_ClassII;

import org.junit.Test;

// THis was solved by Natraj in class 
public class ConsecutiveSum_SlidingWin {

	private int slidingWindow(int[] nums, int k){ 
		
		//1. one pointer should work  
		int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;  
		
		// not needed second pointer as this is balanced traversal ,right = k-1;      
		//2. Do the required operation till k index  
		
		while(pointer < k)      
		{
			currentSum += nums[pointer++];  
		}
		
		//3. continue the operation for rest of the array 
		
		while( pointer < nums.length)
		{
		max = Math.max(currentSum, max);  
	
		
		//currentSum += nums[pointer];
		//currentSum-= nums[pointer++-k];
		
		currentSum += nums[pointer] - nums[pointer-k];    
		pointer++;  
		}      
		return Math.max(currentSum, max); 
		}

	
	@Test
	public void Test1()
	{
		int [] nums = { 1,5,2,3,7,1};
		 int target =3;
		int conseSum = slidingWindow(nums ,  target);
		System.out.println(conseSum);		
	}
	
	}
	
