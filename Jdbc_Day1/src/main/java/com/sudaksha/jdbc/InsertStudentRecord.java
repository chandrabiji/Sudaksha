package com.sudaksha.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertStudentRecord {
	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//step3:Prepare the statement
			Statement st = con.createStatement();
			//step4:execute the query
			int n = st.executeUpdate("INSERT INTO STUDENT VALUES(100,'ABC',87)");
			if(n!=0)
			{
				System.out.println("Successfully One Record Inserted...");
			}else{
				System.out.println("Record Not able to Inserted.Please try again...");
			}
			//step5:Close the statement and connection
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
