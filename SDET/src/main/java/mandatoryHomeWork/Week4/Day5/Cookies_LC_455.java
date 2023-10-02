package mandatoryHomeWork.Week4.Day5;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Cookies_LC_455 {
	
	//https://leetcode.com/problems/assign-cookies/submissions/
 /*
  * Psuedo Code 
  * 
  * Understand Problem -- Yes 
  * Input int[] G | int[] S
  * 
  * Known 1 Approach 
  * Alternate Approach NO
  * 
  * Test Data int G[] {1,2,3 } s[] {3,4,5}
  * G[] {7,8 } s[] {1,2,4}
  * G[] {7,8,2} s[] {1,2}
  * g = [1,2,3], s = [1,1]
  * 
  * Logic
  * 
  * if G.size || s.size == 0 return 0
  * Sort both the input arrays 
  *int childcnt = 0 , int i=0 , int j=0;
  *
  *iterate in whicle loop while i < g.length && cookie < s.lenght 
  *  check if s[j] < = g[i]
  *      childcnt - childcnt+1 ; i++ ; j ++
  *  else cookie++
  *
  *return childcnt
  *
  */
	public int findContentChildren_NOTOK(int[] g, int[] s)
{
	int cnt =0;
	if (g.length ==0 || s.length ==0 ) { return 0;}
	
	Arrays.sort(s); Arrays.sort(g);
	
	for (int i = 0; i < g.length; i++) {
		if(i <= s.length -1)
		{
			if(s[i] >= g[i]) { cnt = cnt +1;} 				
		}
	}
	
	return cnt;
}
	
	public int findContentChildren(int[] g, int[] s)
	{
		int cnt =0; int i=0 ; int cookie =0;
		Arrays.sort(s);  Arrays.sort(g);
		
		if(s.length==0 || g.length==0) {return 0;}
		
		while (i < g.length && cookie < s.length)
		{
			if (s[cookie] >= g[i])
			{
				cnt = cnt+1;
				i++;
				cookie ++;
			}else 
			{
				cookie ++;
			}
		}
		
		return cnt;

	}
	
@Test
public void Test1()
{
	int[] g= {1,2,3};
	int[] s = {1,1};	
	Assert.assertEquals( 1,findContentChildren( g, s));	
}


 @Test public void Test2() { int[] g = {1,2}; int[] s = {1,2,3};
 Assert.assertEquals( 2,findContentChildren( g , s)); }
 

}
