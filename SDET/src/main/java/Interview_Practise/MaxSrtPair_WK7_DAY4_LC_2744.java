package Interview_Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bouncycastle.crypto.tls.HashAlgorithm;
import org.junit.Test;

public class MaxSrtPair_WK7_DAY4_LC_2744 
{
	// https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/

	@Test
	public void test1()
	{
		String[] words = {"cd","ac","dc","ca","zz" };		
		int maximumNumberOfStringPairs = maximumNumberOfStringPairs(words) ;
		System.out.println(maximumNumberOfStringPairs);

	}

	@Test
	public void test2()
	{
		String[] words = {"ab","ba","cc" };		
		int maximumNumberOfStringPairs = maximumNumberOfStringPairs(words) ;
		System.out.println(maximumNumberOfStringPairs);
	}
	

	@Test
	public void test3()
	{
		String[] words = {"aa","ab"};		
		int maximumNumberOfStringPairs = maximumNumberOfStringPairs(words) ;
		System.out.println(maximumNumberOfStringPairs);
	}
	

	public int maximumNumberOfStringPairs(String[] words) 
	{
		Map< String , Integer >  mapA= new HashMap<String, Integer>() ;
		int count =0 ;

		for (int i = 0; i < words.length; i++) 
		{
			String val = words[i];
			char[] charArray = val.toCharArray() ;
			Arrays.sort(charArray);
			String sorted = String.valueOf(charArray) ;

			mapA.put(sorted, mapA.getOrDefault(sorted, 0 ) +1 ) ;	
		}

		for (Map.Entry<String, Integer> entry : mapA.entrySet()) 
		{
			if(entry.getValue() > 1 )   count = count + 1 ;
		}

		return count ;
	}
}
