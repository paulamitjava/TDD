package dao;
import pojo.Employee;

// @Repository
public class LoginDAOImpl implements LoginDAO {

	boolean status = false;
	
	@Override
	public boolean checkEmployee(Employee employee) {
		
		if(employee.getEmployeeID().equals("admin") && employee.getEmployeePassword().equals("admin123")) {
			//System.out.println("if checkEmployee");
			status = true;
		}
		
		else
		{
			//System.out.println("else checkEmployee");
			status = false;
		}
		
		return status;

	} // end of checkEmployee

}
