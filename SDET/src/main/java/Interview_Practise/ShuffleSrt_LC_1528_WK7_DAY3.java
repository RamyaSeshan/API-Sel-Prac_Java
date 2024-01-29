package Interview_Practise;

import org.junit.Test;

public class ShuffleSrt_LC_1528_WK7_DAY3 
{

	@Test
	public void test1()
	{
		String s = "codeleet" ;
		int[] indices = {4,5,6,7,0,2,1,3} ;
		String restoreString = restoreString( s, indices) ;	
		System.out.println(restoreString);	
	}
	
	@Test
	public void test2()
	{
		String s = "abc" ;
		int[] indices = {0,1,2} ;
		String restoreString = restoreString( s, indices) ;	
		System.out.println(restoreString);	
	}

	public String restoreString(String s, int[] indices) {
		char[] result = new 	char[s.length()] ;

		for (int i = 0; i < s.length(); i++) 
		{ result [ indices[i]	] = s.charAt(i) ;   }	

		return String.valueOf(result) ;
	}

}
