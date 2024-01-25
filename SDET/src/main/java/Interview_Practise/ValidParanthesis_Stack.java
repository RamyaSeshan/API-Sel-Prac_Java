package Interview_Practise;

import java.util.Stack;

import org.junit.Test;

public class ValidParanthesis_Stack {

	@Test
	public void test1()
	{
		String s = "()" ;
		boolean valid = isValid(s) ;
		System.out.println(valid);
		
	}

	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character> () ;
		for (Character input : s.toCharArray()) 
		{
			switch(input )
			{
			case ')':
				if(stack.isEmpty() || stack.peek() != '(') return false;
				else stack.pop() ;
				break;
				
			case '}':
				if(stack.isEmpty() || stack.peek() != '{') return false;
				else stack.pop() ;
				break;
				
			case ']':
				if(stack.isEmpty() || stack.peek() != '[') return false;
				else stack.pop() ;
				break;
			default:
				stack.push(input) ;

			}      
		}		
		 return stack.isEmpty() ;

	}

}
