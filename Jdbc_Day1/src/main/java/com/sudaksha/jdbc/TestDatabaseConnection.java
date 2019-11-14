package com.sudaksha.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TestDatabaseConnection {
	public static void main(String[] args) {
		try {
			// step1:Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", "hr");
			if (con != null) {
				System.out.println("Connection established Successfully...");
			} else {
				System.out.println("Connection failed..Please try again....");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
