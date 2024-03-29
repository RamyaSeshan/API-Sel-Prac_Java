package mandatoryHomeWork.Week13.Day5;

import org.junit.Test;

public class Merge_Str_Alt_LC_1768 {
	
	// https://leetcode.com/problems/merge-strings-alternately/
	
	/*/
	 * Psuedo code 
	 * 
	 * declare a StringBuffer 
	 * 
	 * have ledtponier for word1 and rightpointer for word 2
	 * iterate thru word1 till left less than its word 1 lenght  && right less than word2 lenght
	 *   append left poiner charAT word 1 to sb first and then right poiner charAT word 2
	 *   incremtn left & right 
	 * if left < word1.len , take substr of word1 from left and append to sb
	 * if right < word2.len , take substr of word2 from right and append to sb
	 * finally return sb.toString 
	 */
	
	 public String mergeAlternately(String word1, String word2) {
		
		 StringBuffer sb = new StringBuffer();
		 int left =0 , right =0 ;
		 
		 while (left< word1.length() && right < word2.length())
		 {
			 sb.append(word1.charAt(left)) ;
			 sb.append(word2.charAt(right)) ;
			 left++; right ++;
		  }
		 
		 if(left < word1.length())
		 {
			 String sub = word1.substring(left) ;
			 sb.append(sub); }
		 
		 if(right < word2.length())
		 {
			 String sub1 = word2.substring(right) ;
			 sb.append(sub1);
		 }		
		 return sb.toString();	        
	    }

@Test
public void test1()
{
	String word1 = "abc", word2 = "pqr"	  ;
	 String mergeAlternately = mergeAlternately( word1,  word2) ;
	 System.out.println(mergeAlternately);	
}

@Test
public void test2()
{
	String word1 = "ab", word2 = "pqrs"	  ;
	 String mergeAlternately = mergeAlternately( word1,  word2) ;
	 System.out.println(mergeAlternately);	
}


@Test
public void test3()
{
	String word1 = "abcd", word2 = "pq"	  ;
	 String mergeAlternately = mergeAlternately( word1,  word2) ;
	 System.out.println(mergeAlternately);	
}
}
