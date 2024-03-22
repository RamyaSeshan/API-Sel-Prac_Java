package Interview_Practise;

import org.junit.Test;

public class AddDigits_LC_258_WKII_HW {
	
	// https://leetcode.com/problems/add-digits/submissions/1210805384/
	
	@Test
	public void test1()
	{
		int n = 1234; // 4 + 123  = 127 | 7 + 12 = 19  | 9 + 1 = 10 
		
		int addDigits = addDigits( n) ;
		System.out.println( "test1 --- " + addDigits);
	}

	@Test
	public void test2()
	{
		int n = 38; // 4 + 123  = 127 | 7 + 12 = 19  | 9 + 1 = 10 
		
		int addDigits = addDigits( n) ;
		System.out.println( "test2 --- " + addDigits);
	}
	
	
	@Test
	public void test3()
	{
		int n = 0; // 4 + 123  = 127 | 7 + 12 = 19  | 9 + 1 = 10 
		
		int addDigits = addDigits( n) ;
		System.out.println( "test3 --- " + addDigits);
	}
	
	public int addDigits(int n) 
	{
		int q, r  , sum =0 ;
		
		while (n >= 10)
		{
			r = n %10;
			q = n /10;
			sum = sum + r + q ; // sum if we need to get the sum of digits 
			n = r + q ;
		}
		
		return n ;
	}

}
