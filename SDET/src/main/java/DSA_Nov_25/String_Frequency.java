package DSA_Nov_25;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class String_Frequency {
	
	 // String input = "aaabbccaad";
	// Output: a3b2c2d1
	
	@Test
	public void test1()
	{
		String input = "aaabbccaad"; 
		chkCharFreq( input) ;
		
	}
	
	public void chkCharFreq(String s)
	{
		Map<Character , Integer> map = new HashMap<Character , Integer>() ;
		char[] charArray = s.toCharArray() ;
		
		for (char c : charArray) {			
			map.put(c, map.getOrDefault(c, 0) +1 ) ;			
			}
		System.out.println(map);
	}

}
