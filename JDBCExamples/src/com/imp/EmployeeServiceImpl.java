package com.imp;

import java.util.List;

import com.dao.EmployeeDAO;
import com.daoImpl.EmployeeDAOImpl;
import com.interfaces.EmployeeService;
import com.jdbc.common.EmployeeDetails;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<EmployeeDetails> getAllEmployees() {
		EmployeeDAO empDAO = new EmployeeDAOImpl();
		return empDAO.getAllEmployees();
		
	}

	@Override
	public EmployeeDetails getEmployeeDetails(int Id) {
		EmployeeDAO empDAO1 = new EmployeeDAOImpl();
		return empDAO1.getEmployeeDetails(Id);
	}

	@Override
	public List<EmployeeDetails> findByAddress(String empAddress) {
		EmployeeDAO empDAO2 = new EmployeeDAOImpl();
		return empDAO2.findByAddress(empAddress);
	}

}
