package CoWin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import restful_booker_API_POJO_Impl.Response_DeSer;

public class Sessions {
	
	
   @Test
	public void getStateID() throws StreamReadException, DatabindException, IOException 
	{
		//Map<Integer , String > map = new HashMap<Integer , String >() ;
		//int stateID_TN = -1 ;
	   
	   State obj = new State() ;
	  StateVal x = new StateVal();
	// State[] get_Values = x.get_Values() ;
	// get_Values[0].get_Stateid() ;
	   
		ObjectMapper mapper = new ObjectMapper();
		StateVal res = mapper.readValue(new File(getClass().getClassLoader().getResource("stateID.json").getFile()), StateVal.class) ;
	  
	   
		
		
		Response response = (Response) RestAssured.given()
		.contentType("application/json")
		.get("https://cdn-api.co-vin.in/api/v2/admin/location/states")  ;
		//.then()
	    //.statusCode(200)  ;		
		
		int statusCode = response.statusCode() ;
		long time = response.time() ;
		response.asPrettyString() ;
		
		StateVal val = response.getBody().as(StateVal.class) ;
	    //State[] get_StateDetails = val[0].get_Values() ;
	    //get_StateDetails[0].get_Stateid() ;
	    //get_StateDetails[0].get_StateName() ;
	    
		
		
		System.out.println("Response code is *** "  + statusCode);
		System.out.println("Response time is  *** "  + time);
		
		System.out.println("*************  State ID and Name from de serialization ***********");
		//System.out.println( "  get_StateDetails[0].get_Stateid()   " +  get_StateDetails[0].get_Stateid());
		//System.out.println("      get_StateDetails[0].get_StateName() ;   " +    get_StateDetails[0].get_StateName() );
		
		
		
		/*List<Integer> list = response.body().jsonPath().getList("states.state_id") ;
		List<String> name = response.body().jsonPath().getList("states.state_name") ;
		
		for (Integer stateID : list)  
		{
			for (String stateName : name) 
			{
				map.put(stateID, stateName) ;
			}		
		}
		
	     /*	for (String stateName : name)  
		{
		  System.out.println("The state Name is   " +stateName );
		} 
	
		for (Map.Entry<Integer, String> entry : map.entrySet()) 
		{
			if (entry.getValue().equals("Tamil Nadu")) 
			{  stateID_TN = entry.getKey() ;
			   System.out.println("State id is   " + stateID_TN );
			   break ;   } 
			else continue  ;
		}
		
		System.out.println(" State id for Tamil Nadu is  "  + stateID_TN); */
		
	}


@Test
public void getDistrictID()
{
	Response response = RestAssured.given()
	.get("https://cdn-api.co-vin.in/api/v2/admin/location/districts/31 ") ;
	
	int statusCode = response.statusCode() ;
	long time = response.time() ;
	
	System.out.println(" response code getDistrictID  is  "  + statusCode);
	System.out.println(" response time getDistrictID  is  "  + time);
	
	List<Integer> dist_ID = response.body().jsonPath().getList("districts.district_id") ;
	List<String> dist_Name = response.body().jsonPath().getList("districts.district_name") ;
	
	System.out.println(" dist_ID is  "  + dist_ID);
	System.out.println(" dist_Name  is  "  + dist_Name);
	
}


@Test
public void getSessionbyDistID()
{

	Response response = RestAssured.given()
	.queryParam("district_id"	, 571)
	.queryParam("date", "29-12-2023")
    .when()
    .get("https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByDistrict") ;
	
	System.out.println(" response code is  getSessionbyDistID() " +response.statusCode());
	System.out.println(" response code is  getSessionbyDistID() " +response.time());
	System.out.println(" response code is  getSessionbyDistID() " +response.body().jsonPath().getString("sessions.address"));
  
}



}
