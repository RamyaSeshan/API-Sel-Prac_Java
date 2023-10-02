package DSA_DailyConnect;

/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
String s int

2.Frame Test data (valid, invalid, complex and edge cases)

Input: s = "xyzzaz"
out :1

Input: s = "aababcabc"
Output: 4

Input: s = "a"
Output: 0

Input: s = "aaaaaa"
Output: 0

3.Do you know the Solution?
yes , Sliding Win 

4.Do you have any alternate approaches? (Thing of alternate approaches)
NO

5. Derive Pseudo code in paper (for the best chosen approach)  //xyzzaz"

declate vae int next =0,cnt ;
1.If lenght of string , return 0 [ if (s.lenght ==1) return 0 ]
2. iterate thru the for loop till less than  s.lenght  [ for (int start =0; start <s.lenght ; start ++)
   --> assign next = start+k-1 if next < s.lenght    if (next < s.lenght ) { next = start+k-1 }
   --> iterate thru while loop  [ while (start < = next ]
       --> check if in input string chartat start != chartat start+1 and chartat start != chartat next , if so move to the next condtion ,otherwise continue
             [  s.charAT(start) !=  s.charAT(start+1)  && s.charAT(start) !=  s.charAT(next)  , continue otherwise
           --> check if in string chatAt start+1 inden NOT equal charAT next , if so increament cnt by 1
               [  s.charAT(start+1) !=  s.charAT(next) ] { cnt ++ ; ] 

3.return cnt 
6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes

 */
		

public class Substrings_size_three_distinctCharacters {
	
	  public int countGoodSubstrings(String s) {
		  int next =0 , cnt = 0 ,k=3;
		  if(s.length() < k) { return cnt;}
		  
		  for (int start = 0; start <= s.length()-3; start++)
		  {
			  if(next <=s.length()-1)  { next = start+3-1 ;}
			  
			if(s.charAt(start) != s.charAt(start+1)   &&  s.charAt(start) !=  s.charAt(next))
			{				
				if(s.charAt(start+1) !=  s.charAt(next))
				{							
				 cnt++;
			    }			
		     }		
            }
		  
		  return cnt;
	    }
	
	  
@org.junit.Test
public void Test1()
{
	String s = "xyzzaz";
	int countGoodSubstrings = countGoodSubstrings(s);
	System.out.println(countGoodSubstrings);
}

@org.junit.Test
public void Test2()
{
	String s = "aababcabc";  
	int countGoodSubstrings = countGoodSubstrings(s);
	System.out.println(countGoodSubstrings);
}


@org.junit.Test
public void Test3()
{
	String s = "a";  
	int countGoodSubstrings = countGoodSubstrings(s);
	System.out.println(countGoodSubstrings);
}
	
@org.junit.Test
public void Test4()
{
	String s = "ab";  
	int countGoodSubstrings = countGoodSubstrings(s);
	System.out.println(countGoodSubstrings);
}

@org.junit.Test
public void Test5()
{
	String s = "xyz";  
	int countGoodSubstrings = countGoodSubstrings(s);
	System.out.println(countGoodSubstrings);
}

}

