package DSA_ClassVI;

import java.util.Arrays;

import org.junit.Test;

public class Anagram_Array {
	
	public boolean findAnagrams(String s, String p) // anagram usign array
	 {
		if(s.length() != p.length()) return false;
		int[] A = new int[26] ;
		
		for (int i = 0; i < s.length(); i++) {			
			A[ s.charAt(i) - 'a'] ++ ;
			A[ p.charAt(i) -'a'] -- ;			
		 }	
		
		System.out.println(Arrays.toString(A));
		
		for (int i = 0; i < A.length; i++) {		
			if(A[i] !=0) {return false ; }
		}		 
		 return true;
		 
	 }
@Test
public void Test1()
{
	String s = "anagram", t = "nagaram" ;
	boolean findAnagrams = findAnagrams( s,  t) ;
	System.out.println(findAnagrams);	
}

@Test
public void Test2()
{
	String s = "rat", t = "car" ;
	boolean findAnagrams = findAnagrams( s,  t) ;
	System.out.println(findAnagrams);	
}

@Test
public void Test3()
{
	String s = "nl", t = "cx" ;
	boolean findAnagrams = findAnagrams( s,  t) ;
	System.out.println(findAnagrams);	
}
}
