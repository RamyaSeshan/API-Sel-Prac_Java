package Interview_Practise;

import java.util.Iterator;

import org.junit.Test;

public class CountPrime 
{
	@Test
	public void test1()
	{
		int n = 11;
		 int primeCnt = primeCnt(n) ;
		System.out.println("test 1 --- "  + primeCnt);
	}

	public int primeCnt(int n) 
	{
		int k =0;
		int count =0;
		int primeCount =0 ;
		
		
		for (int i = 1; i <= n ; i++) 
		{
			for (k = 1; k <= i; k++) 
			{
				if(i % k == 0) count++;
			}
			
			if (count ==2 )  primeCount++;
			count = 0;
		}
		
		return primeCount ;
	}
}
 