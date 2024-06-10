package Interview_Practise;

import org.junit.Test;

public class MergeAltStr_LC_1768_WKIII_HW 
{
	// https://leetcode.com/problems/merge-strings-alternately/description/

	@Test
	public void test1()
	{
		String word1 = "abc", word2 = "pqr" ;
		String mergeAlternately = mergeAlternately( word1,  word2) ;
		System.out.println("test1 -- " +mergeAlternately);
	}
	
	@Test
	public void test2()
	{
		String word1 = "ab", word2 = "pqrs" ;
		String mergeAlternately = mergeAlternately( word1,  word2) ;
		System.out.println("test2 -- " +mergeAlternately);
	}
	
	@Test
	public void test3()
	{
		String word1 = "abcd", word2 = "pq" ;
		String mergeAlternately = mergeAlternately( word1,  word2) ;
		System.out.println("test3 -- " +mergeAlternately);
	}
	

	public String mergeAlternately(String word1, String word2) 
	{
	  
		int left =0 , right = 0 ;
		StringBuffer sb = new StringBuffer();
		
		while (left < word1.length() && right < word2.length() )
		{
			sb = sb.append(word1.charAt(left)) ;
			sb = sb.append(word2.charAt(right)) ;
			left ++ ; right ++;
		}
		
		String string = sb.toString()  ;
		
		if (left < word1.length() )
		{			
			return  string + word1.substring(left);
		}
		else if ( right  < word2.length() )
		{
			return  string + word2.substring(right);
		}
		
		
		return string;
    
	}
}
