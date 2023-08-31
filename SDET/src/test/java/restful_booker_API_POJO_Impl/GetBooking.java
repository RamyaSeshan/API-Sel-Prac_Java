package restful_booker_API_POJO_Impl;

import org.testng.annotations.Test; //

import io.restassured.RestAssured;

public class GetBooking extends BaseClass{
	
	@Test
	public void GetBooking()
	{
		response= RestAssured.given()
		//.baseUri(baseURI)
		.basePath("booking")
		.queryParam("id", Booking_ID_fromPOJO)
		.accept("application/json")
		.get();
		
		System.out.println("Get Booking Status code "+ response.getStatusCode());
	}

}
