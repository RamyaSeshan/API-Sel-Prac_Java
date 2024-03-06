package Interview_Practise;

import org.junit.Test;

public class Crawler_log_folder_LC_1598_Week12_Day5 
{
	@Test
	public void test1()
	{	
		String[] logs = {"d1/","d2/","../","d21/","./" } ;
		System.out.println(minOperations(logs));
	}

	@Test
	public void test2()
	{	
		String[] logs = {"d1/","d2/","./","d3/","../","d31/" } ;
		System.out.println(minOperations(logs));
	}

	@Test
	public void test3()
	{	
		String[] logs = {"d1/","../","../","../"} ;
		System.out.println(minOperations(logs));
	}

	public int minOperations(String[] logs) {
		int count =0 ;

		for (int i = 0; i < logs.length; i++) 
		{
			String string = logs[i] ;

			if ( logs[i].equals("../") &&  count !=0 ) count = count -1  ;
			else if ( logs[i].equals("./")  ) continue ;
			else   count = count + 1; 

		}
		return count;
	}

}

