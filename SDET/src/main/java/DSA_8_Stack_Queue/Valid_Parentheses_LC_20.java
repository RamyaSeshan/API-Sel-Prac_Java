package DSA_8_Stack_Queue;

import java.util.Stack;

import org.junit.Test;

public class Valid_Parentheses_LC_20 {
	
	// https://leetcode.com/problems/valid-parentheses/
	
public boolean isValid(String s) {
	
	Stack<Character> stack = new Stack<Character>();
 
	 for (Character input  : s.toCharArray()) 
	 {
		switch(input)
		{
		case ')' :
			if (stack.isEmpty()  ||  stack.peek() != '(')  return false ;
			else {
				 stack.pop() ;
			   }
		break;
		case ']' :
			if (stack.isEmpty() || stack.peek() != '[')  return false ;
			else {
				 stack.pop() ;
			   }
		break;
		case '}' :
			if (stack.isEmpty()  || stack.peek() != '{')  return false ;
			else {
				 stack.pop() ;
			   }
		break;
		default:
			stack.push(input) ;		
		}		
	 }	
	return stack.isEmpty();        
    }


@Test
public void Test1()
{
	String s = "()" ;
	boolean valid = isValid( s);
	System.out.println(valid);
}

@Test
public void Test2()
{
	String s = "()[]{}" ;
	boolean valid = isValid( s);
	System.out.println(valid);}


@Test
public void Test3()
{
	String s = "(]" ;
	boolean valid = isValid( s);
	System.out.println(valid);}



}
