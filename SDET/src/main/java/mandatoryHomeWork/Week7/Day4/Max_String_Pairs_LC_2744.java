package mandatoryHomeWork.Week7.Day4;

import org.junit.Test;

public class Max_String_Pairs_LC_2744 {
	
	//https://leetcode.com/problems/find-maximum-number-of-string-pairs/submissions/
	
	/*
	 * Psuedo COde
	 * 
	 * iterate thur words till right less than equal  words.length -1 
	 *   get the value of words -- string in temp var 
	 *   get the next word in StringBuffer 
	 *   reverse next word
	 *   check if tmep equals revered string buffer 
	 *      then increment cout , left , right by left +1 
	 *   otherwise incrememt right 
	 *     check if right > words.length -1  , then increment left by 1 and ser right ot left +1 
	 */

	 public int maximumNumberOfStringPairs(String[] words) { //"aa","wj","zp","df","xb","sa","jw","pz"
	     
		 if (words.length ==1 ) { return 0 ;} 
		 int count = 0 ,left =0 , right = left + 1; 
		 StringBuffer A = new StringBuffer();
		 
		 String temp ="";
		 
		while( right <= words.length -1   )
		{
			 temp = words[left] ;			 
			 A.append(words[right]) ;
			 A.reverse() ;
			 
			 if(temp.equals(A.toString())) 
			 { 
				 count ++ ; 
				 left = left + 1 ; right = left + 1 ; 
			 }
			 else 
			 {
				 right ++ ;
				 if (right > words.length -1 )  {left ++; right = left +1  ; }
				 } 
			
			 A.setLength(0);	 
			}
		 return count;
	 }

	 
	 @Test
	 public void Test1() // words = ["ab","ba","cc"]
	 {
		String[]  words = {"cd","ac","dc","ca","zz"};
		int maximumNumberOfStringPairs = maximumNumberOfStringPairs(words);
		System.out.println(maximumNumberOfStringPairs);
	 }
	 
	 @Test 
	 public void Test2() // words = ["ab","ba","cc"]
	 {
		String[]  words = {"ab","ba","cc"};
		int maximumNumberOfStringPairs = maximumNumberOfStringPairs(words);
		System.out.println(maximumNumberOfStringPairs);
	 }
	 
	 @Test 
	 public void Test3() // words = ["ab","ba","cc"]
	 {
		String[]  words = {"aa","ab"};
		int maximumNumberOfStringPairs = maximumNumberOfStringPairs(words);
		System.out.println(maximumNumberOfStringPairs);
	 }
	 
	 
	 @Test 
	 public void Test4() // words = ["ab","ba","cc"]
	 {
		String[]  words = {"aa"};
		int maximumNumberOfStringPairs = maximumNumberOfStringPairs(words);
		System.out.println(maximumNumberOfStringPairs);
	 } 
	 
	 @Test 
	 public void Test5() // words = ["ab","ba","cc"]
	 {
		String[]  words = {"aa","wj","zp","df","xb","sa","jw","pz"};
		int maximumNumberOfStringPairs = maximumNumberOfStringPairs(words);
		System.out.println(maximumNumberOfStringPairs);
	 }
}
