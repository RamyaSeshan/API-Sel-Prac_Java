package mandatoryHomeWork.Week7.Day5;

import org.junit.Test;
 //https://leetcode.com/problems/minimum-additions-to-make-valid-string/

/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
String s ; output int 

2.Frame Test data (valid, invalid, complex and edge cases)
Example 1:

Input: word = "b"
Output: 2
Explanation: Insert the letter "a" right before "b", and the letter "c" right next to "a" to obtain the valid string "abc".
Example 2:

Input: word = "aaa"
Output: 6
Explanation: Insert letters "b" and "c" next to each "a" to obtain the valid string "abcabcabc".
Example 3:

Input: word = "abc"
Output: 0
Explanation: word is already valid. No modifications are needed. 


3.Do you know the Solution?
yes

4.Do you have any alternate approaches? (Thing of alternate approaches)
N0 -- Brute Force 

5. Derive Pseudo code in paper (for the best chosen approach)


int l = word.lenght() , int i=0 ;  int counter =0;  reqCnt =3; totalDigi =0// aaa

while (i < n)
{
  if(s.charAT(i) =='a')
   {  
       counter++;
      i++ ;
    }


 if(i < n && s.charAT(i) =='b')
   {  
       counter++;
      i++ ;
    }

 if(i < n &&  s.charAT(i) =='c')
   {  
       counter ++;
      i++ ;
    }


reqCnt = reqCnt -counter; //2 
counter =0;
totalDigi =totalDigi  + reqCnt ; //2
reqCnt =3;

}
6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes

 */
public class Validstr_LC_2645 {
	
public int addMinimum(String word) {
	
	int n = word.length()  ;int i=0 ;  int counter =0;  int reqCnt =3; int totalDigi =0 ;// aaa

			while (i < n)
			{
			  if(word.charAt(i) =='a')
			   {  counter++;
			      i++ ;
			    }

			 if(i < n && word.charAt(i) =='b')
			   { counter++;
			      i++ ;
			    }

			 if(i < n &&  word.charAt(i) =='c')
			   {  counter ++;
			      i++ ;
			    }

			reqCnt = reqCnt -counter; //2 
			counter =0;
			totalDigi =totalDigi  + reqCnt ; //2
			reqCnt =3;
			}   
			return totalDigi;
    }

@Test
public void Test1()
{
	String word ="abc";
	int addMinimum = addMinimum( word) ;
	System.out.println(addMinimum);		
}

@Test
public void Test2()
{
	String word ="ac";
	int addMinimum = addMinimum( word) ;
	System.out.println(addMinimum);		
}

@Test
public void Test3()
{
	String word ="aaa";
	int addMinimum = addMinimum( word) ;
	System.out.println(addMinimum);		
}

@Test
public void Test4()
{
	String word ="a";
	int addMinimum = addMinimum( word) ;
	System.out.println(addMinimum);		
}

}
