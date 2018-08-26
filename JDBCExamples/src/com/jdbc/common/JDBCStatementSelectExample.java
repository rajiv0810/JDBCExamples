package com.jdbc.common;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBCStatementSelectExample {

	private static final String DB_DRIVER = "mysql.jdbc.driver.mysqlDriver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/ddaz";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "data";

	public static void main(String[] argv) {

		try {

			selectRecordsFromDbUserTable();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}
	

	private static void selectRecordsFromDbUserTable() throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		String selectTableSQL = "SELECT * from EMPLOYEES";

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			System.out.println(selectTableSQL);

			// execute select SQL stetement
			ResultSet rs = statement.executeQuery(selectTableSQL);
			
			List<EmployeeDetails> empList = new ArrayList<EmployeeDetails>();
			

			while (rs.next()) {
				
				
				EmployeeDetails empDetails = new EmployeeDetails();
				
				
				empDetails.setEmpId(rs.getInt("empID"));
				empDetails.setEmpName(rs.getString("empName"));
				empDetails.setEmpAddress(rs.getString("Address"));
				
				empList.add(empDetails);
				
			
				
				

//				int empID = rs.getInt("empID");
//				String empName = rs.getString("empName");
//				String address = rs.getString("Address");

//				System.out.println("empID : " + empID);
//				System.out.println("empName : " + empName);
//				System.out.println("address : " + address);

			}
			
			System.out.println("print emp details :"+ empList);

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}

}
