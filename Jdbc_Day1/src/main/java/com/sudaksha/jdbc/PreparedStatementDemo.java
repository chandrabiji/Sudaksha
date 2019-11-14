package com.sudaksha.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PreparedStatementDemo {
	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//step3:Prepare the statement
		//	PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
			//Update query example
			//===================
			/*PreparedStatement ps = con.prepareStatement("update student set sname=? where sno=?");
			ps.setString(1,"pqr");
			ps.setInt(2,200);*/
			//Delete query example
			//====================
			PreparedStatement ps = con.prepareStatement("delete from student where sno=?");
			ps.setInt(1,200);
		/*	ps.setInt(1, 200);
			ps.setString(2, "Heman");
			ps.setInt(3, 75);*/
			//step4:execute the query
			int n = ps.executeUpdate();
			if(n!=0)
			{
				System.out.println("One Record Successfully Deleted");
			}else{
				System.out.println("Record Not able to Delete.Please try again");
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
