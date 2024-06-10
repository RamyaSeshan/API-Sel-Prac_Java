import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeSerilizationUsingObjMapper {

	 public static void main(String[] args) throws StreamReadException, DatabindException, IOException
	 {
		 File json = new File("employee.json") ;
		 ObjectMapper mapper = new ObjectMapper() ;
		 Employee readValue = mapper.readValue(json, Employee.class) ;
		 
		 System.out.println( readValue.getAge());
		 System.out.println( readValue.getName());
		 System.out.println( readValue.getDesc());
		 
		
	  }
	
	
}
