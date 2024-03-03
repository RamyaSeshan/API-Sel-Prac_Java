package Interview_Practise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Isomorphic_Strings_LC_205_Week10_Day5 

// // https://leetcode.com/problems/isomorphic-strings/
{
	@Test
	public void Test1()
	{
		String s = "egg", t = "add" ;
		boolean isomorphic = isIsomorphic( s,  t) ;
		System.out.println(isomorphic);	
	}


	@Test
	public void Test2()
	{
		String s = "foo", t = "bar" ;
		boolean isomorphic = isIsomorphic( s,  t) ;
		System.out.println(  " test2   " +isomorphic);	
	}


	@Test
	public void Test3()
	{
		String s = "paper", t = "title" ;
		boolean isomorphic = isIsomorphic( s,  t) ;
		System.out.println(" test 3 " +isomorphic);	
	}


	@Test
	public void Test4()
	{
		String s = "badc", t = "baba" ;
		boolean isomorphic = isIsomorphic( s,  t) ;
		System.out.println(" test 4 " +isomorphic);	
	}



	public boolean isIsomorphic(String s, String t) {

		Map<Character ,Character> map = new HashMap<Character ,Character>() ;


		for (int i = 0; i < s.length(); i++) 
		{
			//if( s.charAt(i) ==  t.charAt(i) ) continue;
			if ( ! map.containsKey(s.charAt(i)))
			{
				if ( ! map.containsValue(  t.charAt(i) )  )  map.put(s.charAt(i), t.charAt(i));
				else return false ;
			}
			else if( map.get(s.charAt(i) ) != t.charAt(i)  )  return false;

		}

		return true;
	}



}
