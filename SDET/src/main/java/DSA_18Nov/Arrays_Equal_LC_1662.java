package DSA_18Nov;

import org.junit.Test;

public class Arrays_Equal_LC_1662 {

	// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
	
	/*
	 * BF -- Psuedo code 
	 *    iterate thur array 1 , append one by one to StringBuffer 
	 *    DO the same for array 2
	 *    convert to string and chekc if string 1 equals string 2
	 *    
	 *    Time complexity O[N] + O[N] 
	 */
	
	@Test()
	public void test3()
	{
		String[] word1 = {"abc", "d", "defg"}  ;
		String[] word2 = {"abcddefg"} ;
	 boolean arrayStringsAreEqual = arrayStringsAreEqual( word1,  word2) ;
	 System.out.println("From test 3 "   +arrayStringsAreEqual);
	}
	
	
	@Test()
	public void test2()
	{
		String[] word1 = {"a", "cb"}  ;
		String[] word2 = {"ab", "c"} ;
	 boolean arrayStringsAreEqual = arrayStringsAreEqual( word1,  word2) ;
	 System.out.println("From test 2 "   +arrayStringsAreEqual);
	}
	
	@Test()
	public void test1()
	{
		String[] word1 = {"ab", "c" }  ;
		String[] word2 = {"a", "bc"} ;
	 boolean arrayStringsAreEqual = arrayStringsAreEqual( word1,  word2) ;
	 System.out.println(arrayStringsAreEqual);
	}
	
	
	 public boolean arrayStringsAreEqual(String[] word1, String[] word2) { // takes 0ms 
		
		 StringBuffer w1 = new  StringBuffer();
		 StringBuffer w2 = new  StringBuffer();
		 
		 for (String string : word1) { 		  
			 w1 = w1.append(string);			
		}
		 
		 
		 for (String string : word2) {
			 w2 = w2.append(string);
		}		 
		 
		 return w1.toString().equals(w2.toString() ) ;	
	        
	    }
}
