package JackSonAnnotations_CustSerilization;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder ( { "FirstName" , "LastName" ,"email" ,"Skills" , "devices" } )

public class JSONSerialize_Josn 
{
	private String firstName;
	private String lastName;
	private String email;
	private List<String> skills;

	private DevicesJson devices;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public DevicesJson getDevices() {
		return devices;
	}

	public void setDevices(DevicesJson devices) {
		this.devices = devices;
	}
	
	
	


}
