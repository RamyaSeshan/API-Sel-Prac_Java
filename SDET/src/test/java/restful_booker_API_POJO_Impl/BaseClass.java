package restful_booker_API_POJO_Impl;

import java.io.File;
import java.util.List;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseClass {
	//https://restful-booker.herokuapp.com/apidoc/index.html //

	public static String baseURI ="https://restful-booker.herokuapp.com/";
	Response response;
	public static String  token_fromPOJO ="";
	String  token_from_JSONPATH ="";
	public File file = new File ("./src/test/resources/Payload.json");
	public  static int Booking_ID_fromPOJO ;
	public  static int Booking_ID ;
	public static String firstname_from_POJO;
	public static String lastname_from_POJO;
	public static Booking_ID_POJO[] getbookingid_From_Deser;
	
	@BeforeTest
	public  void setUp() {
		RestAssured.baseURI =baseURI;      
	}

}
