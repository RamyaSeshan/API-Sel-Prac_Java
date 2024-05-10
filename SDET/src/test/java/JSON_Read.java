import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON_Read {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonParse = new JSONParser();

		FileReader reader = new FileReader("jsonCreate.json") ;
		Object parsedObj = jsonParse.parse(reader);
		JSONObject jsonObj= (JSONObject)parsedObj ;


		System.out.println("Name is   " + jsonObj.get("Name") );
		System.out.println("Age is   " + 	jsonObj.get("Age")  );

		JSONArray jsonArr = (JSONArray) jsonObj.get("Subjects") ;
		
		Iterator iterator = jsonArr.iterator() ;
		
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
