package restful_booker_APIAuto;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class HealthCheck extends BaseClass{

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
		System.out.println("Ping response body is "+response.getBody().asPrettyString());	
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
	
	@Test // Adding body in MAP and doing serilization using JACKSON Data BIND lib , Java Map obj will get serialized to JSON automatically
	public void CreateBooking_UsingMapData ()
	{

		//RestAssured.baseURI =baseURI;	
		
		Map<Object ,Object> josnBody = new HashMap<Object ,Object>() ;
	    Map<String ,Object> dates = new HashMap<String ,Object>() ;
	    
	    dates.put( "checkin", "2018-01-01") ;
	    dates.put( "checkout", "2019-01-01") ;
	    
	    
		josnBody.put("firstname", "Ramya") ;
		josnBody.put("lastname", "Seshan") ;
		josnBody.put("totalprice", 1000) ;
		josnBody.put("depositpaid", true) ;
		josnBody.put("bookingdates ", dates) ;
		josnBody.put(  "additionalneeds",  "Breakfast") ;
			
		
		
		RestAssured.basePath ="booking";
		response = RestAssured.given().contentType("application/json")
				.when()
				.body(josnBody)
				.log().all()
				.post();
		
		System.out.println( " response.getStatusCode() --- "+ response.getStatusCode() );
		System.out.println( " response.getStatusCode() --- "+ response.getStatusLine());
		//Booking_ID =response.jsonPath().get("bookingid");
		//System.out.println("Booking Id is "+ Booking_ID);
		
	}
	
	
	//@Test
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
	
	//@Test  (dependsOnMethods = {"restful_booker_APIAuto.Healthcheck.CreateBooking"}) //
	public void DeleteBooking()
	{

		response= RestAssured.given()
		//.baseUri(baseURI)
		.basePath("booking" + "/Booking_ID")
		.auth().preemptive().oauth2("Basic YWRtaW46cGFzc3dvcmQxMjM=")
		//.cookie(token)
		.delete();
		
		System.out.println("Delete Status code"+ response.getStatusCode());
	}
}
