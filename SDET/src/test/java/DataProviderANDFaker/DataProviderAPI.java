package DataProviderANDFaker;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DataProviderAPI {
	
	private static Response response ; 
	private boolean apiStatus = false;
	private Faker faker;
	
	public void testData()
	{
		try
		{
		response = RestAssured.given().get("https://random-data-api.com/api/v2/users?size=1&response_type=json") ;
		 int statusCode = response.statusCode() ;
		 
		 if(statusCode == 200) apiStatus = true ;
		 else apiStatus = false;
		 
		 if( ! apiStatus ) System.out.println(" Data Generation using API failed , hence Utilizing Faker lib to genefate data ");
		 generateFakerData();
		
	    } catch (Exception e) 
		{
	      e.getMessage();
	      throw new RuntimeException(e);
		}
	}

	private void generateFakerData() {
		faker = new Faker();		
	}
	
	
	private String getLastName()
	{
		if (apiStatus) return response.getBody().jsonPath().get("last_name") ;
		else 
			return faker.name().lastName() ;
	}
	
	private String getFirstName()
	{
		if (apiStatus) return response.getBody().jsonPath().get("first_name") ;
		else 
			return faker.name().firstName() ;
	}
	
	private String generateUserName() {
        if (apiStatus) {
            return response.getBody().jsonPath().get("username");
        } else 
        {
          return faker.name().username();
        }
    }

	
	@DataProvider
	public Object[][] getData()
	{
		testData() ;
		Object[][]  data = {
				
				{ getLastName() , getFirstName() }
		} ; 
		return data;
		
	}
}
