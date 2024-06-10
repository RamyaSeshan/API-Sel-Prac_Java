package HackerRankAss;

import org.junit.Test;

public class StrRev {

	// REverse a String
	public String reverseStr(String S)
	{
		StringBuffer sb = new  StringBuffer();		
		for (int i = S.length()-1; i>= 0; i--) {
			sb = sb.append(S.charAt(i));			
		}		
		return sb.toString();		
	}
	
	
	@Test
	public void Test1()
	
	{
		String S = "I am good girl";
		String reverseStr = reverseStr( S);
		System.out.println(reverseStr);
		
	}
}
