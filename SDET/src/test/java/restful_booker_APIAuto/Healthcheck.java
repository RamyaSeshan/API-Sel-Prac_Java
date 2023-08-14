package restful_booker_APIAuto;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Healthcheck extends BaseClass{

	@Test
	public void healthChk()
	{
		response = RestAssured
				.given()
				.basePath("ping")
				.get();
		int statusCode = response.getStatusCode();
		response.prettyPrint();
		System.out.println(" healthChk "+ statusCode);
		// response.then().assertThat().statusCode(201);
	}

	@Test
	public void CreateToken()
	{
		//RestAssured.baseURI =baseURI;
		RestAssured.basePath ="auth";
		response = RestAssured.given().contentType("application/json").when()
		.body("{\r\n"
				+ "    \"username\" :\"admin\",\r\n"
				+ "    \"password\" :\"password123\"\r\n"
				+ "}")
		.post();
		
		token = response.jsonPath().get("token");
		System.out.println("Token is "+ token);
	}
	
	@Test
	public void CreateBooking ()
	{

		//RestAssured.baseURI =baseURI;
		RestAssured.basePath ="booking";
		response = RestAssured.given().contentType("application/json")
				.when()
				.body(file)
				.post();
		
		Booking_ID =response.jsonPath().get("bookingid");
		System.out.println("Booking Id is "+ Booking_ID);
		
	}
	
	@Test
	public void GetBooking()
	{
		response= RestAssured.given()
		//.baseUri(baseURI)
		.basePath("booking")
		.queryParam("id", Booking_ID)
		.accept("application/json")
		.get();
		
		System.out.println("Get Booking Status code "+ response.getStatusCode());
	}
	
	@Test  //(dependsOnMethods = {"restful_booker_APIAuto.Healthcheck.CreateBooking"})
	public void DeleteBooking()
	{

		response= RestAssured.given()
		//.baseUri(baseURI)
		.basePath("booking" + "/Booking_ID")
		//.auth().preemptive().oauth2("Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.cookie(token)
		.delete();
		
		System.out.println("Delete Status code"+ response.getStatusCode());
	}
}
