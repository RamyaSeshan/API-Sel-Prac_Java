package DSA_ClassI;

import java.util.Arrays;

import org.junit.Test;

/*
 * Using 2 Pointers 
 * Given a sorted array of integers nums and an integer target, return indices of the two numbers such that they add up to target. 
 * Input: nums = [2,3,5,7], target = 9 Output: [0,3] Output: Because nums[0] + nums[3] == 9, we return [0, 3]. 
 */



public class REturnIndices {
	
	public int[] sumofTarget(int[] A , int target )

	{
		int start =0 ; int end = A.length-1 ;
		
	 while ( start <= A.length-1 && end >=0)	
		{
			if(A[start] + A[end] == target)
			{
				return new int[] {start, end};
			}
			else if ( A[start] + A[end] > target )
			{
				end = end-1;
			} else if ( A[start] + A[end] < target )
			{
				start = start +1;
			}			
		}				
		return null;
	}
	
	
@Test
public void Test1()
{
	int[] A = {2,3,5,7};
	int target = 9 ;
	int[] sumofTarget = sumofTarget(A,  target );	
	
	System.out.println(Arrays.toString(sumofTarget));	
}
	

@Test
public void Test2()
{
	int[] A = {2,3,5,5};
	int target = 9 ;
	int[] sumofTarget = sumofTarget(A,  target );	
	
	System.out.println(Arrays.toString(sumofTarget));	
}
	


@Test
public void Test3()
{
	int[] A = {2,3,7,5};
	int target = 9 ;
	int[] sumofTarget = sumofTarget(A,  target );	
	
	System.out.println(Arrays.toString(sumofTarget));	
}
	


@Test
public void Test4()
{
	int[] A = {2,3,7,7,5};
	int target = 9 ;
	int[] sumofTarget = sumofTarget(A,  target );	
	
	System.out.println(Arrays.toString(sumofTarget));	
}
	//nums = [2,3,5,7], target = 9 
}
