package com.sudaksha.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class BatchUpdateDemo {
	public static void main(String[] args) {
		try {
			// step1:Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//step3:Prepare the statement
			Statement st = con.createStatement();
			st.addBatch("insert into student values(100,'abc',95)");
			st.addBatch("update student set sname='Rahul' where sno=100");
			//step4:execute the query
			int[] n = st.executeBatch();
			System.out.println("No of Rows Effected = "+n.length);
			//step5:Close the statement and connection
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
