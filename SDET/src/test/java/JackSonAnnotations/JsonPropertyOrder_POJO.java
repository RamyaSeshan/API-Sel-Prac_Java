package JackSonAnnotations;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder( { "FirstName","LastName","email" })
//speifying this annotation will have Keys in order "FirstName","LastName","email" in created JSON
//@JsonPropertyOrder( alphabetic = true)

public class JsonPropertyOrder_POJO
{

	private String LastName;
	private String email;
	private String FirstName;
	
	
	@JsonGetter(value = "Employee Name ")
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}





}
