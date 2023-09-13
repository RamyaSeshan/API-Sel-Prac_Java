package mandatoryHomeWork.Week7.Day3;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-string

import org.junit.Test;

/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
String s, int[] indices ; output String

2.Frame Test data (valid, invalid, complex and edge cases)
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"

Input: s = "abc", indices = [0,1,2]
Output: "abc"

3.Do you know the Solution?
yes

4.Do you have any alternate approaches? (Thing of alternate approaches)
N0 -- Brute Force 

5. Derive Pseudo code in paper (for the best chosen approach)

declare an chararray of lenth of string --> char[] res = new char[s.lenght() ] ;
iterate thru the lenth of the string --> for(int i=0; i < s.lenght() ;i++
  -- > put res[i] as chart at index [i] position of the stirng res[indices[i] ] = s.charAT(i) 


6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes
 */

public class ShuffleStr {

	public String restoreString(String s, int[] indices) {

		char[] res = new char[s.length()];
		String output = "";
		for (int i = 0; i <s.length(); i++) {
			res[indices[i]] = s.charAt(i);
		    }
		  return	output.valueOf(res);
	}

	@Test
	public void Test1()
	{
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		String restoreString = restoreString( s, indices);
		System.out.println(restoreString);		
	}

	@Test
	public void Test2()
	{
		String s = "acb";
		int[] indices = {0,1,2};
		String restoreString = restoreString( s, indices);
		System.out.println(restoreString);		
	}
}
