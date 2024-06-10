package Aug15_JIRA_CW;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import restful_booker_APIAuto.BaseClass;

public class Incident extends BaseClassJIRA{

	@Test
	public void CreateInc()
	{
		response= RestAssured.given()
				.contentType("application/json")
				.when()
				.body("{\r\n"
						+ "    \"fields\": {\r\n"
						+ "        \"project\": {\r\n"
						+ "            \"key\": \"TES\"\r\n"
						+ "        },\r\n"
						+ "        \"summary\": \"create issue in RA project\",\r\n"
						+ "        \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
						+ "        \"issuetype\": {\r\n"
						+ "            \"name\": \"Bug\"\r\n"
						+ "        }\r\n"
						+ "    }\r\n"
						+ "}")
				.post("issue/");

		response.prettyPrint();
		ID = response.jsonPath().get("id");
		KEY = response.jsonPath().get("key");

		System.out.println("Create Incident Status code is -- " +  response.getStatusCode() );
		
		//response.then().assertThat().statusCode(201);
		//response.then().assertThat().body("id", Matchers.equalTo(ID));


	}
	@Test(dependsOnMethods = "Aug15_JIRA_CW.Incident.CreateInc")
	public void UpdateIncidentById() {
		response = RestAssured.given()
				.contentType("application/json")
				.when()
				.body(NAME)
				.put("issue/"+ID);		

		System.out.println("Update Incident BY ID  Status code is -- " +  response.getStatusCode() );
	}
	@Test(dependsOnMethods = "Aug15_JIRA_CW.Incident.CreateInc")
	public void UpdateIncidentByKey() {
		response = RestAssured.given()
				.contentType("application/json")
				.when()
				.body(NAME)
				.put("issue/"+KEY);		

		System.out.println("Update Incident BY KEY  Status code is -- " +  response.getStatusCode() );	
	}
	@Test(dependsOnMethods = "Aug15_JIRA_CW.Incident.UpdateIncidentById")
	public void DeleteByID()
	{
		response = RestAssured.delete("issue/" +ID);
		System.out.println("Delete Incident BY ID  Status code is -- " +  response.getStatusCode() );	
	}
}
