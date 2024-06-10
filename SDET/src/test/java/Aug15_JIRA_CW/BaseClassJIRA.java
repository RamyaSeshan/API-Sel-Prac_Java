package Aug15_JIRA_CW;

import java.io.File;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseClassJIRA {
	
	public static Response response; 
	 int statusCode;
     String ID ="";
     String KEY="";
     public static File NAME = new File("./src/test/resources/JIRA_PUT_Payload.json");
	
	@BeforeMethod
	public void SetUp()
	{
		String PW ="ATATT3xFfGF0d39TsozfFQWR0Hvr0UfPqKKtyFJxQvnaGGtSvez8FvOvhfzSTapOBEUGx0ZAdIbWfM5tjeU8rFw7Rh72pbanmBdYhtysnC3yH89HMn-lXz9PTGKVKtWFV2vp6GyZ_75P27LqLCAbHxqOjYds1SNn5oFZQFDi3ufeUI3cJwdCy20=5543D93F";
		RestAssured.baseURI ="https://testjirafeb2023.atlassian.net/rest/api/2/" ;
		RestAssured.authentication = RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", PW);
	}

}
