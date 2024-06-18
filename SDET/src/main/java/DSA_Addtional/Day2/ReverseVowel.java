package DSA_Addtional.Day2;

import java.util.Arrays;

import org.junit.Test;

public class ReverseVowel {
	
	@Test
	public void test1()
	{
		String s  = "hello";
		String reverseVowel = reverseVowel(s);
		System.out.println( reverseVowel );
	}

	
	@Test
	public void test2()
	{
		String s  = "aeiou";
		String reverseVowel = reverseVowel(s);
		System.out.println( reverseVowel );
	}
	
	
	@Test
	public void test3()
	{
		String s  = "bcd";
		String reverseVowel = reverseVowel(s);		
		System.out.println( reverseVowel );
	}
	
	@Test
	public void test4()
	{
		String s  = "abcd";
		String reverseVowel = reverseVowel(s);		
		System.out.println( reverseVowel );
	}
	
	public String reverseVowel(String s) {
		
		char[] charArray = s.toCharArray() ;
		
		int p1 =0 , p2 = charArray.length -1 ;
		
		while ( p1 < p2 )
	     	{

			if ( isVowel(charArray [p1] ) &&  isVowel(charArray [p2] )  ) 
			{
				char temp =  charArray [p1];
				charArray [p1] =  charArray [p2] ;
				charArray [p2] = temp;	
				p1++ ; p2-- ;
			}
			else if (  !isVowel(charArray [p1] ) &&  isVowel(charArray [p2] )  ) p1++;
			else if (  isVowel(charArray [p1] ) &&  !isVowel(charArray [p2] )  ) p2--;
			else if (  !isVowel(charArray [p1] ) &&  !isVowel(charArray [p2] )  )  { p2--; p1++ ;}
		  }
	
		return Arrays.toString(charArray) ;
		
		}	
	

	private boolean isVowel(char c) {
		if ( c=='a' || c=='e' || c=='i' || c=='o' || c=='u') 
		 return true ;
		 else return false;
	}
	
	
		
	}


