package DSA_Nov_25;

import org.junit.Test;

public class Palindrome_Str {
	
	/*
	 * Given a string, determine if it is a palindrome, 
	 * considering only alphanumeric characters and ignoring cases. 
	 * String input = "A man, a plan, a canal, Panama!"; // Output: true
	 */
	
	
	/*
	 * Psuedo code
	 * covert the String inot Char Array 
	 *  traverse it thur 
	 *    take first element [ which is String ]
	 *    -->   iterate thur Str
	 *        --> if str.chartAt(i) > 65 && str.chartAt(i)  < = 90 , then  str.chartAt(i) = str.chartAt(i) + 32 
	 *        --> else if str.chartAt(i) 
	 */       
	
	
	@Test
	public void test1()
	{
		 String input = "A man, a plan, a canal, Panama!";	
		 boolean palindrome = isPalindrome( input) ;
		 System.out.println(palindrome);
	}
	
	@Test
	public void test2()
	{
		 String input = "A mman, a plan, a canal, Panama!";	
		 boolean palindrome = isPalindrome( input) ;
		 System.out.println("From test 2  " +palindrome);
	}
	public boolean isPalindrome(String s)
	{
		int left =0 , right = s.length() -1 ;
		
		while (left < right )
		{
			if ( Character.isLetterOrDigit(s.charAt(left))  &&
				Character.isLetterOrDigit(s.charAt(right )) &&
				Character.toLowerCase(s.charAt(right)) == Character.toLowerCase(s.charAt(left)) )
			{
				left ++ ; right --;
			}
			else if ( ! Character.isLetterOrDigit(s.charAt(left)) ) {
				left ++;
			}else if (! Character.isLetterOrDigit(s.charAt(right )))
			{
				right --;
			} else return false ;
		}
		return true;		
	}

}
