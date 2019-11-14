package com.sudaksha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Demo {
	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			//step3:Prepare the statement
			PreparedStatement ps = con.prepareStatement("insert into demo(dname,dob) values(?,?)");
			ps.setString(1, "pqr");
			ps.setDate(2, new java.sql.Date(2012-1900,8,13));
			//in case define timestamp in database
			//ps.setTimestamp(2, new java.sql.Timestamp(new java.util.Date().getTime()));
			//step4:execute the query
			int n = ps.executeUpdate();
			if(n!=0)
			{
				System.out.println("One Record Inserted Successfully");
				
			}else{
				System.out.println("Record Not Inserted.Please try again");
			}
			//step5:close the statement and connection
			ps.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
