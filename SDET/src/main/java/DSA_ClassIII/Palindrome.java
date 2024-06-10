package DSA_ClassIII;

import org.junit.Test;

public class Palindrome {
	
	/*
	 * 1.delare int var left =0  and right = S.length()-1;
	 * 2.iterate thur for loop till left less than right 
	 *   -->if (S.charAt(left) == S.charAt(right) , increment left and decrement right 
	 *   -- > else return false 
	 * 3.return true 
	 * 
	 * 
	 */
	
	
	public Boolean isPalindrome(String S)
	{
		int left = 0 , right = S.length()-1;
		if( S.length() <=1 ) return false;
		
		while (left < right )
		{
			if (S.charAt(left) == S.charAt(right))
			{
				left++ ; right -- ;
			}else 
			{ return false;} 
		}
	
		return true ;
	}
	
@Test
public void Test1()
{
	String S = "radar";
	 Boolean palindrome = isPalindrome( S);
	 System.out.println(palindrome);	
}


@Test
public void Test2() //daccad
{
	String S = "ramya";
	 Boolean palindrome = isPalindrome( S);
	 System.out.println(palindrome);	
}

@Test
public void Test3() //daccad
{
	String S = "daccad";
	 Boolean palindrome = isPalindrome( S);
	 System.out.println(palindrome);	}

@Test
public void Test4() //daccad
{
	String S = "12321";
	 Boolean palindrome = isPalindrome( S);
	 System.out.println(palindrome);	}

@Test
public void Test5() //daccad
{
	String S = "12322";
	 Boolean palindrome = isPalindrome( S);
	 System.out.println(palindrome);	}

@Test
public void Test6() //daccad
{
	String S = " ";
	 Boolean palindrome = isPalindrome( S);
	 System.out.println(palindrome);	}

@Test
public void Test7() //daccad
{
	String S = "a";
	 Boolean palindrome = isPalindrome( S);
	 System.out.println(palindrome);	}

@Test
public void Test8() //daccad
{
	String S = "aA";
	 Boolean palindrome = isPalindrome( S);
	 System.out.println(palindrome);	}
}
