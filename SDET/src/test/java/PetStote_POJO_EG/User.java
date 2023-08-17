package PetStote_POJO_EG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class User {
	
	@Test
	public void CreateUser()
	{
		UserData userdata =new UserData(100,"AA","BB","CC","DD","EE","FF",1);
		
		Response response = RestAssured.given()
		.baseUri("https://petstore.swagger.io/v2/")
		.basePath("user")
		.auth().basic("test", "abc123")
		.contentType("application/json")
		.when()
		.body(userdata)
		.post();
		
		response.prettyPrint();
		System.out.println("Response code is-----" + response.getStatusCode());
		
}
}