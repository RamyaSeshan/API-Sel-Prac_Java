package Interview_Practise;

import org.junit.Test;

public class PlusOne_LC_66_WKIII_HW 
{
	@Test
	public void test1()
	{
		int[] digits = {1,2,3};
		int[] plusOne = plusOne( digits)  ;

		for (int i = 0; i < plusOne.length; i++) 
		{
			System.out.println(" " +  plusOne[i]);
		}

		System.out.println("---------------------- " );

	}

	@Test
	public void test2()
	{
		int[] digits = {9};
		int[] plusOne = plusOne( digits)  ;

		for (int i = 0; i < plusOne.length; i++) 
		{
			System.out.println(" " +  plusOne[i]);
		}
	}

	@Test
	public void test3()
	{
		int[] digits = {9,9,9};
		int[] plusOne = plusOne( digits)  ;

		for (int i = 0; i < plusOne.length; i++) 
		{
			System.out.println(" " +  plusOne[i]);
		}
	}

	@Test
	public void test4()
	{
		int[] digits = {8,9,9,9};
		int[] plusOne = plusOne( digits)  ;	

		for (int i = 0; i < plusOne.length; i++) 
		{
			System.out.println(" " +  plusOne[i]);
		}
	}
	

	public int[] plusOne(int[] digits) {

		int i;
		for ( i =  digits.length-1 ; i >= 0 ; i--) 
		{
			if ( digits[i] < 9) 
			{
				digits[i] = digits[i] +1 ;  return digits;
			}	
			 digits[i] =0;	
		} 

		int[] res = new int[ digits.length + 1 ] ;
		res[0]= 1;
		return res;	
		
	}


}
