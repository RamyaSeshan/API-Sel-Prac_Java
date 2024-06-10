package Interview_Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class SecondLargest_LC_1796_WKIII_HW 
{
	@Test
	public void test1()
	{
		String  s = "dfa12321afd" ;
		int secondHighest = secondHighest(s) ;
		System.out.println( "test 1   " +secondHighest);
	}
	
	@Test
	public void test2()
	{
		String  s = "abc1111" ;
		int secondHighest = secondHighest(s) ;
		System.out.println( "test 1   " +secondHighest);
	}
	

	public int secondHighest(String s) 
	{
		int val;
		List<Integer> list = new ArrayList< Integer>() ;
				
		for (int i = 0; i < s.length(); i++) 
		{
			if (Character.isDigit(s.charAt(i))) 
			{
				val =  s.charAt(i) - '0' ;
				if(  ! list.contains(val ) ) list.add(val) ;				
			}
		}
		Collections.sort(list);
		return list.get(list.size() -2 ) ;

	}
	
	
}
