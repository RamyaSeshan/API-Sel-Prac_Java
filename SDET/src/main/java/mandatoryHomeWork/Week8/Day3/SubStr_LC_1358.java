package mandatoryHomeWork.Week8.Day3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/

/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
String s| output int

2.Frame Test data (valid, invalid, complex and edge cases)
String s
Input: nums = [4,5,6,7,8,9], diff = 2
Output: 2

String s

Input: s = "abc"
Output: 1

3.Do you know the Solution?
yes , 2 pointers

4.Do you have any alternate approaches? (Thing of alternate approaches)
No

5. Derive Pseudo code in paper (for the best chosen approach)  //xyzzaz"

convert string input to charArr --InputcharArray
a.declare 2 var k, P1,P2 and count [int k = 3 , count =0 ]
b.Iterate thru the for loop [for (P1=0; P1<s.lenght()-K ; P1++ )
  assign P2 to P1+K-1[ P2 = P1+K-1]
  Iterate thur do while loop 
  do
{	
  Iterate thur the for loop from P3 till P3 <= P2
1.  for (P3=P1; P3<=P2 ; P3++ )
{
  if(map.keySet().contains(s.charAT(P3)))
    {map.put ( InputcharArray[P3] , map.get(InputcharArray[P3])+1   )   } 
     else 
     {map.put( InputcharArray[P3] ,1}
}

2.if map.size ==3 , increment counter 
3.increment P2++ ;
} 
while ( P2 < = s.len()-1  )

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes

 */

public class SubStr_LC_1358 {
	
	public int numberOfSubstrings(String s) { //abcabc  len-P +1 == couter +this 
		
		 int P1=0 , P2 ,count=0, index=0;
		 Set<Character> set = new HashSet<Character>();	
				
		 while (index <= s.length() - 3)
		 {
			 for ( P1 = index; P1 < index+3; P1++) 
			 {
				if (! set.contains(s.charAt(P1)))
				{
					set.add(s.charAt(P1)) ;
				}		 
		      }
			 
			 if(set.size() ==3 ) count++;
			 P2 = P1;
			
			 while(P2 <= s.length()-1)
			 {
				 for ( int i = index; i <=P2; i++) 
				 {
					 if (! set.contains(s.charAt(i)))
						{
							set.add(s.charAt(i)) ;
						}
		         }
				 if(set.size() ==3 ) count++; 
				 P2++;
			 }			
			 set.clear();
			 index++;			 
		 }
	
		 return count;
        }
	
/*@Test
public void Test1()
{
	String  s = "abcabc";
	int numberOfSubstrings = numberOfSubstrings( s);
	System.out.println(numberOfSubstrings);	
}
	
@Test
public void Test2(){
	String  s = "aaacb";
	int numberOfSubstrings = numberOfSubstrings( s);
	System.out.println(numberOfSubstrings);	
}

@Test
public void Test3(){
	String  s = "acb";
	int numberOfSubstrings = numberOfSubstrings( s);
	System.out.println(numberOfSubstrings);	
}

@Test
public void Test4(){
	String  s = "acc";
	int numberOfSubstrings = numberOfSubstrings( s);
	System.out.println(numberOfSubstrings);	
}*/

@Test
public void Test5(){
String s="aacbacaaabababacabbaaabcacbccbbcbbbaabbbbababccacbaaaba"
		+ "acabcccbcacccbaccabccbccbacbaaabaabbcabcbaacacacbacccababaac"
		+ "cbcabacbbcbabcbbaaabcabbabcabcbccbcaacaaaaacabbccbbbbabaccbaccabababaab"
		+ "accbaccacabbbccabbaabaccaabaaaacbaabacaacabbcbcbcbbaacbaaabccbbbbbaabcbabaccc"
		+ "bcbbacabaabababacccbabbababcbabaccccaaaaababcacaacabbbbaacbaccaaaabbacccbaaa"
		+ "ccabcccccaabbcaaccabacbbcbcbcbabbabbacbcaacbcacaabbbcbacaabaacbccbcccaabbcbacbbcccc"
		+ "bcaaaccbacabbcbcbacccbcaacccbaabbaccabcbccbbcaccacabcabcaaccccababbbabbacbaabccbac"
		+ "bbabccaacbcaaccabaabacabbcbcbacbbbaacbabaaaccacbcccaacbcbbccbcbaabcbbbcbbcccbacbbacabc"
		+ "cccccabccbccbcabcccabcacbcbbbcccccabcaccbcabccacbbaacabbcbccbabbbabcabcaccbabacbaaccaca"
		+ "bccbcbacaabbaacccbbcccaabccccbbccabcbabbcbcabccacacbbbabaaccacbccacbbcaaacbbbbaac"
		+ "accbaaabbbaaaacaacabccccbbcbaccaaababbbaaabbccbabcbbbcaaaaaabbbcbabacaaabaccacbbaab"
		+ "cbaacacaababaaabcacbcacbbbcbbccaaaccabbcccccabcbcaccbcacbcccabaaaaabaacacbcbabaacabca"
		+ "bcbaccbabbababacbbcabbacbabaccabbcbcbaacbcccccccabcaabbcbabbacaabccbbbbbbbccccacaabcbbcabb"
		+ "bbbcbacaaacbcbacccbbcbbbbcbccaaabcacaaabccaaccbcaabaccccaaacacbacbbcbaacbabbcbcabcabbaa"
		+ "ccbcbabccccbabbaabcccacabccbccccbcbccbcccbbbacbcacabcabcccabbbbccaaaabbbbbccbbbbabbabaaabb"
		+ "acbbbcbcbcbbbbacbbcbaaaaaacaabababccaaabcacacbbacacccbccabcbabcaaccabacbbccbbacbaabccaacbbcc"
		+ "bbccacbbaaccbcbaccbbaacbbcabaababcccacccabbbbcbbbabbcbabacacccbcaacbccacabcbbbaaacbaacccacacaa"
		+ "cacccbbbaabcaacabccbbcccbaabbaabaccabaacabbabcabaaabbcccaacbbacbabccacbbacccccbcbcbbacbcaaccaaaabb"
		+ "cabcbcbbabcacbaccbccccccacbbcaaacacabbbbaabbbacabbccccacacabccababccbbbbbcbaabacccaaacaccbcbccbbcaca"
		+ "acbaaacbbcbbccacbbbbbbbcacccaabcacacccbbcacababcabcaaabbcacbcbbbcccabbbcacbbaaabbaacaabbccbaacababbcccaccbac"
		+ "abacabcaaccaabcacabaaccaccccccaabbaccabacacbacaaabbbcbacaccbccbcbcacbcbabbbabcbaccacbbabbbbbbcbaaab"
		+ "aaacccacbcacacbbcaacaacaacbbbcaccacccaababaccbbcaabcabbcbacbacbabccacbbbcaabaacaabccacaccbac"
		+ "abccaccbcacaacbcbccabacaccccabbcbbbbacaacabababccbaaaccabbaaccacbcbaabccababacaabbaccac"
		+ "babcccbbbbbacbabbccbacccbacbbbcaccaaccaabbbcacbcabcacbbccaabbaacacabbcbbbbcbacacabbcbccaacabba"
		+ "abcccbaaabcbaccbacacbbbcaabbcaabbcacaccccccbaaaacaccacbbaabbbccbacaabaabcaaaacaacaabbabcbbbcaac"
		+ "aaccbcbcbbabaacccccbccbbacbaccbcccccbccccbcbabccbcbccbbbacabbbacbacbbccabbacababccabbabbbcaacabac"
		+ "caacbbcbaacccaccccbbbbbcbaabacacacaacbbacacbccbacccbbbacaabbcbcbbcaccbccbbabacbacaccccbbbaaaccccaab"
		+ "aaaacabccaaaaacbbacacababbcccbaaabaaccbabbbaacaccaaaaabaabcaabaaacbbacabaacaaaaaccaacabcbcbacac"
		+ "babbbbccbcbababbaccaaabbcbbbbbbbbbbcabababcacccaabccaaaacbabcbabbbabacbbaacbacabcaacacbcbcbcccbbcaa"
		+ "babccaaabbcbabaabccaaaaabcbaaaabccccccbbccbacbababaaaaaaabbaabacaccaabccacbaccccaabbcaabbcbabacbccccbcb"
		+ "cabbbabaccbaababbbbbbabacbaabbcabbcccbcbcbcabababbccccabbabcaaccaacaaccbcbcbcaccbbabccccbaccbacb"
		+ "bbaccccbabbaaababcbacbbacacabcacabbabbaabaacccbaccbbbccbacccbcabcacababbccccacbbcbbaaacaacbabbabbccacac"
		+ "bbbbbacbaacacacabbbbcabacbbbbbcaabcbccbcababacaaabcaacabababcbbbabbcbbccbccbbbaabababacacbbbcccbccb"
		+ "ccbbbcbcaaacacaabcabbabbbcccbababbcbcaabcbccaaacbbacbabababaaccababbbccccbaaaacaaabccababccccbcaabaaac"
		+ "bcbacaacbcaabcabcbabbacbacaacaccbabcaaaabbabcccccbcbabbcbbbbbcaaaaaaaacbbcbcaaacaabbbaaccbbbccacbaccbcabaac"
		+ "cabaabaababcabacbabcccaacccbcccbacbbcbbaaacccbaabaaacccaacbaabbcacbcbbcaccabcbbabbbbcabcaccbbbccabccbccbcccbbcabaaababbbcbaacababbccbcbacacabcabbacbcccacbaacbccccccbacbcbccaaaacaaaccbaacaaaacbccbbcabcaacbaabcbbbbaaacacbbbbcaaaaababbaabacccbabcccabbbcbaaccbcabbcaaabcabccbacbaaabcaabbcccccbbcbacbabaabbcbcaacbbcbbcabacccbccacccabbbabaabcbabccacbbacababcaacababcabaaaacbbbacbcbbacbcabcaaccabbcbcbcacbbcaaaaabbaaaccabbcaaababacbaccbccbbaaaaacbccbacabbcaaaabaccbbbbbbaaacbaaabbcbaacaaaacaccccabcacabacaaaaaabcaccbabacbbbcbbcccbbaabcbacacacabaabbabccbcacaacbcbcbcaaabcbbcacbaccccaaaabaacbbaaaaccbbaacbcacbaaabcbbccbbcabbbbbcabcaacccbaabcbabaccabbcabcabcccbacabcbcbcabcbacbabbacabcccaabcaabbbcbcbccacbcacaaababbacbcccbabbaabccaabcabaaaabaababcccaababccbaaccbbbcbbbbcaabccbabaccccccabbcbbbcbbcbbabcccccabacabcbabcbbaabaaaabaaaabcccbaabacbccabcbabbbcbbaacbcbbbcccbcbaaabbbaccbcaaccacabcabccccaabacacbbbbcacaabaaabbccbbcbbbaccaaccbaaaaaabacbbcccbccbcbacbbaaccbaccaccbcabbcaccbbcacbcbccaccbcccabbcacaaccbbabcaabcccbcacbcbccbccabccbababbcccaccacccbbbbcaccbacbbbabaacababaaaaaaacaccaabbabaabccaaccbabcbcccabcacaacbabaacacbcbccbbbacabccacccabcbabcababbabcacacaacbbcabcbbcbabacbccbaaacabbbabcabbacbaaabbaacbccaaabbcbbcbcaaabbccabaacabcaabcbcbaaabbcbcbbccbbcbbcabacbbbcaaccaacacbbbbcaabaccabcbbabcaccbacbcabbabccbbabbcbababccbbbbabbbabbcbcbcabaacabaccbabacccbaabacbcbcacaabacbaacbccabbcaaabbcccabbbaabbccbcacccabcbcaacbacbcbabababaacbbcbbabababcaaacbcaccbacbbabaccaaaccccbcccaabcacacbcaacbcbaaaacbccbccbaccbbacbcbcaccbbccbccaaccaaabacbaaccacabbbacbbaaacbbbbbbcabbbbcacbabaabababbabbacccbbbbbccbacbbbaacacbbcbcbababcaaacbbacaacacbbcbabcbcaacacaaabcaabbaabccaaacacbbaaaacbabcbacabaaacaaacccacbacbabcbaccbbccccaaccabcbbabccbbccaaabcbaccbcbbabacbcbcaacabacacabcacbbcabaccabcbcababbbacaacacbaacbbbcbacccbbacaccacacbaabcabaabcbcacaacbbbaacbabaaaaccbccbbcccaabacaacbaccabcabcacacabccbbcabbabbabacbbcaabbbcabccacbbaaaacacbbcabccbaccaaabbbbababcbaaccbcbaaabcabacacccaabacccbaaaccaaacbbbaacaabcbcbbcabbbbbbbababacabaaacbacaacbccbaccbacaaabbaacaabccbcabcbaacabacbcabbaaaccbbbbcbbccccaabbccbbcabbaabbccaabcccaacbacabccaacccbcabbaabbcbcbacbacccabbaccbccaacaaabaaccccbcbaaaaccacacaaacbabbcaabbbcacacbaccbbbccbbbbbcacccacabaaacaabaababbbbcccccacbbacaabccbacbbacccbbcbaababbbbbaccccaacbbabacaccbbbcaaccaacacccbcbbbaacbbcccbbcbabacbcbbccbbbbaabbccbcacbaaabcabacbbaaaaabccbabcbbabaacbbccbcbcacccaaacbbaabcbbabbabbccabcbabcbcacaaabbbbababaccccabcbaccbaaccabababcabbcbaaabbbbccabbccbaababaabbaccbcaacbaabaacbccabcbcbbbcccbacaaabaccaaacabaabccbbcccbcccccbbbbaccababcabaabbccabcacabcccbbacccaccbcaaaacaaacbaabbcbcbacabababbbcaacaabccaaacabcabccbcbabaabaacbaabaabccbbaaabacaacaaccbaaacbccabaababbcababcabcaabbcaabbcabcbbbaabcaccccaabccacbbaaaabacaabbcbbbbccccccbbaacbaccababaaccaacbabbcbaacacbbaccaabcaccbbbcaacbaaaaabacbbcbaacbcbbcbcbbaabbbaccbbabbcbcbcccaacabbabacacabbcbccaabacbcabbaabcaababccbccabaccbbbaccbbabcabbbcaacaabcaabcbcaacbcabbcabbcbcbbcacaacaacccbbcaacabaabcccbcbcbbbbbbbbbccbaacbbccbbcbcabcbbbabaccbaabaccccbabcbbbacacbbabbcbbabbbcabaacbaababccbcabaaacbbccbbbabaaacbbbabbbbbccbacbabaccaccbabbabbbcbbabaabbbabcaabaababbacccacacbbccbbbbbbaababacbcccbbaaabbbbbbcabcbcccaccabacababccaaacccaaacbaccccbbcbabcbbcbbbcccabcbbabbcabcaaaccaabbaabbcabccbacbaaaacbcbbabcaccacaacacaaabcbbbcbcabacbbcacbacabbacbccbbacccacbbbbbccbbbcaabbaaabacacbaaabcaacbbcbaaabcbccbcbaabbaaaabababccbcabbcabcbaaccabcabbabbbaaabacaacabbaccacacaaaabaabbabccbcbcacccaaabbacbacbabcbbaaabcaabaaaabaacbbccccbbcaaabccabababbbbccaaaaaacbcbaaccbacbcbaacbabaaababacabbccccbbaacbbbcbacbacbbcacacbbbacaabbcbcaacbabbcabbcabababbaababaccabababbccbcaccaccaabbbcbbcacccccbabccbaacbabacbbabacaabbcccbbccbabaacbccaaacacbaaabacbccbbccbabbaababcbabcbbbabbcabccacbbabcbbbcaacacaabbacabbbcaccabcbbcccbbcbbaaacbcbabccaababbccbbcbabacabacbccaaababaaabaacbaaabacbbbbacbccacaccccbaacccaabaabcbcacbbbabbabbacccabcaccbabaccaaabcbcbcaabbcbacaabcabcccbaabbbbcbcbcbcccaaacaaccbbcaaaacbacacacacaabcbcccbbbbaaccbaabaaabbabcaabccabcbaacacaaabacbcbaccaacabcababbbbaccacacabaccbccbcabbbabcccbaaacabacabbcbcbaaabaccabcccccccbbcabccbcbbabccaaaaabcbcabcbabbbbbaabaaabcccccbccbbcbbcbbabbcbacacaccaabaccbbbabbabaababcccaccbaaababcccabbcaaabacbabbacacababbcacbcccbaaaabbcaacabbcabaabcacbbcacacaacbbbcbacbaababbaacbbbbbccccacaabcaabbcbbcbabcbaabbabccbaccbccaacbbbbbaacbaaabbacccaaabbbbabaaabbaaaabcbbbbacbabbbccbababbcccaabbaabbbaaccccbbbbaabbacabacbcbabacbacbbcacaacccbcccaaacbbccbbcbcbcbcaababcbcbccaacbbcabbbcaaccccaacccbbaccaccaaccbccbccacbcaaaaaabbbaaabaaababbccabccacbbcababcabccbabcbabbbbaabcbcacabaabbbabbbcabaccaaacbbbaaaaabaababbabcabacaccaacabcbcaaacccccbcbcbcbbcccacbabaaaaaacbbcacaccabcccacccabbbcacbcbaacbaccbacbabccbcaccabaaccaacaccaaacbbacccccabbccabbbabaaacacbaccaababccbcaccccacbabacacbcbcccbbbcbcbcabcbacbacbcabccccbcbacbbaabccabcabacbababbaaabbbbaccbababcccbccaabaacababcbbaccacbcacabbcbbbabcacccaccbcccaababccaaccbccbcacabaaabbccbabccbabaccbabbbccccacababbaacbabcbbccccababbcbbbaccacaabbaaccbabcbbabaabcbacacacbbacabcababacbcbaccbbabaaccccbccbbbababababaaaaaaabbbcccbabccbaccacabcbacacccbbbcccaabaacacbabbbcacbccabaccbacccabacaabbacabcabbbcaacbccbccbbbabccccbabacbabacabcccccbacbcabcaaacabaabacababcacbcbabcaacaacbaaabaacaaccaacbcacbbabbcbaccababbcaaacbbaaaaccaaaccbccaccabaaabacbcaaabaccabcabbcccabcaacabbcacabbcbcaccaabbaababccbbccabaccacacbccbaaccbaacbbccabcababcbbacabbacabcbbacaabcbbcaccabcbcccbaccbbcbbbaaaccbcbaaabbbaccbcccbcbccacaabbbcbaabaaabaabcaacabbaacacbcaabcbabccaccaabccaacbabcccbaaccccbbcbbabbabbcbababbabcacabbbbcbabccaccaccababccccaacccabacbbccacacaacbaacaaaccaccccccacbbcacacacabbaaccbbbabbbbbbbccabacccbbcaabababcccbaacacabbccccaaaccbaccbaaacbbaacbbacaabbcacbcbbbccacaccaccacabaabaabacbccbccaccbacbbacacabacbbcaabbacbcbabbaabcacacabbcabbccaccbbcccccbbbbaaccaaabcabbcaabcbaaacacaabaabbbcacabbcaccaacbaaaccabcacaaccacbccbcabbaccbcccbaccbabccabaabbaccbbcaacbbbabbbaabbbacbbbabccaccbbaacaacabbbcababbacbbbbcbccaccabbcaacbcbaacccaacaaaaccaabcbaccabccaacacaaababccacbbbacbbbcbaaacbabbbcccbacaabbcbcabcbbccbaacaccacacbbbbcccccbbbbabcbacabccacaaabbbcbabcacacbbcabaaaabbccabaccaabaccbaccaacaccbaccaabcabacccbbaaccbabcbaacaaaccbcacbaacababacacbaaabcbbcccacacbccaacccbcbcacabcabccbccbbbbbacaaabaaccccacbacbbacabccbccbcaababbbacabcbaaccaaccacacccccaaabbabbbcabaaaaaaabcbbbacababcbbaccbccccaabbbaaabbbccbbcccaccacababbccaababcabbcababbaacacaaabcacbbccbccbbbbcbaaccbcacbbbcacaabcabaccaacacbcacbbccbabcbaccbccacbbcbaababaccaaccababbcbacabaabbaacccaaccaaaabcabcbbbabbccbcabbaaacabcaabccbcabcbabaac" ;
int numberOfSubstrings = numberOfSubstrings( s);
System.out.println(numberOfSubstrings);	
}

}



