package DSA_Nov_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Grp_Anagram {
	
	/*
	 * Given an array of strings, group anagrams together.
String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	 */

	
	/*
	 * BF approach  
	 * convert String array to list 
	 *  iterate in while loop till list size > 0
	 *    have 2 pointers ,p1 =0 , p2 = size -1 
	 *    with nagram function , chk if p1 is anagram of p2
	 *     --> yes , add p2 to list1 [ of String ] , delete list[p2] from list 
	 *     --> make p2 as p2-1 and P2 < p1
	 *    
	 */
	
	//public List<List<Integer >> list 

	@Test
	public void test1()
	{
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		ArrayList<List<String>> anagram_Grp = isAnagram_Grp(strs)  ;
		System.out.println(anagram_Grp);
	}
	
	public ArrayList<List<String>> isAnagram_Grp(String[] str) 
	{
		 Map<String	 , List<String > > map = new HashMap<String, List<String >>() ;
		 
		 for (int i = 0; i < str.length; i++) {
			 
			 char[] word = str[i].toCharArray() ;
			 Arrays.sort(word);
			 
			 String sortedWord = String.valueOf(word) ;
			 
			 if(! map.containsKey(sortedWord)  )
			 {
				 map.put(sortedWord, new ArrayList<String>()) ;
			 }
				 map.get(sortedWord).add(str[i]) ;			 
		}
		return new ArrayList<List<String>>(map.values()) ;	 		
	  }
}
