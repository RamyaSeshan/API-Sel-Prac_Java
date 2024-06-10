package restful_booker_API_POJO_Impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Employee_POJO {
	
   private String Org_Name;
   private int total_exp ;
   private String desigination ;
   private Employee_POJO previous_exp;
   
   
   
public String getOrg_Name() {
	return Org_Name;
}
public void setOrg_Name(String org_Name) {
	Org_Name = org_Name;
}
public int getTotal_exp() {
	return total_exp;
}
public void setTotal_exp(int total_exp) {
	this.total_exp = total_exp;
}
public String getDesigination() {
	return desigination;
}
public void setDesigination(String desigination) {
	this.desigination = desigination;
}
public Employee_POJO getPrevious_exp() {
	return previous_exp;
}
public void setPrevious_exp(Employee_POJO previous_exp) {
	this.previous_exp = previous_exp;
}
   
	

}
