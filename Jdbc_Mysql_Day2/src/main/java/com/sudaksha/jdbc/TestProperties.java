package com.sudaksha.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\Sudaksha-Trainer-Pc1\\workspace_j51new\\Jdbc_Mysql_Day2\\src\\main\\resources\\db.properties");
			FileInputStream fis = new FileInputStream(f);
			Properties p = new Properties();
			p.load(fis);
			
			Class.forName(p.getProperty("driver"));
			Connection con = DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"), p.getProperty("pass"));
			if(con!=null)
			{
				System.out.println("Connection is established...");
			}else{
				System.out.println("Connection failed....");
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
