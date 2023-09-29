package mandatoryHomeWork.Week9.Day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class Find_all_anagrams_LC_438 {
	
//	/https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
	
 /* NOTE :  --------- THis is wrong approach as test  data 5 will fail  -------------
  * Psuedo code 
  * 
  * declare list , int temp  , counter =0 , set startIndex to P1
  * Iterate till less than lenght of p and take the inetger sum of characters 
  * in for loop iterate from P1 =0 till less than lenght of p and find the char sum  , increment P1
  * if charSum == temp ,add startIndex to list
  * 
  * iterate till P1 less than String lenght 
  *    startIndex to P1
  *   add val at s.charAt[poninter] to charSum
  *   delete s.charAt[poninter - p.len] from charSum
  *   if charSum == temp , add startIndex to list
  *   increment pointer 
  *    * 
  */
	 public List<Integer> findAnagrams1(String s, String p) {
		 
		 List<Integer> list = new ArrayList<Integer>(); 		 
		 if(p.length() > s.length() ) return list;		 
		
		 int pSum = 0 , P1=0 ,index , sum =0;
		 for (int i = 0; i < p.length(); i++) {			 
			 pSum += p.charAt(i);			
		   }
		 
		 index =P1;
		 while  (P1 < p.length() ) 
		     {			 
			 sum += s.charAt(P1);
			 P1++;
		    }
		 if (sum == pSum) {list.add(index) ;}
		 
		 while (P1 < s.length())
		 {
			 index = P1 - p.length()+1;
			 sum += s.charAt(P1);
			 sum = sum - s.charAt(P1 - p.length()) ;
			 
			 if (sum == pSum) {list.add(index) ;}
			 P1++;
		 }	
		  return list;	        
	    }
/*
 * Psuedo code 
 *  Iterate thur for loop till less than lenght of String p and add values to sMap , pMap
 *  if sMap equals  pMap , add the start index to list
 *  assign a int var Pointer  to 1
 *  iterate in a while loop till Pointer  less than s.length() - p.length()
 *    in sMap, add char at index Pointer-1  and reduce  the value by 1
 *    gte the value of  s.charAt(pointer -1 ) , if its zero remove the object 
 *    Add the s.charAt(pointer + pLen -1 to map
 *    check sMap equals  pMap , add the start index to list
 *    increment pointer  
 *    
 *  
 */
	 public List<Integer> findAnagrams(String s, String p)
	 {
		 int pointer =0 , i ;		
		 int pLen = p.length() ;
		 int interval = s.length() - p.length() ;
		 List<Integer> indexAnagram = new ArrayList<Integer>() ;
		 if(p.length() > s.length() ) return indexAnagram;	
		 
		 Map<Character , Integer> sMap = new HashMap<Character , Integer>() ;
		 Map<Character , Integer> pMap = new HashMap<Character , Integer>() ;
		 
		 for ( i = 0; i < p.length(); i++) 
		 {	sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1) ; 		
			pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) +1) ;
		 }		 
	
		 if(sMap.equals(pMap)) { indexAnagram.add(pointer) ;}			
		 //pointer = i;
		 pointer = 1;
		 
		 /*while (pointer <  s.length()) // 86 ms 
		{    
			sMap.put(s.charAt(pointer - pLen), sMap.getOrDefault(s.charAt(pointer - pLen), 0) - 1) ;
			 if(sMap.get(s.charAt(pointer -pLen )) == 0){ sMap.remove(s.charAt(pointer -pLen )) ; }				
			 sMap.put(s.charAt(pointer), sMap.getOrDefault(s.charAt(pointer), 0)+1) ;		
			 if(pMap.equals(sMap)) { indexAnagram.add(pointer -pLen+1 ) ;}			
			 pointer ++;
	    }	*/
		
		 while (pointer <= interval) // 83 ms
			{    
				sMap.put(s.charAt(pointer-1), sMap.getOrDefault(s.charAt(pointer-1), 0) - 1) ;
				 if(sMap.get(s.charAt(pointer -1 )) == 0){ sMap.remove(s.charAt(pointer -1 )) ; }				
				 sMap.put(s.charAt(pointer + pLen -1), sMap.getOrDefault(s.charAt(pointer + pLen -1), 0)+1) ;		
				 if(pMap.equals(sMap)) { indexAnagram.add(pointer ) ;}			
				 pointer ++;
		    }	
		 
		 return indexAnagram;
		 
	 }
@Test
public void Test1()
{
	String s = "cbaebabacd"; String  p = "abc" ;
	List<Integer> findAnagrams = findAnagrams( s,  p) ;
	System.out.println(findAnagrams);	
}

@Test
public void Test2()
{
	String s = "abab"; String  p = "ab" ;
	List<Integer> findAnagrams = findAnagrams( s,  p) ;
	System.out.println(findAnagrams);	
}


@Test
public void Test3()
{
	String s = "ab"; String  p = "abc" ;
	List<Integer> findAnagrams = findAnagrams( s,  p) ;
	System.out.println(findAnagrams);	
}

@Test
public void Test4()
{
	String s = "aa"; String  p = "bb" ;
	List<Integer> findAnagrams = findAnagrams( s,  p) ;
	System.out.println(findAnagrams);	
}

@Test
public void Test5()
{
	String s = "af"; String  p = "be" ;	  
	List<Integer> findAnagrams = findAnagrams( s,  p) ;
	System.out.println(findAnagrams);	
}

}
