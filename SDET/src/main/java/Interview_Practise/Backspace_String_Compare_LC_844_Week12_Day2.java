package Interview_Practise;

import java.util.Stack;

import org.junit.Test;

public class Backspace_String_Compare_LC_844_Week12_Day2 
{
	//https://leetcode.com/problems/backspace-string-compare/description/

	@Test
	public void Test1()
	{
		String s = "ab#c", t = "ad#c" ;
		boolean backspaceCompare = backspaceCompare( s,  t)  ;
		System.out.println(backspaceCompare);	
	}

	@Test
	public void Test2()
	{
		String s = "ab##", t = "c#d#" ;
		boolean backspaceCompare = backspaceCompare( s,  t)  ;
		System.out.println(backspaceCompare);	
	}
	
	@Test
	public void Test3()
	{
		String s = "a#c", t = "b" ;
		boolean backspaceCompare = backspaceCompare( s,  t)  ;
		System.out.println(backspaceCompare);		}
	
	
	
	public boolean backspaceCompare(String s, String t) {
		Stack<Character > stackS = new Stack<  Character>();
		Stack<Character > stackT = new Stack<  Character>();
		
		for (Character character : s.toCharArray()) 
		{
			if( character != '#') stackS.push(character) ;
			else if ( character == '#'  && ! stackS.empty()) stackS.pop() ;
		}
		
		for (Character character : t.toCharArray()) 
		{
			if( character != '#') stackT.push(character) ;
			else if ( character == '#'  && ! stackT.empty()) stackT.pop() ;
		}
		
		return stackS.equals(stackT);
	}
}