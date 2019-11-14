package com.sudaksha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateaTable {

	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j51", "root", "root");
			//step3:Prepare the statement
			Statement st = con.createStatement();
			//step4:execute the query
			st.execute("CREATE TABLE STUDENT(SNO INT(4),SNAME VARCHAR(35),MARKS INT(3))");
			System.out.println("--Table Created Successfully ----");
			//step5:Close the statement and connection
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
