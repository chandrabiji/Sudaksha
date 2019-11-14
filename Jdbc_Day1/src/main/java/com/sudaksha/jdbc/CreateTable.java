package com.sudaksha.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateTable {
	public static void main(String[] args) {
		try {
			// step1:Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step2:establish the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			// step3:Prepare the statement
			Statement st = con.createStatement();
			// step4:execute the query
			st.execute("CREATE TABLE STUDENT(SNO NUMBER(3),SNAME VARCHAR2(35),MARKS NUMBER(3))");
			System.out.println("--Table Created---");
			// step5:Close the statement and connection
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
