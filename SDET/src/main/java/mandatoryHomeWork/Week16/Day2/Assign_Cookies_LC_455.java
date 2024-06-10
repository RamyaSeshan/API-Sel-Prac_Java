package mandatoryHomeWork.Week16.Day2;

import java.util.Arrays;

import org.junit.Test;

public class Assign_Cookies_LC_455 {
	
	// https://leetcode.com/problems/assign-cookies/description/
	
	/*/
	 * Psuedo Code
	 * 
	 * assign var counter , p1 ,p2
	 * sort both the arrays
	 *  loop thur while loop where p1 < g.len and p2 < s.len
	 *   if g[p1] less than equal to s[p2 ] increment both the pointer and counter  
	 *   otherwise increment only p2
	 */
	 public int findContentChildren(int[] g, int[] s) {  
		 Arrays.sort(s);   Arrays.sort(g); 
		 int counter = 0 ;
		 int gPoint =0 , sPoint =0 ;
		 
		 while (gPoint< g.length && sPoint < s.length) 
		 {
			 if(g[gPoint] <= s[sPoint]) {
				 counter = counter+1;
				 gPoint ++;  sPoint ++;
			 }else 
			 {
				 sPoint ++ ; 
			 }
		 }		 
		 return counter ;
	 }

@Test
public void test1()
{
	int[] g = {1,2,3} ; int[] s = {1,1};
	int findContentChildren = findContentChildren( g, s) ;
	System.out.println(findContentChildren);
	
}
	 

@Test
public void test2()
{
	int[] g = {1,2} ; int[] s = {1,2,3};
	int findContentChildren = findContentChildren( g, s) ;
	System.out.println(findContentChildren);
	
}
	 
	 
}
