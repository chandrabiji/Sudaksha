package com.sudaksha.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TestDatabaseConnection {
	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j51", "root", "root");
			if(con!=null)
			{
				System.out.println("Connection is established successfully");
			}else{
				System.out.println("Connection failed.Please try again....");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
