package DSA_Addtional.Day4;

import java.util.HashSet;

import org.junit.Test;

public class LongestSubString {
	
	// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
	
	@Test
	public void test1()
	{
		String s = "abcabcbb" ;
		int lengthOfLongestSubstring = lengthOfLongestSubstring( s)  ;
		System.out.println( "Test1 ----" +lengthOfLongestSubstring);
	}
	
	@Test
	public void test2()
	{
		String s = "bbbbb" ;
		int lengthOfLongestSubstring = lengthOfLongestSubstring( s)  ;
		System.out.println( "Test2 ----" +lengthOfLongestSubstring);
	}
	
	@Test
	public void test3()
	{
		String s = "pwwkew" ;
		int lengthOfLongestSubstring = lengthOfLongestSubstring( s)  ;
		System.out.println( "Test3 ----" +lengthOfLongestSubstring);
	}

	public int lengthOfLongestSubstring(String s) {
		
		HashSet<Character> set = new HashSet<Character>() ;
		int left =0 , right =0 , max =0;
		
		while ( right < s.length())
		{
			if(set.add(s.charAt(right)))
			{
				max = Math.max(max, set.size()) ;
				right ++;	
			}
			else
			{
				left = left +1;
				right = left ;
				set.clear();
			}
		}
		
		return max;
		
	}

}
