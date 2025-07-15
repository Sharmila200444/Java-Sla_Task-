package com.index;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableStatemnetStoreProcedure {
	static final String db_url="jdbc:mysql://localhost:3306/javadb";
	static final String user="root";
	static final String pass="admin";

	public static void main(String[] args) {
		try {
			Connection con1=DriverManager.getConnection(db_url,user,pass);
			CallableStatement stmt=con1.prepareCall("{call javadb.INSERT1(?,?,?,?,?)}");
			stmt.setInt(1, 300);
			stmt.setString(2, "Abi");
			stmt.setString(3, "J");
			stmt.setInt(4, 24);
			stmt.setString(5,"Tester");
			stmt.executeQuery();
			System.out.println("Record inserted Sccussfully");
			
			
			
			Statement stmt1=con1.createStatement();
			String str1="Select * from Employye";
			ResultSet rs=stmt1.executeQuery(str1);
			while(rs.next()) {
				System.out.println("Id: "+rs.getInt(1));
				System.out.println("FirstName: "+rs.getString(2));
				System.out.println("LastName: "+rs.getString(3));
				System.out.println("Age: "+rs.getInt(4));
				
				System.out.println("Designation: "+rs.getString(5));
			}
			}
		
		
		catch(SQLException e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
