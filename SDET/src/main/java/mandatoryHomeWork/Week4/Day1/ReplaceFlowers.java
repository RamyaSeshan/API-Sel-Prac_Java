package mandatoryHomeWork.Week4.Day1;

import org.junit.Assert;
import org.junit.Test;

//https://leetcode.com/problems/can-place-flowers/


public class ReplaceFlowers { // [1,0,0,0,1], n = 1  [1,0,0,0,1]
	
	public boolean FlowerReplace(int[] A , int N)
	{
		int i=0;
		while ( i < A.length  && N > 0)
		{
			if(A[i]==1 && A[i+2] != 1)
			{
				A[i+2] =1 ; N=N-1;
			}
			
			if(A[i]== 0 && A[i+1] != 1)
			{
				A[i+1] =1 ;N =N-1 ;
			}
		}
		
		if (N==0) return true;
		else 	return false;		
	}
	
	@Test
	public void Test1()
	{
		int[] A = {1,0,0,0,1};
		Assert.assertEquals(true, FlowerReplace( A , 1));
	}

	@Test
	public void Test2()
	{
		int[] A = {1,0,0,0,1};
		Assert.assertEquals(false, FlowerReplace( A , 2));
	}
	
	@Test
	public void Test3()
	{
		int[] A = {0,0,0,0,0};
		Assert.assertEquals(false, FlowerReplace( A , 2));
	}
	
	@Test
	public void Test4()
	{
		int[] A = {0,1,0,0,0,0,0};
		Assert.assertEquals(false, FlowerReplace( A , 1));
	}
	
	@Test
	public void Test5()
	{
		int[] A = {0,1,0,0,0,0,0};
		Assert.assertEquals(false, FlowerReplace( A , 2));
	}
}
