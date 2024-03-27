package Interview_Practise;

import org.junit.Test;

public class LastWordLen_LC_58_WKIIICW 
{
	@Test
	public void test1()
	{
		String s = "Hello World" ;
		int lengthOfLastWord = lengthOfLastWord( s) ;
		System.out.println( "test1 ---" + lengthOfLastWord);

	}

	@Test
	public void test2()
	{
		String s = " World" ;
		int lengthOfLastWord = lengthOfLastWord( s) ;
		System.out.println( "test2 ---" + lengthOfLastWord);

	}

	@Test
	public void test3()
	{
		String s = "   fly me   to   the moon  " ;
		int lengthOfLastWord = lengthOfLastWord( s) ;
		System.out.println( "test3 ---" + lengthOfLastWord);

	}
	
	@Test
	public void test4()
	{
		String s = "luffy is still joyboy" ;
		int lengthOfLastWord = lengthOfLastWord( s) ;
		System.out.println( "test4 ---" + lengthOfLastWord);

	}
	

	public int lengthOfLastWord(String s) 
	{
		String trimStr = s.trim() ;
		int count =0;

		for (int i = trimStr.length() -1; i >=0  ; i--) 
		{
			if(trimStr.charAt(i) != ' ' ) count ++; 
			else break;
		}

		return count ;
	}
}
