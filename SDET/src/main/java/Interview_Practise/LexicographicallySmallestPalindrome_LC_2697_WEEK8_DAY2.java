package Interview_Practise;

import org.junit.Test;

public class LexicographicallySmallestPalindrome_LC_2697_WEEK8_DAY2 
{
	@Test
	public void test1()
	{
		String s = "egcfe" ;
		String makeSmallestPalindrome = makeSmallestPalindrome( s)  ;
		System.out.println( makeSmallestPalindrome );		
	}
	
	@Test
	public void test2()
	{
		String s = "abcd" ;
		String makeSmallestPalindrome = makeSmallestPalindrome( s)  ;
		System.out.println( makeSmallestPalindrome );		
	}
	
	@Test
	public void test3()
	{
		String s = "seven" ;
		String makeSmallestPalindrome = makeSmallestPalindrome( s)  ;
		System.out.println( makeSmallestPalindrome );		
	}

	public String makeSmallestPalindrome(String s)
	{
		char[] charArray = s.toCharArray() ;
		int left =0 , right = s.length() - 1 ;
		
		while ( left < right) 
		{
			if (charArray [left] > charArray [right])
			{
				charArray [left]  =  charArray [right];
			}
			else if ( left < right) 
				charArray [right] = charArray [left]  ;
			
			left ++ ; right --;
		} 
		
		return String.valueOf(charArray)  ;

	}
}
