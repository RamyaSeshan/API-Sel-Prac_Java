package restful_booker_API_POJO_CC;

public class CreateToken_Input_Pojo extends BaseClass {

	private String username;
	private String password;
	
	public CreateToken_Input_Pojo(String username ,  String password)
	{
		this.password =password;
		this.username = username;
	}
	public String getpassword(){
		return password;
	}
	
	public String getusername()
	{
		return username;
	}
}
