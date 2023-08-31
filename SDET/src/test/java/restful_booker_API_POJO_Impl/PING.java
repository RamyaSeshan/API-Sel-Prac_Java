package restful_booker_API_POJO_Impl;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PING extends BaseClass{
	
	@Test
	public void Ping()
	{
		response = RestAssured
				.given()
				.basePath("ping")
				.get();
		
		int statusCode = response.getStatusCode();
		response.prettyPrint();
		System.out.println(" PING status code --- > "+ statusCode);
		System.out.println("Ping response body is  --> "+response.getBody().asPrettyString());
		
	}


}
