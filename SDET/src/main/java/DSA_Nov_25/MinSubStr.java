package DSA_Nov_25;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MinSubStr {
	
	/*
	 * Minimum Window Substring:
Given a string S and a string T, find the minimum window in S that contains all the characters of T in complexity O(n).
String S = "ADOBECODEBANC";
String T = "ABC";
// Output: "BANC"

	 */

	
@Test
public void test1()
{
	String s = "ADOBECODEBANC";
	String t = "ABC";
	int minSubStr = minSubStr( s ,  t) ;
	System.out.println(minSubStr);
	
}

public int minSubStr(String s , String t)

{
	int min = Integer.MAX_VALUE  , left =0 , right =0 ,counter  =0;
	Map<Character , Integer> mapT = new HashMap<Character , Integer>() ;
	Map<Character , Integer> mapS = new HashMap<Character , Integer>() ;
	
	for (int i = 0; i < t.length(); i++) {   ///"ADOBECODEBANC";
		mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1) ;
		
	while (mapT.size() != mapS.size())
	{
		if (! mapT.containsKey(s.charAt(right) )) { }
		
             
	
    }
	
}
	return counter; 
	
}  } 







