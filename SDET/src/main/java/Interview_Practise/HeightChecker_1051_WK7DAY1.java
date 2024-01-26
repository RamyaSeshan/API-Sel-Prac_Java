package Interview_Practise;

import java.util.Arrays;

import org.junit.Test;

public class HeightChecker_1051_WK7DAY1 
{
	@Test
	public void test1()
	{
		int[] actual = {1,1,4,2,1,3 };

		int findVariant = findVariant(actual) ;
		System.out.println(findVariant);
	}
	
	@Test
	public void test2()
	{
		int[] actual = {5,1,2,3,4 };

		int findVariant = findVariant(actual) ;
		System.out.println("from test 2 value is  " +findVariant);
	}
	
	@Test
	public void test3()
	{
		int[] actual = {1,2,3,4,5};

		int findVariant = findVariant(actual) ;
		System.out.println("from test 3 value is  " +findVariant);
	}

	public int findVariant(int[] actual) 
	{
		int[] exp = Arrays.copyOf(actual, actual.length) ;
		Arrays.sort(exp);
		int count =0 ; 
		for (int i = 0; i < actual.length; i++) 
		{
			if(exp[i] != actual[i])  count++;
		}
		
		return count ;

	}
}
