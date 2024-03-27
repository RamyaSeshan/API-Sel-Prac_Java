package Interview_Practise;

import org.junit.Test;

public class ShuffleSrt_LC_1528_WKIIICW
{
	@Test
	public void test1()
	{
		String s = "abc";
		int[] indices = { 0,1,2 } ;
		String restoreString = restoreString( s,  indices) ;
		System.out.println("test1 --- " +restoreString);
		
	}
	
	@Test
	public void test2()
	{
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3 } ;
		String restoreString = restoreString( s,  indices) ;
		System.out.println("test2 --- " +restoreString);
		
	}
	

	public  String restoreString(String s, int[] indices) {
		
		char[] chararr = new  char[indices.length] ;
		
		for (int i = 0; i < s.length(); i++) 
		{
			chararr[indices[i]] = s.charAt(i) ;
			
		}
		 return String.valueOf(chararr) ;
		
	}
}
