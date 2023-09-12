package mandatoryHomeWork.Week7.Day2;

import org.junit.Test;
 //https://leetcode.com/problems/number-of-lines-to-write-string/description/

/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
input int[] widths, String s  ; output int[] result 

2.Frame Test data (valid, invalid, complex and edge cases)
Input: s = [All 2;s]
Output:  

Input: s = All 10,s
Output: 0

Input: s = All 5's
Output: 0

3.Do you know the Solution?
yes

4.Do you have any alternate approaches? (Thing of alternate approaches)
N0 -- Brute Force 

5. Derive Pseudo code in paper (for the best chosen approach)
Yes   //abcdefghijklmnopqrstuvwxyz

Declare lineCnt =0 , widthcnt=0
Iterate thru string lenght  for(int i=0 ; i < s.lenght() ; i++)
 -->check if widthcnt < 100 if (widtcnth < ==100)
    --> widthcnt = widthcnt +width[s.charAT[i] -'a'] 
 else if ( widthcnt >= 100 )
   --> lineCnt+= ; widthcnt ==0  ; widthcnt = widthcnt +width[s.charAT[i] -'a']
    
 return result ={   lineCnt , widthcnt };

6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes
 */

public class Number_ines_write_Str {
	
public int[] numberOfLines(int[] widths, String s) {	

	int lineCnt=1; int widthCnt =0; 
	
	for (int i = 0; i < s.length(); i++) {
		
		if(widthCnt <= 100)
		{
			widthCnt = widthCnt +widths[s.charAt(i) -'a'];
			if(widthCnt > 100)
			{
				widthCnt =0;
				lineCnt ++;
				widthCnt = widthCnt +widths[s.charAt(i) -'a'];	
			}
		}			
		
	}	
			
	return new int[]  {lineCnt ,widthCnt };    
    }

@Test
public void Test1()
{
	int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10} ;
	String s = "abcdefghijklmnopqrstuvwxyz";
	int[] numberOfLines = numberOfLines( widths,  s);
	for (int i : numberOfLines) {
		System.out.print("Value is "+ i);
	}
}

@Test
	public void Test2()
	{
		int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10} ;
		String s = "bbbcccdddaaa";
		int[] numberOfLines = numberOfLines( widths,  s);
		for (int i : numberOfLines) {
			System.out.print("Value is "+ i);
		}
		
}

@Test
public void Test3()
{
	int[] widths = {4,2,2,2,12,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2} ;
	String s = "bbbcccdddaaa";
	int[] numberOfLines = numberOfLines( widths,  s);
	for (int i : numberOfLines) {
		System.out.print("Value is "+ i);
	}
	
}


}
