package Interview_Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GroupAnagram {
	
	@Test
	public void test1() 
	{
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		ArrayList< List<String> > anagram = isAnagram(strs) ;
		System.out.println(anagram);
	}

	public ArrayList<List<String>> isAnagram(String[] strs) 
	{
		Map<String , List<String>  > map = new HashMap<String ,  List<String>  >() ;
		
		for (int i = 0; i < strs.length; i++) 
		{
			char[] word = strs[i].toCharArray() ;
		
			Arrays.sort(word);
			String sortedWord = String.valueOf(word) ;
			
			if(! map.containsKey(sortedWord) )
			{
				map.put(sortedWord, new ArrayList<String>()) ;
			}
			map.get(sortedWord).add( strs[i]  ) ;
		}
		return new ArrayList<List<String>>(map.values()) ;
	}

}
