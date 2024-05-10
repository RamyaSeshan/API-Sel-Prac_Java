package JackSonAnnotations;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class JsonAnyGetter_POJO 
{
/* private String FirstName;
 private String LastName;
 private String email;
 private List<String>  Skills; */
 
 Map<String , Object > employee ;

 @JsonAnyGetter
public Map<String, Object> getEmployee() {
	return employee;
}

public void setEmployee(Map<String, Object> employee) {
	this.employee = employee;
}
 
}
