package Interview_Practise;

import org.junit.Test;

public class ValidPalindrome_LC_125_WKIIICW 
{
	@Test
	public void test1()
	{
		String s = "A man, a plan, a canal: Panama" ;
		boolean palindrome = isPalindrome( s) ;
		System.out.println(palindrome);
	}
	
	@Test
	public void test2()
	{
		String s = "race a car" ;
		boolean palindrome = isPalindrome( s) ;
		System.out.println("test2 --- " +palindrome);
	}

	

	public  boolean isPalindrome(String s) 
	{
		 
		String replaceAll = s.trim().replaceAll("[^a-zA-Z0-9]", "")   ;
		String[] split = replaceAll.split("//s") ; 
		
		StringBuffer sb= new StringBuffer();
		
		for (int i = 0; i < split.length; i++) 
		{
			sb = sb.append(split[i].trim()   ) ;
		}
		
        // System.out.println("sb is    " +sb);
         String lowerCaseStr = sb.toString().toLowerCase() ;
         
        // System.out.println("lowerCaseStr   is  -- " +lowerCaseStr);
         
         int left =0 , right =  lowerCaseStr.length() -1 ;
         
         while (left < right)
         {
        	 if(lowerCaseStr.charAt(left) !=  lowerCaseStr.charAt(right)) return false ;
        	 left ++;
        	 right -- ;
         }
         
         return true;
	}
}
