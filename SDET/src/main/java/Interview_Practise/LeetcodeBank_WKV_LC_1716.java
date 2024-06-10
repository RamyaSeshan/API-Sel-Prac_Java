package Interview_Practise;

import org.junit.Test;

public class LeetcodeBank_WKV_LC_1716 

{
	@Test
	public void test1()
	{
		int n = 4;		
		int totalMoney = totalMoney( n) ;
		System.out.println( "test1   totalMoney " +totalMoney);
	}


	@Test
	public void test2()
	{
		int n = 10;		
		int totalMoney = totalMoney( n) ;
		System.out.println( "test2   totalMoney " +totalMoney);
	}

	@Test
	public void test3()
	{
		int n = 20;		
		int totalMoney = totalMoney( n) ;
		System.out.println( "tes3   totalMoney " +totalMoney);
	}



	public int totalMoney1(int n)
	{
		int cnt =1;
		int sum =0 , intialvalue =1 , incr = intialvalue ;
		for (int i = 1; i <= n ; i++) 
		{
			if (cnt ==1 )
			{
				sum = sum + intialvalue ;  // 1 + 2 
				cnt ++;
				incr = intialvalue +1 ;				
			}
			else if ( cnt >1 && cnt <=7)
			{
				sum = sum +  incr;
				cnt ++;
				incr = incr +1 ;					
			}
			else if (  cnt > 7)
			{
				cnt =2 ; 
				intialvalue = intialvalue +1;
				sum = sum + intialvalue ;
				incr = intialvalue +1 ;
			}
		}

		return sum;

	}

	public int totalMoney(int n) // took 1 ms 
	{
		int intial = 1 , start = intial  , sum = 0 ; 
	    
	    for (int i = 0; i <n; i++) 
	    {
	        if (i != 0 &&  i %7 == 0 ) { intial = intial+1 ;start = intial ; sum = sum +start ;}
	        else  {  sum = sum +start ;}    
	        start ++;           
	    }
	    return sum ;

	}

}
