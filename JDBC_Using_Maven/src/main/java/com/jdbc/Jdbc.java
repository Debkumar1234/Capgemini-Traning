package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbc";
//		"jdbc" -> api
//		"mysql" -> vender
//		"localhost" -> server link
//		"3306" -> port
//		"jdbc" -> database name
		String username = "root";
		String password = "root";
		
//		Step 1 : Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Step 2 : Establish connection between java and database
		Connection conn = DriverManager.getConnection(url, username, password);
		
//		Step 3 : create statement
		Statement st = conn.createStatement();
		
//		Step 4 : Execute query
		ResultSet rs = st.executeQuery("select * from Student");
		
//		Step 5 : Process the result
		while(rs.next()) {
			System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3));
		}
	}

}
