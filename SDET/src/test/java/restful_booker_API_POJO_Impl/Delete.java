package restful_booker_API_POJO_Impl;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Delete extends BaseClass {
	
	public String Auth ="Basic YWRtaW46cGFzc3dvcmQxMjM=";
	

	@Test   (dependsOnMethods ={"restful_booker_API_POJO_Impl.CreateBookingWithPojoImpl.CreateBooking" ,
			"restful_booker_API_POJO_Impl.CreateTokenWithPojoImpl.CreateToken"})

	public void DeleteBooking()
	{
 		System.out.println(Booking_ID_fromPOJO);
		response= RestAssured.given()	
		.basePath("booking/" + Booking_ID_fromPOJO)
		//.header("Cookie", "token="+  token_fromPOJO)  -- correct 
		.header("Authorization" ,"Basic YWRtaW46cGFzc3dvcmQxMjM=")  // correct 
		//.auth().preemptive().oauth2(Auth)  --- wrong
		//.cookie(token) --- wrong
		//.cookie("24a58eb25ab3ae2") --- wrong
		.delete();
		
		System.out.println("Delete Status code"+ response.getStatusCode());
		System.out.println("Delete response body is  --> "+response.getBody().asPrettyString());
		
	}
}
