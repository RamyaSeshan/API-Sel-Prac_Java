package restful_booker_APIAuto;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateTokenWithPojoImpl extends BaseClass {
	
	//CreateToken_Input_Pojo -- THis is the POJO class to get User name /PW to send in body
	
	CreateToken_Input_Pojo t= new CreateToken_Input_Pojo("admin","password123");
	
	
	
	@Test
	public void CreateToken()
	{
		System.out.println(t.getpassword());
		System.out.println(t.getusername());

		//RestAssured.baseURI =baseURI;
		RestAssured.basePath ="auth";
		response = RestAssured.given().contentType("application/json").when()
				// serilizarion -- in body give input as object
		.body(t)
		.post();
		
		// this is deserialization to get token from response as Object instead  of Json
		//Token_POJO is its POjo class 
		Token_POJO token_POJO = response.getBody().as(Token_POJO.class);
		token = response.jsonPath().get("token");
		System.out.println("Token is "+ token);
		System.out.println("Token from Deserialization.... "+ token_POJO.getToken());
		;
		
	}
	

}
