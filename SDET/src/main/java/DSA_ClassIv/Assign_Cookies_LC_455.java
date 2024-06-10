package DSA_ClassIv;

import java.util.Arrays;

import org.junit.Test;

public class Assign_Cookies_LC_455 {
	
	// https://leetcode.com/problems/assign-cookies/
	
	/*
	 * PSUEDO Code 
	 * sory both the array 
	 * declare count =0 
	 * declare 2 pointers sPointer and gPointer 
	 * iterate while sPointer then than s.lenght and  gPointer less than g.lenght
	 * 
	 *    check if s[sPointer]  <  g[gPointer ] sPointer != s.len sPointer ++
	 *    check if s[sPointer]  >=  g[gPointer ] , couter ++ then sPointer != s.len sPointer ++ and gPointer!= g.len gPointer++
	 *   
	 * 
	 */
	
	 public int findContentChildren(int[] g, int[] s) {
		 int count =0 ;
		 if (s.length ==0 ) return count;
		 
	     Arrays.sort(s);
		 Arrays.sort(g);
		 
		 int sPointer =0 , gPointer =0 ; 
		 
		 while (sPointer < s.length &&  gPointer < g.length)
		 {
			 if( s[sPointer]  <  g[gPointer ]) { if(sPointer != s.length ) sPointer++; }
			 else if ( s[sPointer]  >=  g[gPointer ] )
			 {
				 count++;
				 if(sPointer != s.length )   {sPointer++; }
				 if(gPointer != g.length )   {gPointer++; }				 
			 }			
		 }
	
		 return count;	        
	    }

	 @Test
	 public void Test1()
	 {
		 int[] g = {1,2,3} ; int[] s = {1,1} ;
		 int findContentChildren = findContentChildren( g,  s) ;
		 System.out.println(findContentChildren);		 
	 }
	 
	 
	 @Test
	 public void Test2()
	 {
		 int[] g = {1,2} ; int[] s = {1,2,3} ;
		 int findContentChildren = findContentChildren( g,  s) ;
		 System.out.println(findContentChildren);		 
	}
	 
	 
	 @Test
	 public void Test3()
	 {
		 int[] g = {1} ; int[] s = {} ;
		 int findContentChildren = findContentChildren( g,  s) ;
		 System.out.println(findContentChildren);		 
	}
	 
	 @Test
	 public void Test4()
	 {
		 int[] g = {1} ; int[] s = {2} ;
		 int findContentChildren = findContentChildren( g,  s) ;
		 System.out.println(findContentChildren);		 
	}
	 
	 @Test
	 public void Test5()
	 {
		 int[] g = {3} ; int[] s = {2} ;
		 int findContentChildren = findContentChildren( g,  s) ;
		 System.out.println(findContentChildren);		 
	}
	 
	 @Test
	 public void Test6()
	 {
		 int[] g = {2} ; int[] s = {2} ;
		 int findContentChildren = findContentChildren( g,  s) ;
		 System.out.println(findContentChildren);		 
	}
	 
	 @Test
	 public void Test7()
	 {
		 int[] g = {4,5} ; int[] s = {2} ;
		 int findContentChildren = findContentChildren( g,  s) ;
		 System.out.println(findContentChildren);		 
	}
}
