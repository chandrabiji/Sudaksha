package com.sudaksha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagement {

	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j51", "root", "root");
			con.setAutoCommit(false);
			//step3:Prepare the statement
			Statement st = con.createStatement();
			//step4:execute the query
			int n = st.executeUpdate("insert into student values(700,'ppp',66)");
			con.rollback();
			st.executeUpdate("update student set sname='mani' where sno=600");
			if(n!=0)
			{
				System.out.println("One Record Inserted Successfully");
			}else{
				System.out.println("Not able to inserted.Please try again...");
			}
			//step5:close the statement and connection
			con.commit();
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
