package mandatoryHomeWork.Week8.Day2;

import org.junit.Test;

/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
input String s  | output String s

2.Frame Test data (valid, invalid, complex and edge cases)

Input: s = "egcfe"
out :efcfe

Input: s = "abcd"
Output: abba

Input: s = "seven"
Output: neven

Input: s = "a"
Output: a

Input: s = "ab"
Output: ba

3.Do you know the Solution?
yes , 2 Pointers

4.Do you have any alternate approaches? (Thing of alternate approaches)
Yes 

5. Derive Pseudo code in paper (for the best chosen approach)  //xyzzaz"



1.If lenght of string is 1 , return s [ if (s.lenght ==1) return s ]
1a. declare a String buffer ans assign String s [ StringBuffer sb = new StringBuffer(s) ]

2.Declare 2 int variables start & end [ int start =0  , end =s.lenght -1]
3.Iterate thur the string till start less than end [ while start < end ]
    if (sb.charAT(start) < sb.charAT(end)  ,set sb char at end to charatcer value present in start 
      [ sb.setCharAt(end,sb.sb.charAT(start); ] start ++ , end --
    else if other wise ,set sb char at start to charatcer value present in end 
      [ sb.setCharAt(start,sb.sb.charAT(end); ] start ++ , end --
   else start ++ , end --
4.convert StringBuffer to String and return

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes
 */

public class Lexicographically_Smallest_Palin_LC_2697 {
	
	  public String makeSmallestPalindrome_Approach1(String s) 
	  {
		
		  if (s.length() ==1) return s ;
		  int start =0  , end =s.length() -1 ;
		  StringBuffer sb = new StringBuffer(s);
		  
		  while(start < end)
		  {
			  if(sb.charAt(start) == sb.charAt(end)) 
			  { start++ ;end-- ;}
			  else if (sb.charAt(start) < sb.charAt(end) )
			  {
				  sb.setCharAt(end,sb.charAt(start));
				  start++ ;end-- ;	  
			  }
			  else
			  {
				  sb.setCharAt(start,sb.charAt(end));
				  start++ ;end-- ;	
		      }
		  }		  
		  
		  return sb.toString();
	  }

	  public String makeSmallestPalindrome(String s) 
	  {
		char[] charArr= s.toCharArray();
		int start = 0 , end =charArr.length-1;
		
		while(start < end)
		{
			if(charArr[start] < charArr[end])
			{
				charArr[end--] =charArr[start++];
			}
			else 
			{
				charArr[start++] =charArr[end--];
			}
		}
		  
		  return new String (charArr);
	  }
	  
@Test
public void Test1()
{
	String s = "egcfe";
	 String makeSmallestPalindrome = makeSmallestPalindrome(s) ;
	 System.out.println(makeSmallestPalindrome);	
}

@Test
public void Test2()
{
	String s = "abcd";
	 String makeSmallestPalindrome = makeSmallestPalindrome(s) ;
	 System.out.println(makeSmallestPalindrome);	
}

@Test
public void Test3()
{
	String s = "seven";
	 String makeSmallestPalindrome = makeSmallestPalindrome(s) ;
	 System.out.println(makeSmallestPalindrome);	
}
@Test
public void Test4()
{
	String s = "a";
	 String makeSmallestPalindrome = makeSmallestPalindrome(s) ;
	 System.out.println(makeSmallestPalindrome);	
}

@Test
public void Test5()
{
	String s = "ab";
	 String makeSmallestPalindrome = makeSmallestPalindrome(s) ;
	 System.out.println(makeSmallestPalindrome);	
}

}
