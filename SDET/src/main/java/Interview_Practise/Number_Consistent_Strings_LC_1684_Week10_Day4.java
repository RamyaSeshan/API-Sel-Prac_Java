package Interview_Practise;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Number_Consistent_Strings_LC_1684_Week10_Day4 
{
	@Test
	public void Test1()
	{
		String allowed = "ab" ;String[]  words = {"ad","bd","aaab","baa","badab"};
		int countConsistentStrings = countConsistentStrings( allowed, words) ;
		System.out.println(" test1 -->" +countConsistentStrings);

	}
	
	@Test
	public void Test2()
	{
		String allowed = "abc" ;String[]  words = {"a","b","c","ab","ac","bc","abc"};
		int countConsistentStrings = countConsistentStrings( allowed, words) ;
		System.out.println(" test 2 --> " +countConsistentStrings);

	}

	@Test
	public void Test3()
	{
		String allowed = "cad" ;String[]  words = {"cc","acd","b","ba","bac","bad","ac","d"};
		int countConsistentStrings = countConsistentStrings( allowed, words) ;
		System.out.println(" test 3 --> " +countConsistentStrings);

	}
	
	public int countConsistentStrings(String allowed, String[] words) 
	{
		int count =0 ;
		Boolean flag = true;

		Set<Character> set = new HashSet<Character>() ;

		for (int i = 0; i < allowed.length(); i++) 
		{
			set.add(allowed.charAt(i)) ;
		}

		System.out.println(set);

		for (int i = 0; i < words.length; i++) 
		{
			char[] charArray = words[i].toCharArray();
			
			for (int j = 0; j < charArray.length; j++) 
			{
				if( ! set.contains(charArray[j]))
				{
					flag = false ;break ;
				}
			}
			
			if( flag == true) count = count + 1;
			flag = true ;			
		}

		return count;
	}
}
