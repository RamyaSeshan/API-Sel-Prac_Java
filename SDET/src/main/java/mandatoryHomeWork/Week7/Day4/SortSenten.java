package mandatoryHomeWork.Week7.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

 // https://leetcode.com/problems/sorting-the-sentence
/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
String s ; output String res

2.Frame Test data (valid, invalid, complex and edge cases)
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"

3.Do you know the Solution?
yes

4.Do you have any alternate approaches? (Thing of alternate approaches)
N0 -- Brute Force 

5. Derive Pseudo code in paper (for the best chosen approach)
  //"is2 sentence4 This1 a3"

a.declare an list of String  , String subStr =""  , int index ; StringBuffer sb = new StringBuffer() [ List<String> list = new ArrayList<String>(); ]  
b.split the input sting by single space --> String[] input = s.split(" ")
c.Iterate thru String array till its length-1
  --> for (int i=0 ; i < input.lenght ; i++)
       --> get the substring till lenght-1 -- subStr= input[i].subStr(0 , input.lenght) //is
       --> get the charAT at lenght-1 & convert it to int -- index Integer.parseInt(s.charAT(input.lenght-1)+"")
       --> Add the string at the position index-1 -- list.add(index-1 , subStr)  
d.Iterate thur the list Iterator [  for( int i=0 ; i < list.size ; i++) ] 
  -->if(i =  list.size-1) 
      sb.apend(list[i]) ; sb.apend(' ') ; 
     else sb.apend(list[i]) 
e.sb.toString()





6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes
 */

public class SortSenten {
	 public String sortSentence(String s) {
		
		 String subStr =" " ;
		 int index ;
		 StringBuffer sb = new StringBuffer();
		 
		 String[] input  = s.split(" ");
		 String[] strArr = new String[input.length];
		 
	    for (int i = 0; i < input.length; i++) {
		    
		subStr= input[i].substring(0, input[i].length()-1);
		index = Integer.parseInt(input[i].charAt(input[i].length() -1)+"");
		strArr[index-1] = subStr;		
		   }
		 
		for (int i = 0; i < strArr.length; i++) {			
			if( i== strArr.length-1) { sb.append(strArr[i])  ; } 
			else 
			 { sb.append(strArr[i]) ; 
			   sb.append(' ');
			 } 	
		}	 
		 return sb.toString();  
	    }

	 
@Test
public void Test1()
{	String s ="is2 sentence4 This1 a3";
    String sortSentence = sortSentence( s);
    System.out.println(sortSentence);	
}

@Test
public void Test2()
{	String s ="Myself2 Me1 I4 and3";
    String sortSentence = sortSentence( s);
    System.out.println(sortSentence);	
}
}
