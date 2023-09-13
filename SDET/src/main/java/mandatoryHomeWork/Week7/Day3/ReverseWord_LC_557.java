package mandatoryHomeWork.Week7.Day3;

import org.junit.Test;

/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
String s ; output String

2.Frame Test data (valid, invalid, complex and edge cases)
Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"

3.Do you know the Solution?
yes

4.Do you have any alternate approaches? (Thing of alternate approaches)
N0 -- Brute Force 

5. Derive Pseudo code in paper (for the best chosen approach)

a.declare an StringBuffer sb 
b.Split s by ""  String[] res = s.split("")
c.Iterate thru  String[] res
  if i is one last String len , append sb with reveres string --> if (i = res.lenght-1 ) { sb.append( rev(res[i] ) }
  otherwise ,append sb with reveres string  and then appen with one space--> else { sb.append( rev(re[i] ) } { sb.append(' ' ) }
d. return sb.toString()


rev(String s)
StrinfBuffer sa = new StrinfBuffer()  
for(int i= s.lenght()  -1 ; i >=0 ; i-- )
{  sa.apped (s.charAT(i)) }

6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes

 */

public class ReverseWord_LC_557 {

	public String reverseWords1(String s) {

		StringBuffer sb = new StringBuffer();
		String[] res = s.split(" ");
		for (int i = 0; i < res.length; i++) {
			if(i == res.length -1) {  sb.append(rev(res[i])) ; }
			else { 
				sb.append(rev(res[i])) ; 
				sb.append(' ');
			}
		}
		return sb.toString();
	}

	public  String rev(String substr) 
	{
		StringBuffer sa = new StringBuffer();
		for (int i = substr.length()-1; i >=0; i--) {			 
			sa.append(substr.charAt(i));			
		}
		return sa.toString();
	}


	public String reverseWords(String s) 
	{		
		String[] val = s.split(" ");
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < val.length; i++) {
			StringBuffer temp = new StringBuffer(val[i]);		
			if(i== val.length-1)
			{
			sb.append(temp.reverse()) ;
			}
			else 
			{
				sb.append(temp.reverse());
				sb.append(' ');
			}
		}

		return sb.toString();

	}

	@Test
	public void Test1()
	{
		String s = "Let's take LeetCode contest";
		String reverseWords = reverseWords( s);
		System.out.println(reverseWords);		 
	}


	@Test
	public void Test2()
	{
		String s = "God Ding";
		String reverseWords = reverseWords( s);
		System.out.println(reverseWords);		 
	}
}
