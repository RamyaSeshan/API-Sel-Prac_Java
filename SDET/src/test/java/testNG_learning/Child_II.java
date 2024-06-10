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

public class Child_II extends Parent {
	/*
	@BeforeSuite //@BeforeSuite: The annotated method will be run before all tests in this suite have run.
	public void beforeSuite_fromChild()
	{
		System.out.println(" Method from @BeforeSuite from CHILD------*****  ");
	}

	@AfterSuite //@AfterSuite: The annotated method will be run after all tests in this suite have run.
	public void AfterSuite_fromChild()
	{
		System.out.println(" Method from @AfterSuite  from CHILD ------ **** ");
	} 
	
	@BeforeTest //@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
	public void beforeTest_fromChild()
	{
		System.out.println(" Method from @BeforeTest  from CHILD------ ****** ");
	}

	@AfterTest //The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
	public void afterTest_fromChild()
	{
		System.out.println(" Method from @AfterTest from CHILD ------ ****** ");
	}

	
	@BeforeClass //@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	public void beforeClass_fromChild()
	{
		System.out.println(" Method from @BeforeClass from CHILD ------ ****** ");
	}

	@AfterClass //@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	public void afterClass_fromChild()
	{
		System.out.println(" Method from @AfterClass from CHILD ------ ****** ");
	}
	

@BeforeMethod //The annotated method will be run before each test method.
public void beforeMethod_fromChild()
{
	System.out.println(" Method from @BeforeMethod from CHILD ------ ****** ");
}


@AfterMethod//@AfterMethod: The annotated method will be run after each test method.
public void afterMethod_fromChild()
{
	System.out.println(" Method from @AfterMethod from CHILD ------ ****** ");
}

*/
@Test  (priority =3,description = "this is from child II " , dependsOnMethods ={"testNG_learning.Parent.parentTesta"})
public void aTest()
{
	System.out.println(" Method from @Test---from CHILD --- ****** ");
}


@Test (priority =3 ,dependsOnMethods = {"testNG_learning.Child_II.bTest" ,"testNG_learning.Child_II.aTest" })
public void test_Dependson_EG()
{
	System.out.println(" ex to should when a TC is dependent on multile cases --- ****** ");
}

@Test (priority = 1 )
public void bTest()
{
	System.out.println(" this is Test3 from Child II --- ****** ");
}
}
