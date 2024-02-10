package FreshWorks_Babu_10Feb;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class StringISPalindrome {
	
	// Que : Can we form an Anagram with the given String 
	
	/*
	 * Logic is , if we have 2 or more Key with their respective ( value %2 !=0  ) >=2  ie odd count of charatcers  , then we cant form an anagram 
	 */

	@Test
	public void test1()
	{
		//String s = "amma" ;
		String s = "madamsdd" ;
		Boolean findAnagram = findAnagram(s) ;
		System.out.println(  " findAnagram   " + findAnagram);

	}

	public Boolean findAnagram_Map(String s) 
	{
		Map<Character , Integer> map = new HashMap<Character, Integer>() ;
		int count =0;

		for (int i = 0; i < s.length(); i++) 
		{
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1 ) ;

		}		
		System.out.println(map);

		for (Map.Entry<Character , Integer > entry : map.entrySet() ) 
		{
			if( ( entry.getValue() %2 ) != 0 ) 
			{ count = count + 1 ;      if (count >= 2 ) return false ;      }
		}
		return true ;
	}

	
	public Boolean findAnagram(String s) 
	{
		int[] A = new int[26] ;
		int count =0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			A[ s.charAt(i) - 'a' ]  ++;
		}
		
		for (int i = 0; i < s.length(); i++) 
		{
			if   (  (A[s.charAt(i) - 'a' ]  %2 )  !=0 )
			{
				count = count + 1 ;
				if (count >= 2 ) return false ;  
			}
		}
		
		return true;
		
	}
}
