package JIRA_SAT_CLASS_Demo;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {
public static String sys_ID;
	
	@BeforeMethod
	public void setUp() {
		// Set Endpoint
	RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";
				
				// Set Authentication
	RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
				
	}
}
