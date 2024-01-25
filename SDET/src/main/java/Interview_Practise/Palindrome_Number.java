package Interview_Practise;

import org.junit.Test;

public class Palindrome_Number {
	
	@Test
	public void test1()
	{
		//int num = 101 ;
	     int num = 1231 ;
	
		Boolean palindrome = isPalindrome(num ) ;
		System.out.println(palindrome);
	}

	public Boolean isPalindrome(int num) 
	{
		 String val = Integer.toString(num) ;
		 char[] charArray = val.toCharArray() ;
		 
		 int left = 0 , right = charArray.length -1 ;
		 
		 while (left <= charArray.length -1 && right >=0 )
		 {
			if (charArray[left] != charArray[right]) return false ;
			else { left ++ ; right --  ;} 
		 }
		
		return true;		
		
	}

}
