package com.expectionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDataBase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		System.out.println("main method started");
		Connection con = null;
		// step:1 Loading the Driver
		try {
			String s = "com.mysql.cj.jdbc.Driver";
			Class.forName(s);// Unhandled exception type ClassNotFoundException
			System.out.println("Connecting to Data Base........");
			Thread.sleep(2000);
		} catch (ClassNotFoundException e) {
			System.out.println("! Something Wrong Driver class not loaded");
		}
		// step 2: connection creations or Enchancing the connection to sql
		try {
			String url = "jdbc:mysql://localhost:3306/yaswanth";
			String user = "root";
			String password = "root";
			con = DriverManager.getConnection(url, user, password);// Unhandled exception type SQLException
			System.out.println("✅ Connected Successfully!");
			Statement st = con.createStatement();
			String query = "select * from emp";
			ResultSet rs = st.executeQuery(query);
			System.out.println("Fetch the Data Base......");
			Thread.sleep(1000);
			System.out.println("EMPNO  ENAME   JOB   MGR   HIREDATE  SAL  COMM  DEPTNO");
			System.out.println("------------------------------------------------------------");
			while (rs.next()) {

				System.out.print(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4)
						+ "  " + rs.getDate(5) + "  " + "  " + rs.getInt(6) + "  " + rs.getInt(7) + "  "
						+ rs.getInt(8));
				System.out.println();
				System.out.println("*********************************************************");
				Thread.sleep(1000);
			}
		} catch (SQLException s) {
			s.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
		System.out.println("Main method ended!");

	}
}
