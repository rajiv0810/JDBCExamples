package com.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.EmployeeDAO;
import com.jdbc.common.EmployeeDetails;

public class EmployeeDAOImpl extends EmployeeDAO {

	@Override
	public List<EmployeeDetails> getAllEmployees() {
		Connection conn = getConnection();
		
		Statement st= null;
		try {
			 st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			 rs = st.executeQuery(EmployeeDAO.Allemp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<EmployeeDetails> empList = new ArrayList<EmployeeDetails>();
		

		try {
			while (rs.next()) {
				
				
				EmployeeDetails empDetails = new EmployeeDetails();
				
				
				empDetails.setEmpId(rs.getInt("empID"));
				empDetails.setEmpName(rs.getString("empName"));
				empDetails.setEmpAddress(rs.getString("Address"));
				
				empList.add(empDetails);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}
	
	@Override
	public EmployeeDetails getEmployeeDetails(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDetails> findByAddress(String empAddress) {
		// TODO Auto-generated method stub
		return null;
	}

}
