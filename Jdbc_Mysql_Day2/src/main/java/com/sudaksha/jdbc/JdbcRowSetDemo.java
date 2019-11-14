package com.sudaksha.jdbc;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetDemo {

	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//step2:creating and executing RowSet
			JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
			//step3:set the url
			rowSet.setUrl("jdbc:mysql://localhost:3306/j51");
			//step4:set the username
			rowSet.setUsername("root");
			//step5:set the password
			rowSet.setPassword("root");
			//step6:execute the sql command
			rowSet.setCommand("select * from student");
			//step7:execute the command
			rowSet.execute();
			//step8:get the records
			while(rowSet.next())
			{
				System.out.println(rowSet.getString(1)+"\t"+rowSet.getString(2)+"\t"+rowSet.getString(3));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
