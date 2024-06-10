package DSA_ClassIv;

import java.util.Arrays;

import org.junit.Test;

public class Shortest_Distance_LC_821 {
	
	// https://leetcode.com/problems/shortest-distance-to-a-character/description/
	
/*
 * delare 2 pointers left , right and intialize to zero 
 * declare an answers int[] array of size String s
 * check if charatcer at s at right position equals char c 
 *   if it matches iterate thur while loop where left <= right 
 *   --> ans[L] =  math.abs(left - right )  if (left <= right ) left++  AND right = right++ & left = right
 *   if the matche do not happen increment right [ if righ != s.len )
 */
	
public int[] shortestToChar1(String s, char c) { // loveleetcode 
	
     int[] ans = new int[s.length()];
     int left =0 , right =0 ; 
     
     while (right < s.length())
     {
    	 if(s.charAt(right) != c)
    	 {  right ++;  } 
    	 
    	 else if(s.charAt(right) == c)
    	 {
    		 while(left <= right)    	
    		 { ans[left] = Math.abs(right - left);  
    		 left ++;
    		 }
    		 right++;
    	 }    	 
     }	
	return ans;
    }

/*
 * Time an Space Complexity  O[N]
 * 1.declare int values P1 =P2 =0 , left , right  and int array "ans"
 * 2.fill all the values of an with Max Int value 
 * 3.iterate in a while loop till char of input String equal given value at "c" and increment P2
 * 4.assign ans[P2 ] to 0 
 * 5.Iterate in a while loop till P2 less than input string len
 *   --> assign left = P2-1 ; right = P2+1 ;
 *   -->A.iterate in a while loop till left >=P1 || left >=0
 *      --> check and assign min value to ans[left]  ans[left] =Math.min(ans[left], Math.abs(P2 - left)) 
 *      --> decrement left 
 *   -->B.iterate in a while loop till right < s.length() && s.charAt(right)!= c
 *      --> check and assign min value to ans[left]  ans[right] =Math.min(ans[right], Math.abs(P2 - right))
 *      --> increment left 
 *   -->C. Check if right ==  s.length() , then break
 *   -->D. otherwise check if ( s.charAt(right) == c) , the  assign {ans[right]= 0;
 *   -->E. Assign P1 = P2 and P2 = right
 *   
 *   
 */
public int[] shortestToChar2(String s, char c) { // lov el e etcode 
	
    int[] ans = new int[s.length()] ;int P1 =0 , P2 =0  ,left ,right ;
    Arrays.fill(ans, Integer.MAX_VALUE);     
    
    while (P2 < s.length())
    {
    	if(s.charAt(P2) != c) P2++ ;
    	else {break ; }
    }
    ans[P2]= 0;
    
    while (P2 < s.length())
    {
    	left = P2-1 ; right = P2+1 ;
    	
    	while (left >=P1 || left >=0)
    	{
    		ans[left] =Math.min(ans[left], Math.abs(P2 - left)) ;
    		left --;    		
    	}
    	
    	while (right < s.length() && s.charAt(right)!= c)
    	{
    		ans[right] =Math.min(ans[right], Math.abs(P2 - right)) ;
    		right++;
    	}
    	
    	if(right ==  s.length()) {break ;}
    	else if ( s.charAt(right) == c)
    	{ans[right]= 0; }
    		P1 = P2;
    		P2 = right ;   	
   	
    }	
	return ans;
   }

public int[] shortestToChar(String s, char c)
{
	int[] ans = new int[s.length()];  // loveleetcode 
	int lDir , rDir ,lDistance = Integer.MAX_VALUE ,rDistance =  Integer.MAX_VALUE ,lTemp ,rTemp ;
	
  for (int i = 0; i < s.length(); i++) 
  {
	 if(s.charAt(i)== c)
	 {
		 ans[i] =0;
	 }
	 else if (s.charAt(i) != c)
	 {			
		 lDir = i-1 ; rDir = i+1 ;		 
		 while (lDir >= 0)
		 {
			 if(s.charAt(lDir) == c )
			 {
				 lTemp = i-lDir ;
				 lDistance = Math.abs(lTemp);
				 break;
			 } else lDir--;				 
		 }
		 
		 while (rDir < s.length()) // love
		 {
			 if(s.charAt(rDir) == c )
			 {
				 rTemp = i-rDir ;
				 rDistance = Math.abs(rTemp);
				 break;
			 } else   if(s.charAt(rDir) != c ) rDir++;				 
		 }
		 
		 ans[i] = Math.min(rDistance, lDistance) ; 		 
		 lDistance = rDistance = Integer.MAX_VALUE;		 		 
	 }	 
  }	
	return ans;
}


@Test
public void Test1()
{
	String s = "loveleetcode" ;
	char c ='e' ;
	int[] shortestToChar = shortestToChar( s,  c) ;	
	System.out.println(Arrays.toString(shortestToChar));			
}

@Test
public void Test2()
{
	String s = "aaab" ;
	char c ='b' ;
	int[] shortestToChar = shortestToChar( s,  c) ;	
	System.out.println(Arrays.toString(shortestToChar));			
} 




}
