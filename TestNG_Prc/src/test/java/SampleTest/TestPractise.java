package SampleTest;
import java.util.Date;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestPractise {
	
	@Test (priority = 1 , enabled = false) // enabled default value is false , if we give false it will get IGNORED  from execution
	public void CreateTest()
	{
		System.out.println( "Thisis to create Test");
   	}		

	@Test (priority = 1)
	public void EditTest()
	{
		System.out.println( "Thisis to Edit Test " + new Date());
		//throw new SkipException("please skip this test ") ;
   	}	
	
	@Test (priority = 2)
	public void DeleteTest()
	{
		System.out.println( "Thisis to Delete Test"  + new Date());
   	}	

	@Test  (priority = -1 ,dependsOnMethods = "GeneralTest")
	public void UpdateTest()
	{
		System.out.println( "Thisis to Update Test"  + new Date() );
		throw new SkipException(" pls SKIP this test case ") ;
   	}	

	@Test   (priority = 3)
	public void GeneralTest()
	{
		System.out.println( "Thisis to General Test"  + new Date()  );
   	}

	@Test   (dependsOnMethods = { "UpdateTest" , "GeneralTest" } , alwaysRun = true)
	public void dependendTest()
	{
		System.out.println( "Thisis to dependendTest Test"  + new Date()  );
   	}
	
}
