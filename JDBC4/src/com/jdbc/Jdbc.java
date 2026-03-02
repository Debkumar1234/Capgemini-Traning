package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Jdbc {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "root";
		Scanner sc = new Scanner(System.in);

		try {
//			System.out.println("Enter Id");
//			int id = sc.nextInt();
			// Step 1 : Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2 : Establish the connection between Java and Database
			Connection conn = DriverManager.getConnection(url, username, password);

//			PreparedStatement ps = conn.prepareStatement("SELECT * FROM STUDENT WHERE ID = ?");
//			ps.setInt(1, id);
//
//			ResultSet rs = ps.executeQuery();
//			if (!rs.next()) {
//				System.out.println("No data found using the id");
//			} else {
//				System.out.println(rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));
//				while (rs.next()) {
//					System.out.println(rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));
//				}
//			}
			
			/* Insert data */
			
//			System.out.print("Enter id : ");
//			int id = sc.nextInt();
//			sc.nextLine();
//			System.out.print("Enter name : ");
//			String name = sc.nextLine();
//			System.out.print("Enter mobile_no : ");
//			String mobile_no = sc.nextLine();
//			System.out.print("Enter roll_no : ");
//			String roll_no = sc.nextLine();
//
//			PreparedStatement ps1 = conn.prepareStatement(
//					"INSERT INTO STUDENT (ID, NAME, MOBILE_NO, ROLL_NO) VALUES (?, ?, ?, ?)");
//			ps1.setInt(1, id);
//			ps1.setString(2, name);
//			ps1.setString(3, mobile_no);
//			ps1.setString(4, roll_no);
//			
//			int count = ps1.executeUpdate();
//			if(count>0) {
//				System.out.println("Inserted one row");
//			}else {
//				System.out.println("Error occured");
//			}
			
			
			/* Update exist row */
			int id = 24;
			PreparedStatement ps2 = conn.prepareStatement("UPDATE STUDENT SET ROLL_NO = 'CSE023' WHERE ID = ?");
			ps2.setInt(1, id);
			int count = ps2.executeUpdate();
			if(count>0) {
				System.out.println("Updated one row");
			}else {
				System.out.println("Error occured");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
