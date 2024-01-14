package SampleTest;

import java.util.Date;

import org.testng.annotations.Test;

public class Test3 {

	@Test (priority = 1 , enabled = true)
	public void Test3test()
	{
		System.out.println( "This is totest from Test 3 class "  + new Date());
	}	

}
