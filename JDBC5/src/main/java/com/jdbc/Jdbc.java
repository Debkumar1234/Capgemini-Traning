package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			// Step 3: Create the statement
			Statement st = conn.createStatement();

			// Step 4: Execute query
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENT");

			// Step 5: Process the result
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
