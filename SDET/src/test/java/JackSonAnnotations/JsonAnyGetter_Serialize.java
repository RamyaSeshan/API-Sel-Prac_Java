package JackSonAnnotations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetter_Serialize 
{
	
	public static void main(String[] args) throws JsonProcessingException 
	{
		Map<String , Object > employeeDetails  = new HashMap<String, Object>();
		employeeDetails.put("FirstName", "Ramya") ;
		employeeDetails.put("LastName", "S") ;
		employeeDetails.put("email", "Ramya.S@gmail.com") ;
		employeeDetails.put("Skills", Arrays.asList("Java" , "Python" , "C#" ,"Pascal" ,"JavaScript")) ;
		
		JsonAnyGetter_POJO jsonAnyGetter_POJO = new JsonAnyGetter_POJO();
		jsonAnyGetter_POJO.setEmployee(employeeDetails);
		
		// serialization of POJO with ObjecMapper
		ObjectMapper obj = new ObjectMapper();
		String writeValueAsString = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonAnyGetter_POJO) ;
		System.out.println(writeValueAsString);
		
		// if you run this , in the output we will get MapName employeeDetails as root of dictoniary 
		// if i case we dont want that  ,then weca use ANNOTATION JSONANYGETTER
		// for this we need to add JsonAnyGetter on top of GETTER function , this is SERIALIZATION annotation
		//  JsonAnyGetter -- basically this is used to Serialize a Map
		
		
	} 
	
}
