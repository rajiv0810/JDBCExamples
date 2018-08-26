package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.jdbc.common.EmployeeDetails;

public abstract class EmployeeDAO {
	
    public static String Allemp="Select * from employees";
    
	public abstract List<EmployeeDetails> getAllEmployees();

	public abstract EmployeeDetails getEmployeeDetails(int Id);

	public abstract List<EmployeeDetails> findByAddress(String empAddress);

	public Connection getConnection() {

		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return null;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ddaz", "root", "data");

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return null;
		}

		return connection;
	}

}
