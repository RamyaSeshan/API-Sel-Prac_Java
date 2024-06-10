package Interview_Practise;

import org.junit.Test;

public class NoOfSRCitizen_LC_2678_WKIIICW {

	// https://leetcode.com/problems/number-of-senior-citizens/description/
	@Test
	public void test1()
	{
		String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010" } ;
		int countSeniors = countSeniors( details)  ;
		System.out.println("test1 --- " +countSeniors);
		
	}
	
	@Test
	public void test2()
	{
		String[] details = {"1313579440F2036","2921522980M5644" } ;
		int countSeniors = countSeniors( details)  ;
		System.out.println("test2 --- " +countSeniors);
		
	}
	

	public  int countSeniors(String[] details) 
	{
          int count =0 ;
		  for (int i = 0; i < details.length; i++) 
		  {
			 String substring = details[i].substring(11, 13) ;
			 
			 if(Integer.parseInt(substring) > 60 ) count ++;
		  }
          return count;
	}

}
