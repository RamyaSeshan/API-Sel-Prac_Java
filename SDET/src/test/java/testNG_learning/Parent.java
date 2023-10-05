package testNG_learning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parent {
	
@BeforeSuite //@BeforeSuite: The annotated method will be run before all tests in this suite have run.
public void beforeSuite()
{
	System.out.println(" Method from @BeforeSuite------*****  ");
}

@AfterSuite //@AfterSuite: The annotated method will be run after all tests in this suite have run.
public void AfterSuite()
{
	System.out.println(" Method from @AfterSuite------ **** ");
}

@Test

public void testanno()
{
	System.out.println(" Method from @Test----MAIN-- ****** ");
}

@Test
public void test1()
{
	System.out.println(" Method from @Test---TEST 1--- ****** ");
}

@BeforeTest //@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
public void beforeTest()
{
	System.out.println(" Method from @BeforeTest------ ****** ");
}

@AfterTest //The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
public void afterTest()
{
	System.out.println(" Method from @AfterTest------ ****** ");
}


@BeforeClass //@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
public void beforeClass()
{
	System.out.println(" Method from @BeforeClass------ ****** ");
}

@AfterClass //@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
public void afterClass()
{
	System.out.println(" Method from @AfterClass------ ****** ");
}


@BeforeMethod //The annotated method will be run before each test method.
public void beforeMethod()
{
	System.out.println(" Method from @BeforeMethod------ ****** ");
}


@AfterMethod//@AfterMethod: The annotated method will be run after each test method.
public void afterMethod()
{
	System.out.println(" Method from @AfterMethod/------ ****** ");
}


}
