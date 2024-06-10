package DSA_ClassIv;

import org.junit.Test;

public class Max_Consecutive_Ones_LC_485 {
	
	//https://leetcode.com/problems/max-consecutive-ones/description/
		
public int findMaxConsecutiveOnes(int[] nums) {
        int maxSize =-1; int tempSize =0;
        int left =0 , right =0 ; 
        
        
        while (right < nums.length)  
        {     
           if(nums[right] == 1)
        	{
        		if(right != nums.length )  right ++;       	
        	}          	
        	else  if (nums[right] != 1) 
        	{
        		tempSize =  right - left ;
        	
        		if (maxSize  < tempSize)  {maxSize =  tempSize;  }//3 
        		
        		right ++ ; 
        		left = right ; } 
        }
        
        tempSize=  right - left ;
		if (maxSize  < tempSize)  maxSize =  tempSize;
		
        return maxSize ;
    }

@Test
public void Test1()
{
	int[] nums = {1,0,1,1,0};
	int findMaxConsecutiveOnes = findMaxConsecutiveOnes(nums) ;
	System.out.println(findMaxConsecutiveOnes);	
} 

@Test
public void Test2()
{
	int[] nums = {1,1,0,1,1,1};
	int findMaxConsecutiveOnes = findMaxConsecutiveOnes(nums) ;
	System.out.println(findMaxConsecutiveOnes);	
}
}
