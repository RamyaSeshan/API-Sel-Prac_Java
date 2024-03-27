package Interview_Practise;

import org.junit.Test;

public class Find_Diff_LC_389_WKIIICW 
{
	@Test
	public void test1()
	{
		String s = "abcd";
		String t = "abcde" ;

		char findTheDifference = findTheDifference( s,  t) ;
		System.out.println ( " test1 --- " + findTheDifference);
	}

	@Test
	public void test2()
	{
		String s = "";
		String t = "y" ;

		char findTheDifference = findTheDifference( s,  t) ;
		System.out.println ( " test1 --- " + findTheDifference);
	}

	public char findTheDifference(String s, String t) 
	{
		char[] sArray = s.toCharArray() ;
		char[] tArray = t.toCharArray() ;

		int ans;
		int cntS = 0 , cntT = 0;

		for (int i = 0; i < sArray.length; i++) 
		{
			cntS  = cntS  + sArray[i] ;
			cntT = cntT+  tArray[i] ;
		}

		cntT = cntT +  tArray[tArray.length -1 ]  ;

		return  (char) (cntT -  cntS) ;

	}



}

