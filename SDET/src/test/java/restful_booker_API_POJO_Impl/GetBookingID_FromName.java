package restful_booker_API_POJO_Impl;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetBookingID_FromName extends BaseClass{

	@Test (dependsOnMethods ={"restful_booker_API_POJO_Impl.CreateBookingWithPojoImpl.CreateBooking"})
	public void getBookID_FromName() //
	{
		System.out.println(firstname_from_POJO);		
		response = RestAssured.given()
				.basePath("booking")		
.accept("application/json")
.with()
.queryParam("firstname", firstname_from_POJO)
.queryParam("lastname",lastname_from_POJO)
.when()
.get();
		response.prettyPrint();
  Booking_ID_POJO[] as = response.getBody().as(Booking_ID_POJO[].class);
  int val = as.length;   System.out.println(val);  
  
 for (Booking_ID_POJO booking_ID_POJO : as) {
	  System.out.println("The Value of Bookig ID from GET is...."+booking_ID_POJO.getBookingid());
       }
	}
}

