package DSA_Nov_26;

import org.junit.Test;

public class Str_Reverse {

	 /*
	  * Question:
String str = "I am happy engineer";
Reverse the words and not the entire string 
Output: "I ma yppah reenigne" 
Retain the white spaces as it is

	  */
	
	/*
	 * Psuedo code 
	 * reverse through each character in the sentence
For each character, check:
Is this character a space or are we at the end of the sentence?
If yes, then:
We have found a word / we're at ==========the last word.
Reverse this word by swapping logic (push this as separate method)
After reversing, skip over any extra spaces until we find a letter again.
Reset the position as beginning of the next word.
When finished, convert the character array to string

	 */
	
	
	@Test
	public void test1()
	{
		String str = "I am happy engineer";
		String reverse_WithSpace = reverse_WithSpace(str) ;
		System.out.println(reverse_WithSpace);
		//reverse_WithSpace(str) ;
	}

	private String reverse_WithSpace(String s) {
		
		int left =0 , right = 0;
		char[] charArray = s.toCharArray();
		
		while (right <= s.length())
		{
			if ( right == s.length()  || charArray[right] == ' '  )
			{
				reverse(left , right -1  , charArray );
				right ++;
				 while (right == ' ' &&  right < s.length() )
				 { 	right ++; }
				 
			     left = right;
			}
			else if ( charArray[right] != ' ' )  right ++;			
		}
		return String.valueOf(charArray) ;

	}

	private void reverse(int left, int right ,char[] charArray) {
		
		char temp = ' ';
		System.out.println("in reverse function");
		while (left < right )
		{
			temp = charArray[left] ;
		    charArray[left]  = charArray[right] ;
			charArray[right]  = temp;
			left ++;
			right --;
		}	
		
		System.out.println(String.valueOf(charArray));
	}

	
	
}
