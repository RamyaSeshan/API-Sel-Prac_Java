package mandatoryHomeWork.Week6.Day2;

import org.junit.Test;

//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/submissions/

/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
input String [] , output int 

2.Frame Test data (valid, invalid, complex and edge cases)
sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
 sentences = ["please wait", "continue to fight", "continue to win"]
 sentences = ["", "continue to fight", "continue to win"]

3.Do you know the Solution?
yes

4.Do you have any alternate approaches? (Thing of alternate approaches)
N0

5. Derive Pseudo code in paper (for the best chosen approach)
Yes 
a. declare an int max=0
b.Iterate thru the for lopp till < sentences.lenght()
  --> get the sentence  sentences and split by space split[""]
  --> in the split String[] , say word , get the lengh of word 
    --> check if word >  max , if so set wordas max 
c.return max 

     
6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes
 */

public class MaxWords_LC_2114 {
	
	 public int mostWordsFound(String[] sentences) {
	
		 if(sentences.length==0 ) { return 0;}
		 int max =0;
		 
		 for (int i = 0; i < sentences.length; i++) {
			 String sen= sentences[i];
			 String[] word = sen.split(" ");
			 int wordcnt = word.length;
			 if(wordcnt > max) {
	                max = wordcnt;
	            }
		}		 
		 return max;
	        
	    }
	 
	 
	 @Test
	 public void Test1()
	 {
		 String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		 int mostWordsFound = mostWordsFound( sentences);
		 System.out.println(mostWordsFound);		
	 }
	 @Test
	 public void Test2()
	 {
		 String[] sentences = {"please wait","continue to fight", "continue to win"};
		 int mostWordsFound = mostWordsFound( sentences);
		 System.out.println(mostWordsFound);		
	 }

	 @Test
	 public void Test3()
	 {
		 String[] sentences = {" ","continue to fight", "continue to win"};
		 int mostWordsFound = mostWordsFound( sentences);
		 System.out.println(mostWordsFound);		
	 }
}
