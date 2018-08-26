package com.jdbcconnecter;

import java.sql.Connection;
import java.sql.DriverManager;

import oracle.jdbc.pool.OracleDataSource;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl ="jdbc:oracle:thin:@localhost:1521:orcl";
//		Connection conn = DriverManager.getConnection
//				  ("jdbc:oracle:thin:@myhost:1521:orcl", "scott", "tiger");
		
		String user ="system";
		String pwd  ="data";
		
//		OracleDataSource ods = new OracleDataSource();
//		ods.setURL(jdbcUrl);
//		ods.setUser("system");
//		ods.setPassword("data");
//		Connection conn = ods.getConnection();

		try{
			System.out.println("Conneting to database: "+ jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pwd);
			System.out.println("Connection Successfull..");
		}
		catch (Exception exc){
			exc.printStackTrace();
		}
	}

}
