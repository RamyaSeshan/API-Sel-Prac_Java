import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JOSN_Write {

	public static void main(String[] args) throws IOException {
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		
		jsonObject.put("Name", "Ramya123") ;
		jsonObject.put("Age", 22) ;
		
		jsonArr.add("Mathemaics") ;
		jsonArr.add("Science") ;
		jsonArr.add("Language") ;
		
		jsonObject.put("Subjects", jsonArr) ;
		
		
		FileWriter file = new FileWriter("jsonCreate.json");
		file.write(jsonObject.toJSONString());
		file.close();
	}

}
