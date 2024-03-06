package Interview_Practise;

import java.util.Iterator;
import java.util.Stack;

import org.junit.Test;

public class Remove_adj_duplicate_LC_1047_Week12_Day4 
{
	// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
	@Test
	public void test1()
	{
		String s = "abbaca";
		String removeDuplicates = removeDuplicates( s) ;
		System.out.println(removeDuplicates);
	}

	@Test
	public void test2()
	{
		String s = "azxxzy";
		String removeDuplicates = removeDuplicates( s) ;
		System.out.println(removeDuplicates);
	}

	public String removeDuplicates(String s) {

		Stack<Character> stack = new Stack<Character>() ;
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < s.length(); i++) 
		{
			if( !stack.empty() && stack.peek().equals(s.charAt(i)) )
			{
				stack.pop() ;

			}else 
				stack.push(s.charAt(i)) ;
		}

		Iterator it = stack.iterator() ;
		while (it.hasNext())
		{
			sb.append(stack.pop()) ;
		}
		sb.reverse() ;
		return sb.toString();  


	}



}
