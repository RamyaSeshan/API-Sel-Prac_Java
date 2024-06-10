package mandatoryHomeWork.Week14.Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/

/*

 * Psuedo code

 * delcare a list  and map , int index=0

 * iterate thur lenght of <p , add key as Value of char in p and its count of occurance in value

  * iterate thur lenght of <p till , add key as Value of char in s and its count of occurance in value

 *

  * Check if map_p equals map_s , then add  map value of index to list  , fimally empty map_s

 * Have 2 pointers P1 =0 , P2 = P1 + K

 * iterate thru String s from p2 = P1+ k till < s.lenght

  *  --Remove the element @ p1 to map ; add the element @p2 to map

  *  -- check if map_s size === map_p , then check if map_s= map_p , if equal add element @index P1 to list

 *  --empty map_s increment p1 by 1 and p1 by p1+k-1

  * 

  */
public class All_Anagram_LC_438 { 
	
	public static List<Integer> valid_Anagram1 (String s , String p) // has taken 80 ms

{      List<Integer> list = new ArrayList<Integer>() ;
      if(p.length() > s.length() ) return list;     

      int p1 =0 , p2 =0 ,len = p.length() ;
      char value;
      Map<Character ,Integer > map_S = new HashMap<Character ,Integer > ();
      Map<Character ,Integer > map_P = new HashMap<Character ,Integer > ();

      for (char a : p.toCharArray()) {
             map_P.put(a ,map_P.getOrDefault(a,0)+1 );   }     

       // System.out.println( "map_P is  " +map_P);

      while(p2 < p.length() )
      {value =s.charAt(p2) ;
         map_S.put(value ,map_S.getOrDefault(value ,0)+1 ); p2++ ; }
          //System.out.println( "IT 01 --- >map_S is  " + map_S) ;

      if(map_S.size() == map_P.size() )

      {  if(map_S.equals(map_P) ) list.add(p1);}

      while (p2 < s.length() )

      {    	  
      if(map_S.get(s.charAt(p1) ) == 1)   map_S.remove(s.charAt(p1)) ;
      else {  map_S.put(s.charAt(p1),map_S.get(s.charAt(p1)) -1) ; }
      
      map_S.put(s.charAt(p2),map_S.getOrDefault(s.charAt(p2) ,0)+1 ) ;
     // System.out.println( "IT --- >map_S is  " + map_S);
      //System.out.println( "------------------------------- ");

      if(map_S.size() == map_P.size() )
      {  if(map_S.equals(map_P) ) list.add(p1+1);}

      p1++;
      p2 = p1+len;
      }
       return list;
}

	
	public static List<Integer> valid_Anagram (String s , String p)  // Optimed , takes 8 ms 

	{   List<Integer> list = new ArrayList<Integer>() ;
		int pLen = p.length() ;
		int sLen = s.length() ;
		if (pLen  >  sLen) return list ;
		
		char[] charArray = p.toCharArray() ;		
		int[] p_arr = new int[26];
		int[] s_arr = new int[26];
		
		for (int i = 0; i <pLen; i++) {
			p_arr[ charArray[i] - 'a']  ++;
			s_arr[ s.charAt(i) - 'a']  ++;		
		   }
	
		for (int i = 0; i <= sLen - pLen; i++) 
		 {
			if (  compare_arr( s_arr ,  p_arr) ) 	{ list.add(i) ; } 		  
			s_arr[ s.charAt(i) - 'a']  --;
			
			if(i+pLen < sLen ) { s_arr[ s.charAt(i+pLen) - 'a'] ++; }		
		 }	     
	     return list;
	}
	
	public static boolean compare_arr(int[] s_arr , int[] p_arr)
	{
	  for (int i = 0; i < 26; i++) 
	  {  if(s_arr[i] != p_arr[i]) return false ; }
	   return true;		
	}

/*
 * @Test public void test1() { //String s ="abcdabc", p ="abc" ; //String s
 * ="abcdabcabc", p ="abc" ; //String s ="abcdabcabc", p ="xy" ; String s
 * ="abcabcabc", p ="abcdef" ; List<Integer> valid_Anagram = valid_Anagram ( s ,
 * p) ; System.out.println(valid_Anagram); }
 */
	
/*
 * @Test public void test2() { String s ="cbaebabacd", p ="abc" ; List<Integer>
 * valid_Anagram = valid_Anagram ( s , p) ; System.out.println(valid_Anagram); }
 */
	
@Test
public void test3()
{	 String s  ="abab",  p ="ab" ;
    List<Integer> valid_Anagram = valid_Anagram ( s ,  p) ;
    System.out.println(valid_Anagram);    
}

@Test
public void test4()
{	 String s  ="cbaebabacd",  p ="abc" ;
    List<Integer> valid_Anagram = valid_Anagram ( s ,  p) ;
    System.out.println(valid_Anagram);    
}
}
