package Interview_Practise;

import org.junit.Test;

public class PowerOfThree 
{
	@Test
	public void test1()
	{
		int x = 27 ;
		boolean chkPower = chkPower(x) ;
		System.out.println( " test 1 ---- " +chkPower);
	}


	@Test
	public void test2()
	{
		int x = 12 ;
		boolean chkPower = chkPower(x) ;
		System.out.println( " test 2 ---- " +chkPower);
	} 


	public  boolean chkPower(int x) {

		while (x %3 ==0 )
		{
			x = x / 3;
		}

		return x == 1;
	}
}
