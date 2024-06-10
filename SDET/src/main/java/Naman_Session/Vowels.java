package Naman_Session;

import org.junit.Test;

public class Vowels { //
	
	/*Problem
	 * Write a program to remove vowels from a String
Example:
Input: "Hi testleaf students"
Output: "H tstlf students"
 /*
  * PSUEDO CODE 
  * input String Output String 
  * traverse thru the input string 
  * check if the character is vowel
  *     if its a vowel , then delete it 
  * 
  */

	public String RemoveVowel()
	{
		//StringBuffer input = new StringBuffer("Hi testleaf students");
		StringBuilder input = new StringBuilder("Hi testleaf students");
		System.out.println(input);
		char[] charArray = {'a','e','i','o','u'};
		
		for (int i = 0; i < input.length(); i++) {
			 for (int j = 0; j < charArray.length; j++) {
				 if(input.charAt(i) == charArray[j])
				 {
					 input.delete(i, i+1);					
				 }				
			}	
		}		
		return input.toString();	
	}

	
	
	@Test
	public void Test1()
	{
		String removeVowel = RemoveVowel();
		System.out.println(removeVowel);
	}
	
	
	
}
