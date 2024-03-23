package Interview_Practise;

import org.junit.Test;

public class PalindromeNUmber_LC_09_WHII_HW 

{
	@Test
	public void test1()
	{
		int x = 121 ;
		boolean palindrome = isPalindrome( x) ;
		System.out.println( "test 1 --- " +palindrome);
	}

	@Test
	public void test2()
	{
		int x = 1221 ;
		boolean palindrome = isPalindrome( x) ;
		System.out.println( "test 2 --- " +palindrome);
	}

	@Test
	public void test3()
	{
		int x = -1221 ;
		boolean palindrome = isPalindrome( x) ;
		System.out.println( "test 3 --- " +palindrome);
	}

	@Test
	public void test4()
	{
		int x = 10;
		boolean palindrome = isPalindrome( x) ;
		System.out.println( "test 4 --- " +palindrome);
	}


	public  boolean isPalindrome(int x) {

		char[] charArray = String.valueOf(x).toCharArray() ;

		int l =0 , r = charArray.length -1 ;

		while ( l < r)
		{
			if (charArray[l] != charArray[r]) return false ;
			else if ( charArray[l] == charArray[r] )
			{
				l++ ; r --;
			}
		}
		return true;
	}


	
}
