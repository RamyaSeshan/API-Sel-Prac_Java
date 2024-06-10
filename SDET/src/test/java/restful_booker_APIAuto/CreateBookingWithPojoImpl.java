package restful_booker_APIAuto;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateBookingWithPojoImpl extends BaseClass{
	
	BookingDates_PoJo BookingPojo = new BookingDates_PoJo("2018-01-01" ,"2019-01-01");
	
	CreateBooking_Pojo CreateBookPojo =new CreateBooking_Pojo("FN","LN",1000,true, BookingPojo,"Breakfast");
	
	@Test
	public void CreateBooking ()
	{

		//RestAssured.baseURI =baseURI;
		RestAssured.basePath ="booking";
		response = RestAssured.given().contentType("application/json")
				.when()
				.body(CreateBookPojo)
				.log().all()
				.post();
		response.prettyPrint();
		//Booking_ID =response.jsonPath().get("bookingid");
		 Booking_ID =response.jsonPath().getInt("bookingid");
		System.out.println("Booking Id is "+ Booking_ID) ;
		
		Response_DeSer Res_De_Ser = response.getBody().as(Response_DeSer.class);
		
		String additionalneeds = Res_De_Ser.getBooking().getAdditionalneeds();
		int getbookingid = Res_De_Ser.getBookingid();
		String checkin = Res_De_Ser.getBooking().getBookingdates().getCheckin();
		String firstname = Res_De_Ser.getBooking().getFirstname();
	
		
	  System.out.println("additionalneeds is ---" + additionalneeds +"   "+""
	  		+ "getbookingid is --- "+"   "+ getbookingid 
	  		+"checkin is  ---"+"   "+ checkin 
	  		+"firstname is --- " +"    "+firstname);
		
		
		
	}

}
