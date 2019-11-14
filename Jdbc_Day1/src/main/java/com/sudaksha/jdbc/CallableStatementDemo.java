package com.sudaksha.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
public class CallableStatementDemo {
	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//step3:Prepare the statement
			CallableStatement cs = con.prepareCall("{call proc1(?,?)}");
			cs.setInt(1, 25);
			cs.registerOutParameter(2, Types.INTEGER);
			//step4:execute the query
			cs.execute();
			int result = cs.getInt(2);
			System.out.println("Sqr : "+result);
			//step5:close the statement and connection
			cs.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
