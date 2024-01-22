package Interview_Practise;

import java.util.Arrays;

import org.junit.Test;

public class Reverse_String_Word {
	
	@Test
	public void test1()
	{
		String reverse_Word = reverse_Word("Ramya") ;
		System.out.println(reverse_Word);
	}

	public String reverse_Word(String str) 
	{
		int left =0;
		int right = str.length() -1 ;
		char temp = 0;
		
		char[] charArray = str.toCharArray() ;
		
		while (left < right)
		{
			temp = charArray[left]  ;
			charArray[left]  = charArray[right ]  ;
			charArray[right ] = temp ;		
			left ++ ; right --;
		}

		return String.valueOf(charArray) ;
		
	}

}
