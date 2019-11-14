package com.sudaksha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatableResultSetDemo {

	public static void main(String[] args) {
		try {
			// step1:Load the driver(Note JDBC 4.0 version optional)
			Class.forName("com.mysql.jdbc.Driver");
			// step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j51", "root", "root");
			// step3:create the statement
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			// step4:execute the query
			ResultSet rs = st.executeQuery("select * from student");
			System.out.println("--last record---");
			rs.last();
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
			rs.first();
			System.out.println("--first record----");
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
			rs.absolute(4);
			rs.updateString(2, "sai");
			rs.updateRow();
			rs.first();
			System.out.println("--after updated record---");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
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
