package SchemaValidation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class SchemaValidation 
{

	@Test // Schema validation done using Hamcrest  JSON schema validator
	public void validate() throws IOException
	{
		File input = new File ("src/test/resources/Payload.json") ;
		String readFileToString = FileUtils.readFileToString(input ,"UTF-8") ;
		File out = new File ("src/test/resources/ExpOut.json") ;
		
		MatcherAssert.assertThat(readFileToString, JsonSchemaValidator.matchesJsonSchema(out)) ;
		
	}
}
