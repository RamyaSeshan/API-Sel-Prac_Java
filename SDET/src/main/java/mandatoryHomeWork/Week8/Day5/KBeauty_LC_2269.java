package mandatoryHomeWork.Week8.Day5;

import org.junit.Test;

//https://leetcode.com/problems/find-the-k-beauty-of-a-number/submissions/

/*
 * ==================
PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
int num, int k| output int

2.Frame Test data (valid, invalid, complex and edge cases)
Input: num = 240, k = 2
Output: 2

Input: num = 430043, k = 2
Output: 2


Input: num = 1, k = 1
Output: 1

3.Do you know the Solution?
yes , 2 pointers

4.Do you have any alternate approaches? (Thing of alternate approaches)
No

5. Derive Pseudo code in paper (for the best chosen approach)  //xyzzaz"

1.convert nums to String , declare a pointer = 0, int temp , int counter
2.Iterate while pointer less than String len - k  [ pointer < s.lenght() -k )
  a. if pointer less than or equal to s.lenght() -k  , take the substring from counter to counter+k 
    otherwise take substring from pointer till end [ String subStr ] 
  b. convert subStr to int [ temp = Interger.parseInt(subStr) ] 
  c. ckeck if temp is divisible by nums  ,then increment counter [if (nums % temp == 0) counter++ ] 

3.return counter 


7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes

=============Time Complexity O[N] + O[N] + O[N] = O[3N] ; Space Complexity 
 */

public class KBeauty_LC_2269 {
public int divisorSubstrings(int num, int k) {
	
	String s = ""+num; 
	
	int conter  =0 , pointer =0 ,temp , counter =0 ;  // 430043 k = 2 
	String substring ="";
	
	while (pointer <= s.length() - k ) 
	{
		if(pointer < s.length() - k ) 
		{ 
			substring= s.substring(pointer, k+pointer) ;			
		}else if(pointer == s.length() - k ) 
		{
			substring= s.substring(pointer) ;
		}
		
		temp = Integer.parseInt(substring);
		
		if(temp !=0 && num % temp == 0 )  {counter++;}	    
		
		pointer ++;		
	}
	return counter;
    }



@Test
public void Test1()
{
	 int num = 430043, k = 2 ;
	 int divisorSubstrings = divisorSubstrings( num,  k) ;
	 System.out.println(divisorSubstrings); 
}

@Test
public void Test2()
{
	 int num = 240, k = 2 ;
	 int divisorSubstrings = divisorSubstrings( num,  k) ;
	 System.out.println(divisorSubstrings); 
}

@Test
public void Test3()
{
	 int num = 24, k = 2 ;
	 int divisorSubstrings = divisorSubstrings( num,  k) ;
	 System.out.println(divisorSubstrings); 
}


@Test
public void Test4()
{
	 int num = 24, k = 1 ;
	 int divisorSubstrings = divisorSubstrings( num,  k) ;
	 System.out.println(divisorSubstrings); 
}

@Test
public void Test5()
{
	 int num = 8, k = 1 ;
	 int divisorSubstrings = divisorSubstrings( num,  k) ;
	 System.out.println(divisorSubstrings); 
}


}
