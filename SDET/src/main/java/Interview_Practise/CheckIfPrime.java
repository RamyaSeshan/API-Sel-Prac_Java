package Interview_Practise;

import org.junit.Test;

public class CheckIfPrime
{
	@Test
	public void test1()
	{
		int n = 10;
		boolean checkPrimeNo = checkPrimeNo(n) ;
		System.out.println("est 1 --- " + checkPrimeNo);
	}
	
	@Test
	public void test21()
	{
		int n = 7;
		boolean checkPrimeNo = checkPrimeNo(n) ;
		System.out.println("test 2 --- " + checkPrimeNo);
	}
	
	

	public  boolean checkPrimeNo(int n) {
		
		int count =0 ;
		for (int i = 1; i <= n ; i++) 
		{
			if(n%i == 0) count++;
		}

		if(count == 2 ) return true ;
		else return false;
	}
}
