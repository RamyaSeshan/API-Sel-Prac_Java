package Interview_Practise;

import org.junit.Test;

public class ThreeDivisors_WKIV_HW_LC_1952 {

	@Test
	public void test1()
	{
		int n = 2; 
		boolean result = isThree(n) ;
		System.out.println( " result is   ---" +result);
	}


	@Test
	public void test2()
	{
		int n = 4; 
		boolean result = isThree(n) ;
		System.out.println( " result is   ---" +result);
	}

	public boolean isThree(int n) {		
		int count = 2 ; // 1 and n are already divisors of n 
		for (int i = 2; i < n ; i++)
		{
			if(n %i  == 0) count ++ ;	
			if (count > 3) return false;
		}

		return count == 3;
	}


}
