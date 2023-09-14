package restful_booker_API_POJO_lombak;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateToken_Input_Pojo extends BaseClass {

	private String username;
	private String password;
	

	
}
