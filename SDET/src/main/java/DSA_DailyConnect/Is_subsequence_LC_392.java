package DSA_DailyConnect;

import org.junit.Test;
//https://leetcode.com/problems/is-subsequence/submissions/

public class Is_subsequence_LC_392 {
	
	
	/*	
PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
String s, String t | output boolean

2.Frame Test data (valid, invalid, complex and edge cases)

String s = "abc"; String  t = "ahbgdc" ;
String s = "axc"; String  t = "ahbgdc" ;
String s = "adg"; String  t = "ahbgdc" ;

3.Do you know the Solution?
yes , 2 pointers

4.Do you have any alternate approaches? (Thing of alternate approaches)
No

5. Derive Pseudo code in paper (for the best chosen approach)  //xyzzaz"

	 * PSUEDO code  // "abc", t = "ahbgdc"
	 * 
	 *  intialize 2 pointers  S=0 , T =0
	 *   iterate till T less than String t.len and S < s.len 
	 *    --> check if t.charAT[T] == s.charAT[S]  , cnt = cnt+1 , then S ++ , T ++
	 *    
	 *       else T++ 
	

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes
	 *   
	 */
	
	
public boolean isSubsequence(String s, String t) {
	
	if(s.length() > t.length() ) return false;
	else if (s.equals("")) return true ;
	else if (s.length()==0 || t.length()== 0) return false ;	
	
	int sPointer =0 ,tPointer = 0 ;
	
	while (tPointer < t.length() &&  sPointer <s.length())  
	{
		if(t.charAt(tPointer) == s.charAt(sPointer)) 
		{		
			tPointer++ ;
			sPointer ++;
		} else tPointer++;
	}
	
	if(sPointer== s.length()) return true ;
	else return false;
    }

@Test
public void Test1()
{
	String s = "abc"; String  t = "ahbgdc" ;
	boolean subsequence = isSubsequence( s,  t);
	System.out.println(subsequence);
}

@Test
public void Test2()
{
	String s = "axc"; String  t = "ahbgdc" ;
	boolean subsequence = isSubsequence( s,  t);
	System.out.println(subsequence);
}

@Test
public void Test3()
{
	String s = "adg"; String  t = "ahbgdc" ;
	boolean subsequence = isSubsequence( s,  t);
	System.out.println(subsequence);
}

@Test
public void Test4()
{
	String s = ""; String  t = "ahbgdc" ;
	boolean subsequence = isSubsequence( s,  t);
	System.out.println(subsequence);
}
}
