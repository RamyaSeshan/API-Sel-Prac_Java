import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;

public class DeSerilizationUsingRAJsonPath {

	 public static void main(String[] args) throws StreamReadException, DatabindException, IOException
	 {
		 File json = new File("employee.json") ;
		 
		 JsonPath jsonPath = JsonPath.from(json) ;
		 Employee readValue = jsonPath.getObject("", Employee.class) ;
		 
		 System.out.println( readValue.getAge());
		 System.out.println( readValue.getName());
		 System.out.println( readValue.getDesc());
		 
		
	  }
	
	
}
