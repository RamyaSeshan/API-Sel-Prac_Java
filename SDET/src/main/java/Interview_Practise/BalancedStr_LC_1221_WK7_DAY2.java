package Interview_Practise;

import org.junit.Test;

public class BalancedStr_LC_1221_WK7_DAY2
{
	@Test
	public void test1()
	{
		String s = "RLRRLLRLRL" ;
		int chkBalCnt = chkBalCnt(s) ;
		System.out.println(chkBalCnt);
	}
	
	@Test
	public void test2()
	{
		String s = "RLRRRLLRLL" ;
		int chkBalCnt = chkBalCnt(s) ;
		System.out.println(" from test 2 " +chkBalCnt);
	}
	
	@Test
	public void test3()
	{
		String s = "LLLLRRRR" ;
		int chkBalCnt = chkBalCnt(s) ;
		System.out.println(" from test 3 " +chkBalCnt);
	}

	

	public int chkBalCnt(String s) {
		int Rcnt = 0 , Lcnt =0 , splitCnt = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i) == 'L') Lcnt ++;
			else if  (s.charAt(i) == 'R') Rcnt ++;
			
			if(Lcnt == Rcnt )
			{
				splitCnt ++;
				Rcnt = 0 ; Lcnt =0 ;
			}			
		}
		
		return splitCnt ;

	}
}
