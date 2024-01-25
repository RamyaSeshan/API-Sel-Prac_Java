package Interview_Practise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Anagram {

	@Test
	public void test1()
	{
		String word1 = "nagaram" ;
		String word2 = "anagram" ;

		Boolean anagram = isAnagram(word1 , word2 ) ;
		System.out.println(anagram);
	}


	@Test
	public void test2()
	{
		String word1 = "text" ;
		String word2 = "rest" ;

		Boolean anagram = isAnagram(word1 , word2 ) ;
		System.out.println(anagram);
	}

	public  Boolean isAnagram_MapLogic(String word1, String word2) {

		if (word1.length() != word2.length() ) return false;

		Map<Character , Integer > mapA = new HashMap<Character , Integer >() ;
		Map<Character , Integer > mapB = new HashMap<Character , Integer >() ;

		for (int i = 0; i < word1.length(); i++) 
		{
			mapA.put(word1.charAt(i), mapA.getOrDefault(word1.charAt(i) , 0) + 1 ) ;
			mapB.put(word2.charAt(i), mapB.getOrDefault(word2.charAt(i) , 0)  + 1 ) ;
		}		

		return mapA.equals(mapB) ;	
	}


	public  Boolean isAnagram(String word1, String word2)
	{		
		if (word1.length() != word2.length() ) return false;
		int[] num1 = new int[26 ];

		for (int i = 0; i < word1.length(); i++) 
		{
			num1[word1.charAt(i) - 'a'] ++;
			num1[word2.charAt(i) - 'a'] --;
		}

		for (int i = 0; i < num1.length; i++) 
		{
			if(num1[i] != 0 ) return false ;
		}
		return true;
	}

}
