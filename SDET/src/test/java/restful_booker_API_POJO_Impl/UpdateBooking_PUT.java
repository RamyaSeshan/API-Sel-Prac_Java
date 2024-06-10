package restful_booker_API_POJO_Impl;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateBooking_PUT  extends BaseClass{ //

	BookingDates_PoJo BookingPojo = new BookingDates_PoJo("2018-03-03" ,"2019-04-04");

	CreateBooking_Pojo CreateBookPojo =new CreateBooking_Pojo("FN**UPD","LN**UPD",2000,false, BookingPojo,"Breakfast--**UPD");

	@Test   (dependsOnMethods ={"restful_booker_API_POJO_Impl.CreateBookingWithPojoImpl.CreateBooking"})

	public void CreateBooking ()
	{	
		String val =""+ Booking_ID_fromPOJO  ;
		String bookID = val.trim();
		RestAssured.basePath ="booking/"+bookID;
		response = RestAssured.given().contentType("application/json")
				.headers("Authorization" ,"Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.when()
				.body(CreateBookPojo)
				.log().all()
				.put();
		response.prettyPrint();

		System.out.println("Response Status code is -->  "+ response.getStatusCode()) ;

		// this is deserialization to get response values from response as Object instead  of Json

		Update_Book_DeSer update_Book_DeSer = response.getBody().as(Update_Book_DeSer.class);
		String fn_Updated = update_Book_DeSer.getFirstname();
		Assert.assertEquals(fn_Updated, CreateBookPojo.getFirstname());


	}

}
