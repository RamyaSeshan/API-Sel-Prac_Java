package Interview_Practise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SubStr_LC_1358_WEEK8_DAY3 
{
	@Test
	public void test1()
	{
		String s = "abcabc" ;
		int numberOfSubstrings = numberOfSubstrings( s) ;
		System.out.println("numberOfSubstrings   " +numberOfSubstrings);
		
	}

	public int numberOfSubstrings(String s) 
	{
		int start =0 , count =0  ,i =0 , lenght = s.length() -1 , end;
		Map <Character ,Integer > map = new HashMap<Character ,Integer >() ;
		
		while (i <= s.length() -1 )
		{
			map.put( s.charAt(i), map.getOrDefault(map.get(s.charAt(i)), 0 )  + 1 );
				
			if (map.get('a') != null && map.get('b') != null&& map.get('c')!= null )
			{
				count = count + 1 ;
				count = count + ( lenght -i ) ;
				break ;	}
			i++;			
	    }
		System.out.println( " i is  " +i);
		end =i + 1;
		
		while (i <= s.length() -1 ) 
		{
		
		map.put( s.charAt(start), map.getOrDefault(map.get(s.charAt(start)), 0 )  - 1 );
		map.put( s.charAt(end), map.getOrDefault(map.get(s.charAt(end)), 0 )  +1 );
		
		if (map.get('a') >=1 && map.get('b') >=1  && map.get('c')  >=1 )
		{
			count = count + 1 ;
			count = count + ( lenght -i ) ;
			break ;	
		}
		
		
		} 
		return count ;
	}
}
