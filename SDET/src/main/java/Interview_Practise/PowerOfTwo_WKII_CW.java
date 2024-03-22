package Interview_Practise;

import org.junit.Test;

public class PowerOfTwo_WKII_CW {
	
	@Test
	public void tes1()
	{
		int n = 8;
		boolean check_2pOwer = check_2POwer(n) ;
		System.out.println( "test1 ---" + check_2pOwer);
	}
	
	@Test
	public void test2()
	{
		int n = 10;
		boolean check_2pOwer = check_2POwer(n) ;
		System.out.println( "test2 ---" + check_2pOwer);
	}
	
	

	public  boolean check_2POwer(int n) {
		
		while ( n != 1)
		{
			if ( n % 2 ==0) 	{ n = n /2 ; }
			else return false ;
		}
		
		return true;
	}

}
