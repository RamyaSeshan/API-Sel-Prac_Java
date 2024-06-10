package Interview_Practise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.codehaus.groovy.control.InstanceOfVerifier;
import org.junit.Test;

public class NumberEqual_Digit_Cnt_Val_LC_2283 
{
   // https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/
	
	//  InComplete , Hence NOT checked IN 
	@Test
	public void test1()
	{
		String num = "1210";
		boolean digitCount = digitCount( num) ;
		System.out.println(digitCount);
		
	}

	public boolean digitCount(String num) 
	{
		int[] val = new int[num.length()];
		int parseInt = Integer.parseInt(num) ;
		Map<Integer ,Integer> map = new HashMap<Integer ,Integer>() ;
		
		for (int i = 0; i < num.length(); i++)  
		{	
		 parseInt = Integer.parseInt(num.charAt(i)+"");
		 val[i] =parseInt;	 
		 map.put( i , val[i] ) ;
		}
			
		for (int i = 0; i <num.length(); i++) 
		{
			//System.out.println( " map.get(i)    "  +map.get(i) );
			//System.out.println( " chararr[i]   " +chararr[i]  );
			if( map.get(i) != val[i] ) return false ;
		}
		
		return true;		
	}
	
	
}
