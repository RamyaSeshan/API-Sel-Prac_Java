package Interview_Practise;

import org.junit.Test;

import com.fasterxml.jackson.databind.node.IntNode;

public class Tournment_LC_1688_WKII_CW {
	
	@Test
	public void test1()
	{
		int n = 7;
		int numberOfMatches = numberOfMatches( n) ;
		System.out.println( " test 1 ---- " +numberOfMatches);
	}

	@Test
	public void test2()
	{
		int n = 14;
		int numberOfMatches = numberOfMatches( n) ;
		System.out.println( " test 2 ---- " +numberOfMatches);
	}
	
	
	public  int numberOfMatches(int n) 
	{
		int Matches  = 0;
		
		while ( n > 1 )
		{
			if( n % 2==0)
			{
				Matches = Matches + ( n / 2) ; // 3 + 2  + 1
				 n = n /2 ; // 2  , 1 
			}else 
			{
				Matches = Matches +  (n -1  ) / 2  ; // 3
				 n = 1 +  n /2 ; // 4
			}
		}		
		return  Matches ;
	}

}
