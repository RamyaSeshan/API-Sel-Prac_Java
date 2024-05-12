package JackSonAnnotations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValue_Serialize 
{

	public static void main(String[] args) throws JsonProcessingException 
	{

		JsonValue_POJO  jsonValue_POJO = new JsonValue_POJO();


		jsonValue_POJO.setFirstName("First Name ..." );
		jsonValue_POJO.setLastName("Last Name ... ");
		jsonValue_POJO.setEmail("ramyaseshan01@gmail.com ");


		// serialization of POJO with ObjecMapper
		ObjectMapper obj = new ObjectMapper();
		String writeValueAsString = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonValue_POJO) ;
		System.out.println(writeValueAsString);

		/*
		 * usually when we serialize using object mapper , it will have default toString method 
		 * now if we want to expresess customized way of PRINTING THE SERIALIZED POJO ,then we need to use 
		 * @JsonValue annotation on top of the required method , like below 
		 * @JsonValue
	public String useThis()
	{
		return " this is from customized function ";
	}


		 */


	} 

}
