package Interview_Practise;

import org.junit.Test;

public class HalfSrt_LC_1704_WKIIICW 
{
	@Test
	public void test1()
	{
		String  s = "boek" ;
		boolean halvesAreAlike = halvesAreAlike( s);
		System.out.println( "test1 ---" +halvesAreAlike);
	}
	
	@Test
	public void test2()
	{
		String  s = "textbook" ;
		boolean halvesAreAlike = halvesAreAlike( s);
		System.out.println( "test2 ---" +halvesAreAlike);
	}
	
	@Test
	public void test3()
	{
		String  s = "Uo" ;
		boolean halvesAreAlike = halvesAreAlike( s);
		System.out.println( "test3 ---" +halvesAreAlike);
	}
	

	public boolean halvesAreAlike_A1(String s) { // took 5 ms 
		
		int lenght = s.length() / 2 ;
		
		String first  =  s.substring(0, lenght ) ;
		String last = s.substring( lenght ) ;
		String vowel = "aeiouAEIOU" ;
		int cntF = 0 , cntL =0  ;
	
		for (int i = 0; i < lenght; i++) 
		{
			 if (vowel.contains(first.charAt(i) +"") )  cntF++;
			 if (vowel.contains(last.charAt(i) +"") )  cntL++;			 
		}

		return cntF == cntL ;
		
	}
	
	public boolean halvesAreAlike(String s) // took 9 ms 
	{
		
		int cntF = 0 , cntL =0  ;
		String lowerCase = s.toLowerCase() ;
			
		for (int i = 0; i < s.length() /2; i++) 
		{
			if (lowerCase.charAt(i) == 'a' || lowerCase.charAt(i) == 'e'   || lowerCase.charAt(i) == 'i' || lowerCase.charAt(i) == 'o'  || lowerCase.charAt(i) == 'u'   ) 
				cntF = cntF +1 ;
		}
		
		for (int i = s.length() /2 ; i < s.length() ; i++) 
		{
			if (lowerCase.charAt(i) == 'a' || lowerCase.charAt(i) == 'e'   || lowerCase.charAt(i) == 'i' || lowerCase.charAt(i) == 'o'  || lowerCase.charAt(i) == 'u'   ) 
				cntL = cntL +1 ;
		}		
		
		return cntF == cntL;
		
	}
}
