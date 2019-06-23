package pojo;

import java.io.Serializable;

// @Entity Class / Persistence Layer / 
public class Employee implements Serializable {

	private String employeeID;
	private String employeePassword;
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
		
}
