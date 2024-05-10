package JackSonAnnotations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyOrder_Serialize 
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
		
		/*
		 * IN general , when we Serialize  , created JOSN keys will be in the order of the priivate properties in JSON class
		 * but if we use JSONPRPOPRTYORDER attribute with attribue alphabetic  =true , then in created JSON Keys will be alphabatical order
		 * if we specify @JsonPropertyOrder("First Name","LastName","email") , then in craeted JSON keys will be in this order
		 * if in case we have annotation @JSONGetter for a specific getter with JSONPRPOPRTYORDER , 
		 * @JSONGetter takes precedence over private propertie when implemented alongwith JSONPRPOPRTYORDER annotation
		 */
		
	} 
	
}
