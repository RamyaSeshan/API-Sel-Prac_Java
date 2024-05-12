package JackSonAnnotations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGetter_Serialize 
{
	
	public static void main(String[] args) throws JsonProcessingException 
	{
		
		JsonAGetter_POJO jsonAGetter_POJO = new JsonAGetter_POJO();
		jsonAGetter_POJO.setFirstName("First Name ");
		jsonAGetter_POJO.setLastName("Last Name --- ");
		jsonAGetter_POJO.setEmail("ramyas@yahoo.com");
		
		
		// serialization of POJO with ObjecMapper
		ObjectMapper obj = new ObjectMapper();
		String writeValueAsString = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonAGetter_POJO) ;
		System.out.println(writeValueAsString);
		
		// if you run this , in the output we will get key as defined as private fileds in JsonAGetter_POJO class
		// if in case you want that to be flexible , meaning filed to be diffrent than the JSON key name 
		// then in that getter method , we can use ANNOTATION JSONGETER with value as required String 
		/*eg : @JsonGetter(value = "Employee Name ")
		public String getFirstName() {
			return FirstName;
		} */
		
		
	} 
	
}
