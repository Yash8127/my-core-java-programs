package com.expectionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlAndClassNotFound {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String s = "com.mysql.cj.jdbc.Driver";
		// 1.loading the Driver class
		Class.forName(s);
		System.out.println("Driver class loaded Successfully");
		String url = "jdbc:mysql://localhost:3306/yaswanth";
		String user = "root";
		String password = "root";
		// 2.Establish the connection
		Connection con = DriverManager.getConnection(url, user, password);
		// 3.creating the statement to communicate the database
		Statement st = con.createStatement();
		// 4.create a ResultSet to read the data
		String query = "select * from emp";
		ResultSet rs = st.executeQuery(query);
		ResultSetMetaData meta = rs.getMetaData();
		int count = meta.getColumnCount();
		for (int i = 1; i <= count; i++) {
			System.out.printf("%-12s", meta.getColumnName(i));
		}
		System.out.println();
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");

		while (rs.next()) {
			for (int i = 1; i <= count; i++) {
				System.out.printf("%-12s", rs.getString(i));
			}
			System.out.println();
		}
	}

}
