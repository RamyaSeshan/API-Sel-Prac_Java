package mandatoryHomeWork.Week14.Day5;

import org.junit.Test;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/

/*
 * Psuedo Code 
 * Split the String by space and get in an String of array
 * declare an StringBuffer 
 * Iterate thur the StringArray 
 *  -- if say , i lenth is StringArraylenght -1 , revere sv and return as String
 *  -- otherise reverse String , finally append a space 
 */

public class Reverse_WordIII_LC_557 {
	
	public String reverseWords(String s) {
		String[] split = s.split(" ") ;
		StringBuffer reversedStr = new StringBuffer();
		StringBuffer sb  =null;
		
		for (int i = 0; i < split.length; i++) {
			 sb = new StringBuffer(split[i]);	
			
			if(i == split.length-1)  {  reversedStr.append(sb.reverse()) ; }
			else
			{
				reversedStr.append(sb.reverse()) ;
				reversedStr.append(' ') ;
			}
		}
		return reversedStr.toString();				
	}

	@Test
public void test1()
{
String  s = "Let's take LeetCode contest" ;
String reverseWords = reverseWords( s)  ;
System.out.println(reverseWords);
		
}
	
	
	@Test
public void test2()
{
String  s = "God Ding" ;
String reverseWords = reverseWords( s)  ;
System.out.println(reverseWords);
		
}
}
