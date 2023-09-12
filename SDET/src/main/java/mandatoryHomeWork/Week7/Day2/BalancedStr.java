package mandatoryHomeWork.Week7.Day2;

import org.junit.Test;

public class BalancedStr {

	 //https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/
	
/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
input String s,  ; output int

2.Frame Test data (valid, invalid, complex and edge cases)
 s= "LRLRLRRRRLLL"
 OUTPUT : 4

s= "LR"
 OUTPUT : 1

s= "LRLR"
 OUTPUT : 2

s= "LLRR"
 OUTPUT : 2

Input: s = "RLRRLLRLRL"
Output: 4

Input: s = "RLRRRLLRLL"
Output: 

Input: s = "LLLLRRRR"
Output: 1

3.Do you know the Solution?
yes

4.Do you have any alternate approaches? (Thing of alternate approaches)
N0 -- Brute Force 

5. Derive Pseudo code in paper (for the best chosen approach)

 //"RLRRLLRLRL"   Lcnt =2, Rcnt =2

DECLARE Lcnt =0 , Rcnt =0 ; splitCnt=0
iterate thru the srring array till its lenght [ for (int i =0 ; i < s.lenght() ; i++ ]
 --> check if charAt i is R , if so increment Rcnt else increment Lcnt [ if (s.charAT(i) ='R" ] { Rcnt = Rcnt+1 } else Lcnt =Lcnt
 --> check Lcnt== Rcnt , then increment splitCnt
      if(Lcnt== Rcnt) 
      { splitCnt =splitCnt+1 ;  Lcnt=0; Rcnt=0} // splitCnt =1 +1+1+1
return  splitCnt


6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes

 */

private void foreach(Class<Character> class1) {
		// TODO Auto-generated method stub
		
	}

public int balancedStringSplit(String s) {
	
	int Lcnt =0 ;int  Rcnt =0 ; int splitCnt=0 ;

	for (int i = 0; i < s.length(); i++) {
		
		if(s.charAt(i) == 'R' )
		  {
			Rcnt  = Rcnt +1	;
		   }
		else { Lcnt= Lcnt+1 ; }
	
		if(Rcnt ==Lcnt )
		{
			splitCnt =splitCnt+1;
			Rcnt =0;
			Lcnt =0;
		}	
	}	
	return splitCnt;  
    }


@Test
public void test1()
{
	String s = "LLLLRRRR";
	int balancedStringSplit = balancedStringSplit(s);
	System.out.println(balancedStringSplit);	
}

@Test
public void test2()
{
	String s = "RLRRRLLRLL";
	int balancedStringSplit = balancedStringSplit(s);
	System.out.println(balancedStringSplit);	
}

@Test
public void test3()
{
	String s = "RLRRLLRLRL";
	int balancedStringSplit = balancedStringSplit(s);
	System.out.println(balancedStringSplit);	
}

@Test
public void test4()
{
	String s = "LRLRLRRRRLLL";
	int balancedStringSplit = balancedStringSplit(s);
	System.out.println(balancedStringSplit);	
}

@Test
public void test5()
{
	String s = "LR";
	int balancedStringSplit = balancedStringSplit(s);
	System.out.println(balancedStringSplit);	
}
}
