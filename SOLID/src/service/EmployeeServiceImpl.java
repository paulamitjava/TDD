package service;

import dao.LoginDAO;
import dao.LoginDAOImpl;
import pojo.Employee;

// @Service
public class EmployeeServiceImpl implements EmployeeService {

	LoginDAO refLoginDAO;
	
	@Override
	public void checkEmployee(Employee employee) {
		
		refLoginDAO = new LoginDAOImpl();
		
		if(refLoginDAO.checkEmployee(employee)==true) {
			System.out.println("Login Success");
		}
		else {
			System.out.println("Login Failed..");
		}
		
	}
	
}
