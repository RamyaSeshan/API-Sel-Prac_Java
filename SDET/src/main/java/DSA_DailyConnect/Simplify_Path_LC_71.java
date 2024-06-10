package DSA_DailyConnect;

import java.util.Iterator;
import java.util.Stack;

import org.junit.Test;

public class Simplify_Path_LC_71 {
	
	//https://leetcode.com/problems/simplify-path/
	
	/*
	 * PSUEDO COde 
	 *  intialize a stack , data type -- chaacter 
	 *  iterate thur the String till less than lenght 
	 *  
	 *  if  i==0 && charAT(i) is / or // or /// , push to stack 
	 *  charAT(i) == . || .. , continue 
	 *    i != lenght-1  and charAT(i) == / || // , push to stack 
	 *    
	 * iterate thur thru the stack till its lenght , append it to stringBuffer 
	 * finally , convert stringbuffer to string 	
	 * 
	 */

	 public String simplifyPath(String path) { 
		
	Stack<String> stack = new Stack<String>();
	StringBuffer sb = new StringBuffer();
	Iterator<String> it = stack.iterator() ;	 
	
	String[] split = path.split("/");
	
	for (int i = 0; i < split.length; i++) {
		
		   String value = split[i];		
		   if (! stack.isEmpty()  &&  value.equals("..")) stack.pop();
		   else if (value.equals(".") || value.equals(" ")) continue ;
		   else stack.push(value) ;			
	  }	
	    
	   while (it.hasNext())
	   {  sb.append("/") ;
		  sb.append(it.next()) ;
	   }
		return sb.toString();  			
	 }
	   

@Test
public void Test1()
{
	String path = "/home/" ;
	String simplifyPath = simplifyPath( path) ;
	System.out.println(simplifyPath);
}


@Test
public void Test2()
{
	String path = "/../" ;
	String simplifyPath = simplifyPath( path) ;
	System.out.println(simplifyPath);
}

@Test
public void Test3()
{
	String path = "/home//foo/" ;
	String simplifyPath = simplifyPath( path) ;
	System.out.println(simplifyPath);
} 

@Test
public void Test4()
{
	String path = "/a/./b/../../c/" ; //  /a/b
	String simplifyPath = simplifyPath( path) ;
	System.out.println(simplifyPath);
}


}
