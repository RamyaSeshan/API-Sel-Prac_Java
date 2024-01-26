package Interview_Practise;

import org.junit.Test;

public class REverseStr_2Pointer 
{
	@Test
	public void test1()
	{
		String s = " ramyaSeshan"  ;
		String revStr = revStr(s) ;
		System.out.println( revStr );

	}

	public String revStr(String s) 
	{
		char[] charArray = s.toCharArray() ;
		Character  temp;
		
		for (int start = 0 ,end = charArray.length -1  ;  start <=end  ;  start ++ , end --) 
		{
			temp = charArray[start] ;
			charArray[start]  = charArray[end]  ;
			charArray[end ] = temp;						
		}
            
		   return String.valueOf(charArray) ;
	}



}
