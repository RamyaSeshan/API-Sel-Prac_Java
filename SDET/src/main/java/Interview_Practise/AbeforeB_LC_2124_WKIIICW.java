package Interview_Practise;

import org.junit.Test;

public class AbeforeB_LC_2124_WKIIICW 
{
	// https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/description/

	@Test
	public void test1()
	{
		String s = "aaabbb" ;
		boolean checkString = checkString( s );
		System.out.println(" test1  --- >  " + checkString);		
	}


	@Test
	public void test2()
	{
		String s = "abab" ;
		boolean checkString = checkString( s );
		System.out.println(" test 2  --- >  " + checkString);		
	}

	@Test
	public void test3()
	{
		String s = "bbb" ;
		boolean checkString = checkString( s );
		System.out.println(" test 3  --- >  " + checkString);		
	}
	
	@Test
	public void test4()
	{
		String s = "aa" ;
		boolean checkString = checkString( s );
		System.out.println(" test 4  --- >  " + checkString);		
	}

	public boolean checkString(String s) 
	{
		int indexOf = s.indexOf("b");
		if (indexOf == -1 ) return true ;  // if no b present , return true 
		int i =  indexOf + 1 ;


		while ( i < s.length())
		{
			if (s.charAt(i) == 'a') return false;
			i++;
		}

		return true;
	}
}
