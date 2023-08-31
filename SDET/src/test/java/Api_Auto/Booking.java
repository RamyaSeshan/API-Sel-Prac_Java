package Api_Auto;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Booking {

	@Test
	public void CreateToken()
	{
		Response response  = RestAssured.given()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("auth")
				//.contentType("application/json")
				.contentType(ContentType.JSON)
				.body("{\r\n"
						+ "    \"username\" :\"admin\",\r\n"
						+ "    \"password\" :\"password123\"\r\n"
						+ "}")
				.log().all()
				.post();

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);


	}

}
