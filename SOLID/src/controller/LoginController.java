package controller;

import java.util.Scanner;

import pojo.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

// @Controller
public class LoginController {

	private EmployeeService employeeServiceRef;
	private Employee employeeRef;
	
	public void employeeLoginValidate() {
		employeeServiceRef = new EmployeeServiceImpl();
		employeeRef = new Employee();
		userInput();
	}
	
	private void userInput() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next();
		employeeRef.setEmployeeID(name);
		
		System.out.println("Enter your password : ");
		String password = sc.next();
		employeeRef.setEmployeePassword(password);
		
		employeeServiceRef.checkEmployee(employeeRef);
	}
	
}
