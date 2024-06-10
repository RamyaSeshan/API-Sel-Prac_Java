package mandatoryHomeWork.Week12.Day2;

import java.util.Stack;

import org.junit.Test;

public class Backspace_String_Compare_LC_844 {

	
	 // https://leetcode.com/problems/backspace-string-compare/
	/*
	 * Psuedo code 
	 * create a stack S , stack T
	 * Iterate it thru String s , push if char !=# , pop it if char == #
	 * Similarly , Iterate it thru String t , push if char !=# , pop it if char == #
	 * check if Stack S and T are equal 
	 * 
	 */
	
	 public boolean backspaceCompare(String s, String t) {
			Stack<Character> stackS = new Stack<Character>();
			Stack<Character> stackT = new Stack<Character>();			
			
			
		for (Character character : s.toCharArray()) {
			if (character != '#'  ) stackS.push(character) ;
			else if (stackS.empty()   && character == '#'  ) continue ;
			else if 	
			(! stackS.empty() && character == '#' ) { stackS.pop() ;}
		}	
		 
		for (Character character : t.toCharArray()) {
			if (character != '#'  ) stackT.push(character) ;
			else if (stackT.empty()   && character == '#'  ) continue ;
			else if 	
			(! stackT.empty() && character == '#' ) { stackT.pop() ;}			
		} 
		
		if (stackS.equals(stackT)) return true;
		 
		else return false;
	        
	    }
	 
	 
	 
	 @Test
	 public void Test4()
	 {
	 	String s = "a##c", t = "#a#c" ; // c   c
	 	 boolean backspaceCompare = backspaceCompare( s,  t)  ;
	 	 System.out.println(backspaceCompare);	
	 }
	 
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
	 System.out.println("The result of test 3 is    "+backspaceCompare);	
}




}
