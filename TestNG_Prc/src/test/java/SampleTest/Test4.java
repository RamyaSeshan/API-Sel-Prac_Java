package SampleTest;

import java.util.Date;

import org.testng.annotations.Test;

public class Test4 {

	@Test (priority = 1 , enabled = true)
	public void Test4test()
	{
		System.out.println( "This is totest from Test 4 class "  + new Date());
	}	

}
