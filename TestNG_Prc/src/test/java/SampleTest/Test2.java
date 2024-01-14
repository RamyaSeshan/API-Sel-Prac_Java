package SampleTest;

import java.util.Date;

import org.testng.annotations.Test;

public class Test2 {

	//@Test (priority = 1 , enabled = true ,invocationCount = 5 ,timeOut = 10)
	
	public void Test2test()
	{
		System.out.println( "This is totest from Test 2 class " + new Date() );
	}	

	
 // @Test (priority = 1 , enabled = true ,invocationCount = 5 ,invocationTimeOut = 10)
	
	public void Test2testTimeOut()
	{
		System.out.println( "This is totest from Test 2 class " + new Date() );
	}
  
  
  @Test (priority = 1 , enabled = true ,invocationCount = 6 ,threadPoolSize = 2)
	
 	public void Test2testThreadPoolSize()
 	{
 		System.out.println( "This is totest from Test 2 class " + new Date() );
 	}
}
