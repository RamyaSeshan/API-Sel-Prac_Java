package Interview_Practise;

import org.junit.Test;

public class LastWordLength 
{
	// Time Complexity O[N/2 ]   ; Space Complexity NA

	 @Test
	 public void test1()
	 {
		   String s = " Ramya is very good girl l" ;
		   int lastWordLen = lastWordLen(s) ;
		   System.out.println(lastWordLen);
	 }

	public int lastWordLen(String s) {
		
		int count = 0;
		for (int i = s.length()-1 ; i >=0 ; i--) 
		{
			if( Character.isWhitespace(s.charAt(i) ) )   break;
			else count++;
		}
		return count;
		
	}
	
}
