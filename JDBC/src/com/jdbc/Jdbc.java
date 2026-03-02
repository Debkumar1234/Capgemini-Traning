package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "root";
		try {
			// Step - 1: Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 2: Establish the connection between Java and Database
			conn = DriverManager.getConnection(url, userName, password);
			
			// Step 3: Create the statement
			st = conn.createStatement();
			
			//Step 4: Execute query
			rs = st.executeQuery("SELECT * FROM STUDENT");
			
			// Step 5: Process the result
			while(rs.next()) {
				System.out.println(
						rs.getInt(1)+","
						+rs.getString(2)+","
						+rs.getString(3)
						);
			}
			st.executeUpdate(
					"INSERT INTO student (id, name, mobile_no, roll_no) VALUES\r\n"
					+ "(22, 'Karan Mehta', '9876512345', 'CSE111')\r\n"
					);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
