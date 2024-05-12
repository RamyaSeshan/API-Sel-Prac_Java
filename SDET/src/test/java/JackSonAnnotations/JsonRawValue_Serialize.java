package JackSonAnnotations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRawValue_Serialize 
{
	
	public static void main(String[] args) throws JsonProcessingException 
	{
		
		JsonRawValue_POJO jsonRawValue_POJO = new JsonRawValue_POJO();
		//jsonAGetter_POJO.getFirstName() ;
		jsonRawValue_POJO.setLastName("Last Name --- ");
		jsonRawValue_POJO.setEmail("ramyas@yahoo.com");
		
		
		// serialization of POJO with ObjecMapper
		ObjectMapper obj = new ObjectMapper();
		String writeValueAsString = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonRawValue_POJO) ;
		System.out.println(writeValueAsString);
		
		/*
		 * If we run this , in the result Json , all Values will be in its data type , meaning if its privare filed is int then in value we will NOT have 
		 * double quotes , if it private field is String the we will have double quotes 
		 * JsonRawValue annotation , given at the private field level , will supress the datatype expression in result JSON 
		 * thats is meaning , say if it private field is String the we will NOT have double quotes 
		 * below is the output POJO 
		 * {
  "email" : "ramyas@yahoo.com",
  "FirstName" :  from POJO as Raw value ,
  "lastName" : "Last Name --- "
}

		 */
		
		
	} 
	
}
