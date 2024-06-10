package Interview_Practise;

import org.junit.Test;

public class Longest_Palindromic_SubStr_LC_05 
{
	@Test
	public void test1()
	{
		String s = "babad";
		longestPalindrome(s) ;
	}

	public void longestPalindrome(String s) {

		String subStr = s;
		int j;
		//System.out.println("intial subStris -- " +subStr);

		for (int i = subStr.length(); i > 0; i--) 
		{		
			String assString = subStr.substring(0, i  ) ;
			System.out.println("assString is " +assString);
			
			char[] charArray = assString.toCharArray() ;			
			j = charArray.length -1 ;
			
			while (j > 0 )
			{
				if( charArray[0] == charArray[j]) 
				{
					// call palindrome function 
					System.out.println(" call palidrome function for " + charArray[j] + "AND j is " +j);
					String value = s.substring(0, j + 1 ) ;
					System.out.println("-------------value------------------------------" +value);
					j--;
				}
				else  j--;					
			}
			

		}

	}
}
