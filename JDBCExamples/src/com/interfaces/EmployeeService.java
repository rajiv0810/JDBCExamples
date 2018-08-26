package com.interfaces;

import java.util.List;

import com.jdbc.common.EmployeeDetails;

public interface EmployeeService {

	public List<EmployeeDetails> getAllEmployees();
	
	public EmployeeDetails getEmployeeDetails(int Id);
	
	public List<EmployeeDetails> findByAddress(String empAddress);
		
	
}
