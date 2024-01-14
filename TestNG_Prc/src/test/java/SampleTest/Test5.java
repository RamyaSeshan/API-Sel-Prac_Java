package SampleTest;

import java.util.Date;

import org.testng.annotations.Test;

public class Test5 {

	@Test (priority = 1 , enabled = true)
	public void Test5test()
	{
		System.out.println( "This is totest from Test 5 class "  + new Date());
	}	

}
