package DSA_Nov_25;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LongestSubStr_HW {
	
	/*
	 * 1.	Longest Substring without Repeating Characters:
Hint --  hashmap with 2 pointers , if key available , wil reset left to next char and continue 
Given a string, find the length of the longest substring without repeating characters.
String input = "abcabcbb";
// Output: 3 (for "abc")

	 */
	
	@Test
	public void test1()
	{
		 String s = "abcabcbxyzb";
		 int longestSubStr = longestSubStr( s) ;
		 System.out.println(longestSubStr);
	}
	
	public int longestSubStr(String s) // String input = "a bcabcbb";
	{
		int max = Integer.MIN_VALUE  , left =0 , right = 0 ;
		
		Map<Character , Integer> map = new HashMap<Character , Integer>() ;
		
		while (right <= s.length() -1 )
		{
			if (! map.containsKey(s.charAt(right))  )
			{
				map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1) ;				
				right ++;
			} else 				
			{
				 
				System.out.println(map);
				 System.out.println("counter is .. " +map.size());
				max = Math.max(max, map.size()) ;				
				left ++;
				right = left ;
				map.clear();				
			}
		}		
		return max;		
	}
	

}
