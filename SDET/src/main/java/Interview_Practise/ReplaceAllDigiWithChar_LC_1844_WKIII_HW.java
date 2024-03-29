package Interview_Practise;

import org.junit.Test;

public class ReplaceAllDigiWithChar_LC_1844_WKIII_HW 
{
	@Test
	public void test1()
	{
		String  s = "a1c1e1" ;
		String replaceDigits = replaceDigits(s) ;
		System.out.println( "test 1---" +replaceDigits);
	}
	
	@Test
	public void test2()
	{
		String  s = "a1b2c3d4e" ;
		String replaceDigits = replaceDigits(s) ;
		System.out.println( "test 2---" +replaceDigits);
	}
	

	public String replaceDigits(String s) 
	{
		int val ;
		char[] charArray = s.toCharArray() ;
		for (int i = 1; i < s.length(); i = i + 2 ) 
		{
			val = s.charAt(i -1 ) ;
			//System.out.println( val);
			//System.out.println( "s.charAt(i)   " +s.charAt(i));
			val = val +  (s.charAt(i)  - '0' );
			//System.out.println( val);
			charArray[i] = (char) (val) ;
			//System.out.println( "-----------------" +charArray[i]);
			val =0 ;
		} 
         return String.valueOf(charArray) ;
	}
	
	
}
