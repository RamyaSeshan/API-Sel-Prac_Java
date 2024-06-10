package Interview_Practise;

import org.junit.Test;

public class firstPalinStr_LC_2108_firstPalinStr
{
	// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/ 
	// took 157 ms  , need to retry 

	@Test
	public void test1()
	{
		String[] words =  { "abc","car","ada","racecar","cool" };
		String firstPalindrome = firstPalindrome( words) ;
		System.out.println( "test1 ---" +firstPalindrome);
	}
	
	@Test
	public void test2()
	{
		String[] words =  { "notapalindrome","racecar" };
		String firstPalindrome = firstPalindrome( words) ;
		System.out.println( "test2 ---" +firstPalindrome);
	}
	
	@Test
	public void test3()
	{
		String[] words =  { "def","ghi" };
		String firstPalindrome = firstPalindrome( words) ;
		System.out.println( "test3 ---" +firstPalindrome);
	}
	

	public String firstPalindrome(String[] words) {
		
		boolean flag ;

		for (int i = 0; i < words.length; i++) 
		{			
			flag = revStr(words[i])  ;
			if (flag) return  words[i];
		}
		
		return "";
	}

	public boolean revStr(String word) 
	{
      int left =0  , right = word.length() -1 ;
      
      while ( left < right ) 
      {
    	  if(word.charAt(left) != word.charAt(right)) return false ;
    	  left ++ ; right --;
      }
        return true ;
	}	

}
