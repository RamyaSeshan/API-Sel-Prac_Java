package restful_booker_API_POJO_Impl;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateBooking_PUT  extends BaseClass{

		BookingDates_PoJo BookingPojo = new BookingDates_PoJo("2018-03-03" ,"2019-04-04");
		
		CreateBooking_Pojo CreateBookPojo =new CreateBooking_Pojo("FN123F1N","LN1232LN",2000,false, BookingPojo,"Breakfast--Updated");
		
		@Test  
		public void CreateBooking ()
		{	RestAssured.basePath ="booking";
			response = RestAssured.given().contentType("application/json")
					.when()
					.body(CreateBookPojo)
					.log().all()
					.post();
			response.prettyPrint();
			//Booking_ID =response.jsonPath().get("bookingid");
			 Booking_ID =response.jsonPath().getInt("bookingid");
			System.out.println("Booking Id is "+ Booking_ID) ;
			
			// this is deserialization to get response values from response as Object instead  of Json
		
			Response_DeSer Res_De_Ser = response.getBody().as(Response_DeSer.class);
			
			String additionalneeds = Res_De_Ser.getBooking().getAdditionalneeds();
		 Booking_ID_fromPOJO  = Res_De_Ser.getBookingid();
			String checkin = Res_De_Ser.getBooking().getBookingdates().getCheckin();
			firstname_from_POJO= Res_De_Ser.getBooking().getFirstname();
			lastname_from_POJO =Res_De_Ser.getBooking().getLastname();
			
		  System.out.println("additionalneeds is ---" + additionalneeds +"   "+""
		  		+ "getbookingid is --- "+"   "+ Booking_ID_fromPOJO 
		  		+"checkin is  ---"+"   "+ checkin 
		  		+"firstname is --- " +"    "+ firstname_from_POJO);
		
		}

}
