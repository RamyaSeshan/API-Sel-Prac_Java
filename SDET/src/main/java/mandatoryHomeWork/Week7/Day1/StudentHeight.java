package mandatoryHomeWork.Week7.Day1;

import java.util.Arrays;

import org.junit.Test;
public class StudentHeight {
	
	/*
	 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
input int[] heights , output int

2.Frame Test data (valid, invalid, complex and edge cases)
Input: s = {10,1,3,4,1}  1,1,3,4,10
Output:  2

Input: s = {1,2,3,4,5}
Output: 0

Input: s = {2,2,2} 
Output: 0


Input: s = {4,2,8}  2,4,8
Output: 3

Input: s = {4} 
Output: 0

Input: s = {10,10,3,4,1}  1,3,4,10,10
Output:  5


3.Do you know the Solution?
yes

4.Do you have any alternate approaches? (Thing of alternate approaches)
N0 -- Brute Force 

5. Derive Pseudo code in paper (for the best chosen approach)
Yes 

Declare an var int cnt
Declare an int Array of same size as input Array  -int [] exp = Arrays.copyOf(input, input.length);
sort the exp array -- arrays.sort(exp)
Iterate thru for loop [ from i=0 till i < input.lenght ] and check if  exp[i] != input[i] , is so increment the cnt 

     
6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes
	 */

	
public int heightChecker(int[] heights) {
	int cnt=0;
	int[] exp = Arrays.copyOf(heights, heights.length);	
	Arrays.sort(exp);	
	for (int i = 0; i < heights.length; i++) {
		if(heights[i] != exp[i]) { cnt = cnt+1;}
	}
	
    return cnt; 
    }
	

@Test
public void Test1()
{
	int[] heights= {10,1,3,4,1} ;
	int heightChecker = heightChecker(heights);
	System.out.println("Test1---" +heightChecker);	
}

@Test
public void Test2()
{
	int[] heights= {1,2,3,4,5} ;
	int heightChecker = heightChecker(heights);
	System.out.println("Test2 ---" +heightChecker);	
}

@Test
public void Test3()
{
	int[] heights= {2,2,2} ;
	int heightChecker = heightChecker(heights);
	System.out.println("Test3---"+heightChecker);	
}

@Test
public void Test4()
{	int[] heights= {4,2,8 };
	int heightChecker = heightChecker(heights);
	System.out.println("Test4---"+heightChecker);	
}

@Test
public void Test5()
{	int[] heights= {4};
	int heightChecker = heightChecker(heights);
	System.out.println("Test5---"+heightChecker);	
}


@Test
public void Test6()
{	int[] heights= {10,10,3,4,1};
	int heightChecker = heightChecker(heights);
	System.out.println("Test6---"+heightChecker);	
}

}
