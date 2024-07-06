package DSA_Addtional.Day4;

import java.util.HashMap;

import org.junit.Test;

public class FindAnagrams_LC438 {
	
	//https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
	
	@Test
	public void test1()
	{
		String s = "cbaebabacd";
		String p = "adc";
		findAllAnagramsUsingSlidingWindow(s,p);
	}
	
	@Test
	public void test2()
	{
		String s = "cb";
		String p = "abc";
		findAllAnagramsUsingSlidingWindow(s,p);
	}
	

	@Test
	public void test3()
	{
		String s = "cbb";
		String p = "abc";
		findAllAnagramsUsingSlidingWindow(s,p);
	}
	
	
	public void findAllAnagramsUsingSlidingWindow(String s, String p) {
		
		int sLen = s.length() , pLen = p.length() ;
		//if (pLen >  sLen) new RuntimeException("Given Input is wrong");		
		if (pLen >  sLen) System.out.println(" Given input is Wrong  ");

		HashMap<Character, Integer> pMap = new HashMap<>();
		HashMap<Character, Integer> sMap = new HashMap<>();
		
		for (int i = 0; i < pLen; i++) 
		{
			pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1) ;
		}
		
		
		for (int i = 0; i < sLen; i++) {
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1) ;
			
			if( i >= pLen)
			{
				char ch = s.charAt(i - pLen) ;
				
				if ( sMap.get(ch) == 1 ) sMap.remove(ch) ;
				else  sMap.put(ch, sMap.get(ch) - 1) ;
			}
			
			//System.out.println("-------------------");
			
			if(sMap.equals(pMap)) {
				System.out.println("Matches !!   -- " +sMap);
			
		}
	}

}
	
}
