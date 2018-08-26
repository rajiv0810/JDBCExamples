package com.jdbc.common;

import java.util.List;

import com.imp.EmployeeServiceImpl;
import com.interfaces.EmployeeService;

public class JDBCMain {

	public static void main(String[] args) {
	
		EmployeeService empService= new EmployeeServiceImpl();
		List<EmployeeDetails> empDetails= empService.getAllEmployees();
		
		for (EmployeeDetails employeeDetails : empDetails) {
			System.out.println("print Employee Details :"+ employeeDetails);
		}
		
	}

}
