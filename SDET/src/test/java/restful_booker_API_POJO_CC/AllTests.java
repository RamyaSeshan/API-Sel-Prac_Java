package restful_booker_API_POJO_CC;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import restful_booker_API_POJO_Impl.BookingDates_PoJo;
import restful_booker_API_POJO_Impl.Booking_ID_POJO;
import restful_booker_API_POJO_Impl.CreateBooking_Pojo;
import restful_booker_API_POJO_Impl.CreateToken_Input_Pojo;
import restful_booker_API_POJO_Impl.Response_DeSer;
import restful_booker_API_POJO_Impl.Token_POJO;
import restful_booker_API_POJO_Impl.Update_Book_DeSer;

public class AllTests extends BaseClass{

	CreateToken_Input_Pojo t= new CreateToken_Input_Pojo("admin","password123");
	BookingDates_PoJo BookingPojo = new BookingDates_PoJo("2018-01-01" ,"2019-01-01");
	CreateBooking_Pojo CreateBookPojo =new CreateBooking_Pojo("FN-latest","LN-latest",1000,true, BookingPojo,"Breakfast--New");
	public String Auth ="Basic YWRtaW46cGFzc3dvcmQxMjM=";

	@Test(priority=1)
	public void Ping()
	{
		String Exp = "HTTP/1.1 201 Created";
		response = RestAssured
				.given()
				.basePath("ping")
				.get();

		int statusCode = response.getStatusCode();
		response.prettyPrint();
		System.out.println(" PING status code --- > "+ statusCode);
		System.out.println(" PING status Line --- > "+ response.getStatusLine());
		System.out.println("Ping response body is  --> "+response.getBody().asPrettyString());
		Assert.assertEquals(response.getStatusLine(), Exp);

	}


	@Test (priority=2)
	public void CreateToken()
	{
		int statusCode =200;
		System.out.println(t.getpassword());
		System.out.println(t.getusername());

		//RestAssured.baseURI =baseURI;
		RestAssured.basePath ="auth";
		response = RestAssured.given().contentType("application/json").when()
				// serilizarion -- in body give input as object
				.body(t)
				.post();


		token_from_JSONPATH = response.jsonPath().get("token");
		System.out.println("Token from response using JSON Path ---> "+ token_from_JSONPATH);

		// this is deserialization to get token from response as Object instead  of Json
		//Token_POJO is its POjo class 
		Token_POJO token_POJO = response.getBody().as(Token_POJO.class);

		token_fromPOJO=token_POJO.getToken();
		System.out.println("Token from Deserialization.... "+ token_fromPOJO);

		Assert.assertEquals(response.getStatusCode(), statusCode);


	}

	@Test(priority=3)
	public void CreateBooking ()
	{

		int statusCode=200;
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

		// All Assertions
		Assert.assertEquals(response.getStatusCode(), statusCode);
		Assert.assertEquals(firstname_from_POJO, CreateBookPojo.getFirstname());
		Assert.assertEquals(lastname_from_POJO, CreateBookPojo.getLastname());
		Assert.assertEquals(checkin,CreateBookPojo.getBookingdates().getCheckin());
		Assert.assertEquals(additionalneeds, CreateBookPojo.getAdditionalneeds());

	}

	@Test (priority=4,dependsOnMethods ={"restful_booker_API_POJO_CC.CreateBookingWithPojoImpl.CreateBooking"})
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

		//Assert.assertEquals(as[as.length-1].getBookingid(), Booking_ID_fromPOJO);
		//Assert.assertEquals(as[0].getBookingid(), Booking_ID_fromPOJO);
	}


	@Test (priority=5,dependsOnMethods ={"restful_booker_API_POJO_CC.CreateBookingWithPojoImpl.CreateBooking"})

	public void updateBooking ()
	{	

		BookingDates_PoJo BookingPojo_upd = new BookingDates_PoJo("2018-04-03" ,"2019-05-04");
		CreateBooking_Pojo CreateBookPojo_upd =new CreateBooking_Pojo("FN**UPD","LN**UPD",2000,false, BookingPojo_upd,"Breakfast--**UPD");

		String val =""+ Booking_ID_fromPOJO  ;
		String bookID = val.trim();
		RestAssured.basePath ="booking/"+bookID;
		response = RestAssured.given().contentType("application/json")
				.headers("Authorization" ,"Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.when()
				.body(CreateBookPojo_upd)
				.log().all()
				.put();
		response.prettyPrint();

		System.out.println("Response Status code is -->  "+ response.getStatusCode()) ;

		// this is deserialization to get response values from response as Object instead  of Json

		Update_Book_DeSer update_Book_DeSer = response.getBody().as(Update_Book_DeSer.class);
		String fn_Updated = update_Book_DeSer.getFirstname();
		String checkin = update_Book_DeSer.getBookingdates().getCheckin();
		Assert.assertEquals(fn_Updated, CreateBookPojo_upd.getFirstname());
		Assert.assertEquals(checkin, BookingPojo_upd.getCheckin());


	}

	@Test   (priority=6 ,dependsOnMethods ={"restful_booker_API_POJO_CC.CreateBookingWithPojoImpl.CreateBooking" ,
	"restful_booker_API_POJO_CC.CreateTokenWithPojoImpl.CreateToken"})

	public void DeleteBooking()
	{
		int statusCode =201;
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
		Assert.assertEquals(response.getStatusCode(), statusCode);

	}

}
