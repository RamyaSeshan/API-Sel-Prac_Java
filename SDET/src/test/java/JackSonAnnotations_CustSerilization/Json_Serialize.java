package JackSonAnnotations_CustSerilization;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json_Serialize {

	public static void main(String[] args) throws JsonProcessingException {
		
		
		
		JSONSerialize_Josn  jSONSerialize_Josn  = new JSONSerialize_Josn ();
        
		jSONSerialize_Josn.setFirstName("RAMYA");
		jSONSerialize_Josn.setLastName("SESHAN");
		jSONSerialize_Josn.setEmail("RAMYASESHAN01@GMAIL.COM");
		jSONSerialize_Josn.setSkills(Arrays.asList("JAVA" ,"PYTHON" ,"C#" ,"JAVASCRIPT"));
		DevicesJson devicesJson = new DevicesJson();
		devicesJson.setLaptop("LENOVA");
		devicesJson.setMobile("SAMSUMG");
		
		jSONSerialize_Josn.setDevices(devicesJson);
		
		
		ObjectMapper obj = new ObjectMapper();
		String writeValueAsString = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jSONSerialize_Josn) ;
		System.out.println( writeValueAsString );
				

	}

}
