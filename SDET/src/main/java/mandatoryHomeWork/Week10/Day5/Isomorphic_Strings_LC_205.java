package mandatoryHomeWork.Week10.Day5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

// https://leetcode.com/problems/isomorphic-strings/

/*
 * Time Complexity O[N] ; Space Complexity O[N]
 * 
 * PSUEDO COde
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 

2.Frame Test data (valid, invalid, complex and edge cases)
Example 1:

Input: s = "egg", t = "add"
Output: true

Input: s = "foo", t = "bar"
Output: false

Input: s = "paper", t = "title"
Output: true


3.Do you know the Solution?
yes , using Map & Set

4.Do you have any alternate approaches? (Thing of alternate approaches)
Yes

5. Derive Pseudo code in paper (for the best chosen approach)   
1. add the char as key and its occuranc as value in maps for string s
 * 2.Similarly add t to another map 
 * 3.compare the size f both the map 
 *  -> if it do not matches , return false
 *  --> matches , take the values of 2 map in 2 diffrent set
 *    --> and compare both set , macthes retrun true else false 
 
7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes
 * 
 */
public class Isomorphic_Strings_LC_205 {
	
	 public boolean isIsomorphic1(String s, String t) { // This will NOT work for all Data 
		
	    Map<Character , Integer> mapS = new HashMap<Character , Integer>();
	    Map<Character , Integer> mapT = new HashMap<Character , Integer>();
	    
	    for (int i = 0; i < s.length(); i++) 
	      {	    	
	    mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) +1) ;
	    mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) +1) ;   
	      }

	if(mapS.size() == mapT.size())
	{
		Set<Integer> setS = new HashSet<Integer>(mapS.values()) ;
		Set<Integer> setT = new HashSet<Integer>(mapS.values()) ;
		if(setS.equals(setT)) return true ;
		else return false ;
			
	}else			 
		 return false;		
	    }

	 
	 public boolean isIsomorphic(String s, String t) { // worked and took 10 ms 
			
		    Map<Character , Character> mapS = new HashMap<Character , Character>();		
		    		    
		  for (int i = 0; i < s.length(); i++) {
			  
			  if(! mapS.containsKey(s.charAt(i)) )
			  {
				  if(! mapS.containsValue(t.charAt(i)) )
				      { mapS.put(s.charAt(i), t.charAt(i)) ;}		  
				  else 
					  return false ; 				  
			  }
			  else if (mapS.get(s.charAt(i)) != t.charAt(i) ) 
			   return false;
			  }
		return true;	
		    
	       }    
   
	
	 
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
	System.out.println(isomorphic);	
}

@Test
public void Test3()
{
	String s = "paper", t = "title" ;
	boolean isomorphic = isIsomorphic( s,  t) ;
	System.out.println(isomorphic);	
}

@Test
public void Test4()
{
	String s = "bbbaaaba", t = "aaabbbba" ;
	boolean isomorphic = isIsomorphic( s,  t) ;
	System.out.println(isomorphic);	
}



}
