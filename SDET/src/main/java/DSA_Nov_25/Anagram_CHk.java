package DSA_Nov_25;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Anagram_CHk {
	 /*
	  * Given two strings, check if they are anagrams of each other.
String str1 = "listen";
String str2 = "silent";

	  */
	
	@Test
	public void test1()
	{
		String str1 = "listen";
		String str2 = "silent";
		boolean anagramChk = anagramChk(str1 ,str2) ;
		System.out.println(anagramChk);
	}
	
	@Test
	public void test2()
	{
		String str1 = "rat";
		String str2 = "cat";
		boolean anagramChk = anagramChk(str1 ,str2) ;
		System.out.println(anagramChk);
	}
	
	@Test
	public void test3()
	{
		String str1 = "bb";
		String str2 = "bbb";
		boolean anagramChk = anagramChk(str1 ,str2) ;
		System.out.println("from test 3 "+anagramChk);
	}

	 public boolean anagramChk(String s1 , String s2)
	 {
		 if(s1.length() != s2.length() ) return false; 
		 Map<Character , Integer> map1 = new HashMap<Character , Integer>() ;
		 Map<Character , Integer> map2 = new HashMap<Character , Integer>() ;
		 
		 for (int i = 0; i < s1.length(); i++) {
			 map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) +1 ) ;	
			 map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) +1 ) ;	
		    }	 
			 
		 return map1.equals(map2) ;
	 }
}
