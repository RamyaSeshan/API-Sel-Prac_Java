package DSA_ClassIII;

import java.util.Arrays;

import org.junit.Test;

public class StringArr_Palin {
	
	/*
	 * Given an input String,return a boolean array by validate each of the word is a palindrome.
Input = "this is a Tst"
output = [false, false, true, true]
	 */

	public boolean[]  isPalin(String S)  // "ramya is good"
	{
		
		String[] split = S.split(" ");
		boolean[] res = new boolean[split.length] ;
		
		for (int i = 0; i < split.length; i++) 
		{
			
			String input = split[i];
			if(input.length()==1) {res[i] = true; continue ;}
			
			int left = input.length()/2-1 ;
			int right ;
			 
			if (input.length() %2 == 0 )		 
				 right = input.length()/2;			 
			 else 		 
				 right = input.length()/2+1;
			 		
			 
		    res[i] = true;
			 while (right < input.length() )			 
			 {			 
				 if (input.charAt(left) != input.charAt(right))				
						{ res[i] = false; break ; }
				 else 
					{ left-- ; right ++;} 			 
			 }
		
		}
    return res ;
	}
	

	
	
@Test
	public void Test1()
	{
		String S = "radar radar";
		 boolean[] palindrome = isPalin( S);
		 System.out.println(Arrays.toString(palindrome));
	}

@Test
public void Test2()
{
	String S = "ramya is good";
	 boolean[] palindrome = isPalin( S);
	 System.out.println(Arrays.toString(palindrome));
}
 
	 
}
