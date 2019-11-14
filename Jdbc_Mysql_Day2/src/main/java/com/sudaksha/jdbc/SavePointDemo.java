package com.sudaksha.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
public class SavePointDemo {

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
			int n = st.executeUpdate("insert into student values(700,'mno',99)");
			Savepoint sp = con.setSavepoint("level1");
			if(n!=0)
			{
				System.out.println("One Record Inserted Successfully");
			}else{
				System.out.println("Record Not able to Inserted");
			}
			st.executeUpdate("delete from student where sno=500");
			con.rollback(sp);
			ResultSet rs = st.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			con.commit();
			//step5:close the statement and connection
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
