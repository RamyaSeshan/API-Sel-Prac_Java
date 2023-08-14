package restful_booker_APIAuto;

import java.io.File;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseClass {
	
	
	public static String baseURI ="https://restful-booker.herokuapp.com/";
	Response response;
	String  token ="";
	public File file = new File ("./src/test/resources/Payload.json");
	public static int Booking_ID ;

	@BeforeTest
	public  void setUp() {
		RestAssured.baseURI =baseURI;      
	}

}
