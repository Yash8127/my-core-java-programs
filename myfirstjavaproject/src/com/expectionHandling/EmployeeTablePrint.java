package com.expectionHandling;

import java.sql.*;

public class EmployeeTablePrint {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/yaswanth",
                    "root",
                    "root"
            );

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM emp");

            // ✅ MetaData
            ResultSetMetaData meta = rs.getMetaData();//Retrieves the number, types and properties of this ResultSet object's columns.
            int colCount = meta.getColumnCount();

            // ✅ Print Column Names in Format
            for (int i = 1; i <= colCount; i++) {
                System.out.printf("%-12s", meta.getColumnName(i));
            }

            System.out.println();
            System.out.println("==========================================================================");

            // ✅ Print Rows in Proper Table Format
            while (rs.next()) {

                for (int i = 1; i <= colCount; i++) {

                    // Print each column value aligned
                    System.out.printf("%-12s", rs.getString(i));
                }

                System.out.println();
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
