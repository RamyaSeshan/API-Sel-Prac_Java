package Interview_Practise;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Max69NUmber_LC_1323_WKIII_HW 
{
	@Test
	public void test1()
	{
		int num = 96 ;
		int maximum69Number = maximum69Number ( num) ;
		System.out.println( " test1 -- " +maximum69Number);
	}

	@Test
	public void test2()
	{
		int num = 9669 ;
		int maximum69Number = maximum69Number ( num) ;
		System.out.println( " test2 -- " +maximum69Number);
	}

	@Test
	public void test3()
	{
		int num = 9996 ;
		int maximum69Number = maximum69Number ( num) ;
		System.out.println( " test3 -- " +maximum69Number);
	}

	@Test

	public void test4()
	{
		int num = 9999 ;
		int maximum69Number = maximum69Number ( num) ;
		System.out.println( " test4 -- " +maximum69Number);
	}

	private int maximum69Number_BF(int num) {

		String strNum = String.valueOf(num) ;
		//System.out.println(strNum);
		char[] charArray = strNum.toCharArray() ;

		int parseInt ;
		int max = num ;

		//System.out.print( " ------------------------- " );

		for (int i = 0; i < charArray.length; i++)  
		{
			if (charArray[i] == '6')
			{
				charArray[i] = '9';
				parseInt = Integer.parseInt(String.valueOf(charArray))  ;
				//System.out.print( " parseInt of 6 " + parseInt);
				max = Math.max(max, parseInt) ;
				charArray[i] = '6';
			}
			else if ( charArray[i] == '9' )
			{
				charArray[i] = '6';
				parseInt = Integer.parseInt(String.valueOf(charArray))  ;
				// System.out.print( " parseInt of 9 " + parseInt);
				max = Math.max(max, parseInt) ;
				charArray[i] = '9';
			}
		}		
		return max;
	}

}


