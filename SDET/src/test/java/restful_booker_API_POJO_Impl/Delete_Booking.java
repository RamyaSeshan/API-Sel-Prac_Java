package restful_booker_API_POJO_Impl;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Delete_Booking  extends BaseClass{
	
	
	@Test  //(dependsOnMethods = {"restful_booker_APIAuto.Healthcheck.CreateBooking"})
	public void DeleteBooking()
	{
		response= RestAssured.given()
		//.baseUri(baseURI)
		.basePath("booking/"+Booking_ID_fromPOJO)
		//.auth().preemptive().oauth2("Basic YWRtaW46cGFzc3dvcmQxMjM=")
	
		.cookie(token_fromPOJO)
		.delete();
		
		System.out.println("Delete Status code"+ response.getStatusCode());
		String Del_response = response.getBody().asString();
		System.out.println( Del_response);
	}

}
