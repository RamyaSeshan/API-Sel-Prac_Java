package Interview_RB;

import java.util.Iterator;

public class RB_Round2 {
	
	/*
	 * string  = xyabpqz

Chandrashekhar Patil (Shekhar)11:53 AM
string  = xyabpqz
rule  * = 1 char is allowed
p1 : xy
p2 : x*a
Chandrashekhar Patil (Shekhar)11:54 AM
p3 : pq**
p4 : *b*

	 */
	
	/*
	 * Psuedo code 
	 * Traverse  thur input till its lenght -1 
	 *   using the indesx compare the first char , it its nacrhes , precess or return false 
	 *     if it matches , look if its *  , any char is allowed  otherwise , exact match ahould be the next char 
	 *     
	 *     return true  [ finally ] 
	 * 
	 */

	
	public static void main(String[] args) 
	{
		
		
    }
	  
	Boolean find_Match (String s , String match )   // string  = x y abpqz  | xy   x*a  | pq**  | *b*  regex -- 
	{
		int j =0; 
		for (int i = 0; i < s.length(); i++) 
		{
			 if(j <= match.length() -1  )
			 {
				if ( match.charAt(j) == '*')  { continue ; }
				else if ( match.charAt(j)  ==  s.charAt(i)) { j++  ; continue ; }
				else return false ;			
		      }				 
		}		
	   return true;	
		
	}

}
