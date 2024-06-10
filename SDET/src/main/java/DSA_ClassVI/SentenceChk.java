package DSA_ClassVI;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SentenceChk {
	
	/*
	 * Given a string, validate you have all the characters of a-z
    
    words only in lowercase and whitespace
    return - true or false
	 */
	
	public boolean ChkSen1(String s)
	{
		int[] A = new int[26];
		//StringBuffer sb = new StringBuffer();
		
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			
			String res = split[i];
			
			for (int j = 0; j < res.length(); j++) {
				A[res.charAt(j)- 'a'] ++;
			}
			
		}
		 
		for (int i = 0; i < A.length; i++) {
			if(A[i] < 0) {return false ;}
		}
		return true;
		
	}
	
	public boolean ChkSen(String s) // using Hashset 
	{
		Set<Character> set = new HashSet<Character>() ;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) != ' ')
			{
				set.add(s.charAt(i)) ;	}			
		    }
		
		return set.size() == 26 ;		
			
	}
	
@Test
	public void test1()
	{
		String s = " This is Ramya " ;
		boolean chkSen = ChkSen( s) ;
		System.out.println(chkSen);		
	}
}
