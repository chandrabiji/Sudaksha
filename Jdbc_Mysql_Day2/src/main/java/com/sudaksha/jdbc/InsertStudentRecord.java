package com.sudaksha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentRecord {

	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j51", "root", "root");
			//step3:Prepare the statement
			Statement st = con.createStatement();
			//step4:execute the query
			int n = st.executeUpdate("insert into student values(500,'mno',99)");
			if(n!=0)
			{
				System.out.println("Record Inserted Successfully...");
			}else{
				System.out.println("Record Not Inserted.Please try again...");
			}
			//step5:close the statement and connection
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
