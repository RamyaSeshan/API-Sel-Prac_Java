package restful_booker_API_POJO_Impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class EMP_POJO {
	
	private int id;
	private Employee_POJO employee;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee_POJO getEmployee() {
		return employee;
	}
	public void setEmployee(Employee_POJO employee) {
		this.employee = employee;
	}
	 
	 

}
