package mandatoryHomeWork.Week15.Day2;

import org.junit.Test;

public class ValidAnagram_LC_242 {
	//https://leetcode.com/problems/valid-anagram/description/
	
	/* 
	 * Psuedo code 
	 * if s.lenght != t.lenght return false 
	 * declare  an int array of size 26 
	 * iterate thru for loop for one of the String 
	 *  -- increment  at stringchar -'a' index for one String 
	 *  -- decrement  at stringchar -'a' index for next String 
	 * 
	 * iterate thur for loop on the array once again
	 *  -- if array value !=0 , return false 
	 * finally return true  
	 *   
	 *  
	 */

	  public boolean isAnagram(String s, String p) {
		if(s.length() != p.length()) return false ;
		int[] A =new int[26] ;
		
		for (int i = 0; i < s.length(); i++) 
		{
			A[s.charAt(i) - 'a'] ++;
			A[p.charAt(i) - 'a'] --;
		}
		  
		for (int i = 0; i < A.length; i++) 
		{
			if(A[i] != 0) return false ;
		} 
		  
		  return true;		  
	  }
	  
	  
@Test
public void test1()
{
	String s = "anagram", t = "nagaram" ;
	boolean anagram = isAnagram( s,  t) ;
	System.out.println(anagram);
}
	  
}
