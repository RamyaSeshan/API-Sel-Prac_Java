package mandatoryHomeWork.Week12.Day4;

import java.util.Iterator;
import java.util.Stack;

import org.junit.Test;

public class Remove_adj_duplicate_LC_1047 {
	
	// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
	
    public String removeDuplicates1(String s) { //  took 37 ms 
		
    	if(s.length() == 1) return s;
    	Stack<Character> stack = new Stack<Character> () ;
    	stack.push(s.charAt(0)) ;
    	StringBuffer sb = new StringBuffer();
    
    	
    	for (int i = 1; i < s.length(); i++) {    		
    		if (!stack.empty() && s.charAt(i) == stack.peek()) { stack.pop() ; }
    		else stack.push(s.charAt(i) ) ;	
    		}    
    	
    	Iterator it = stack.iterator()  ;
    	while (it.hasNext())
    	{
    		sb.append(stack.pop()) ;
    	}
    	
    	sb.reverse() ;
    	return sb.toString() ;
        
    }
    
    public String removeDuplicates(String s)
    {
    	char[] stack = new char[s.length() ] ;
    	int i =0 ;
    	
      for (int j = 0; j < s.length(); j++) {
    	  char var = s.charAt(j) ;
    	  
    	  if (i > 0 && stack[i-1] == var ) { i--;  }
    	  else { stack[i] = var ;  i++; }	  
		
	     }    	    	
    	return new String (stack,0,i) ;
    }
    
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

@Test
public void test3()
{
	String s = "abcd";
	String removeDuplicates = removeDuplicates( s) ;
	System.out.println(removeDuplicates);
}
}
