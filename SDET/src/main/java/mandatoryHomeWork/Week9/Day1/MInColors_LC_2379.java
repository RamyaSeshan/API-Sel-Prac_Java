package mandatoryHomeWork.Week9.Day1;

import org.junit.Test;

//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/submissions/

/*
 * Time Complexity O[N] ; Space Complexity = 
 * PSUEDO Code
 * 
==================
PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
String blocks, int k | output int

2.Frame Test data (valid, invalid, complex and edge cases)
Input: blocks = "WBBWWBBWBW", k = 7
Output: 3

Input: blocks = "WBBWWBBWBW", k = 7
Output: 3



3.Do you know the Solution?
yes , 2 pointers

4.Do you have any alternate approaches? (Thing of alternate approaches)
No

5. Derive Pseudo code in paper (for the best chosen approach) 

1.declare an int pointer and int counter  , set minCount as MAX int value  [ int pointer =0 , counter =0 ]
2Iterate thru while loop till poninter less than s.len- k
   take subString from pointer till poniter +k
   iterate thur for loop in the subString till less than its lenght 
  --> check if chart at pointer equals B ,then continue
  --> otherwise counter ++
2.a chekc if minCount > counter , then inCount = counter

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes

=============

 */

public class MInColors_LC_2379 {
	
public int minimumRecolors1(String blocks, int k) {  
	
	int minCounter =Integer.MAX_VALUE ,pointer =0 ,counter = 0 ; String substring =" ";
	
	while (pointer <= blocks.length() - k)
	{
		 substring = blocks.substring(pointer, pointer + k);
		 
		 for (int i = 0; i < substring.length(); i++) 
		 {			 
			 if(substring.charAt(i) == 'B') {continue ;}
			 else { counter++ ;}			
		 }
		 		
		 if (minCounter > counter ) { minCounter = counter ;}
		 counter = 0;
		 pointer ++ ;
	}	
	return minCounter;
    }

public int minimumRecolors(String blocks, int k) {  
	
	int minCounter =Integer.MAX_VALUE ,pointer =0 ,counter = 0 ; 
	
	while (pointer <= blocks.length() - k)
	{
		 for (int i = pointer; i < pointer + k ; i++) 
		 {			 
			 if(blocks.charAt(i) == 'W') 
			 counter++ ;
		 }
		
		if (minCounter > counter ) { minCounter = counter ;}		
		 counter = 0;
		 pointer ++ ;
	}	
	return minCounter;
    }

@Test
public void Test1()
{
	String blocks = "WBBWWBBWBW"; int  k = 7 ;
	int minimumRecolors = minimumRecolors( blocks,  k);
	System.out.println(minimumRecolors);
	
}

@Test
public void Test2()
{
	String blocks = "WBWBBBW"; int  k = 2 ;
	int minimumRecolors = minimumRecolors( blocks,  k);
	System.out.println(minimumRecolors);	
}

@Test
public void Test3()
{
	String blocks = "W"; int  k = 1 ;
	int minimumRecolors = minimumRecolors( blocks,  k);
	System.out.println(minimumRecolors);	
}

@Test
public void Test4()
{
	String blocks = "B"; int  k = 1 ;
	int minimumRecolors = minimumRecolors( blocks,  k);
	System.out.println(minimumRecolors);	
} 

@Test
public void Test5()
{
	String blocks = "WWWW"; int  k = 4 ;
	int minimumRecolors = minimumRecolors( blocks,  k);
	System.out.println(minimumRecolors);	
}

}
