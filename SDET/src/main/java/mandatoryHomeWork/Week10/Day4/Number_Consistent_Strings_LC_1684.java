package mandatoryHomeWork.Week10.Day4;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

// https://leetcode.com/problems/count-the-number-of-consistent-strings/submissions/
  /*
   * Time COmplexity -- O [ N ]  ; Space Complexity : O[N]
   * 
   * Psuedo Code 
   *  1.Add all elements of allowed into a set
   *   iterate thur words ,check resence of each charatcer of word in set
   *     --> if words is equal or subset of set , increment counter 
   *  2.return count 
   */

public class Number_Consistent_Strings_LC_1684 {
	
	 public int countConsistentStrings(String allowed, String[] words) {
	 
		  int count = 0;
		  Set<Character> set = new HashSet<Character>();		
		  
		  for (int i = 0; i < allowed.length(); i++) {			  
			   set.add(allowed.charAt(i)) ;
		      }
		
		  for (int i = 0; i < words.length; i++) {
			   
			  char[] charArray = words[i].toCharArray();
			  
			  for (int j = 0; j < charArray.length; j++)
			  {
				  if ( ! set.contains(charArray[j]) )	
				  {
					  break;
				  } else if ( j == charArray.length -1 &&  set.contains(charArray[j]) )	
				  {
					  count ++;
				  }
			  }
	
		    }		  
	
	  return count ;
	 }

@Test
public void Test1()
{
	String allowed = "ab" ;String[]  words = {"ad","bd","aaab","baa","badab"};
	int countConsistentStrings = countConsistentStrings( allowed, words) ;
	System.out.println(countConsistentStrings);
	
}

@Test
public void Test2()
{
	String allowed = "abc" ;String[]  words = {"a","b","c","ab","ac","bc","abc"};
	int countConsistentStrings = countConsistentStrings( allowed, words) ;
	System.out.println(countConsistentStrings);
	
	}


@Test
public void Test3()
{
	String allowed = "cad" ;String[]  words = {"cc","acd","b","ba","bac","bad","ac","d"};
	int countConsistentStrings = countConsistentStrings( allowed, words) ;
	System.out.println(countConsistentStrings);
	
	}
}

