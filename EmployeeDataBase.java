package com.Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDataBase {
	
	static final String Db_url="jdbc:mysql://localhost:3306/javaDB";
	static final String USER="root";
	static final String Pass="admin";
	
	
	static Connection conn=null;

	public static void main(String[] args) {
		try {
			conn=DriverManager.getConnection(Db_url,USER,Pass);
			Statement stmt=conn.createStatement();
			
			
//			Fetch First 3 Records
			
			
			String st1="Select * from Employye limit 3";
			ResultSet rs=stmt.executeQuery(st1);
			while(rs.next()) {
				System.out.println("Id: "+rs.getInt(1));
				System.out.println("FirstName: "+rs.getString(2));
				System.out.println("LastName: "+rs.getString(3));
				System.out.println("Age: "+rs.getInt(4));
				System.out.println("Desgination: "+rs.getString(5));
			}
			System.out.println();
			
			
			
//		FirstName Start with S
			
			System.out.println("---------------FirstName starts with S--------------");
			System.out.println();
			
			String st2="Select * from Employye where FirstName LIKE 'S%'";
			ResultSet rs1=stmt.executeQuery(st2);
			while(rs1.next()) {
				System.out.println("Id: "+rs1.getInt(1));
				System.out.println("FirstName: "+rs1.getString(2));
				System.out.println("LastName: "+rs1.getString(3));
				System.out.println("Age: "+rs1.getInt(4));
				System.out.println("Desgination: "+rs1.getString(5));
			}
			System.out.println();
			
			
//			Last Name Ends with A
			System.out.println("---------------LastName ends with A-------------");
			System.out.println();
			
			String st3="Select * from Employye where LastName LIKE '%A'";
			ResultSet rs2=stmt.executeQuery(st3);
			while(rs2.next()) {
				System.out.println("Id: "+rs2.getInt(1));
				System.out.println("FirstName: "+rs2.getString(2));
				System.out.println("LastName: "+rs2.getString(3));
				System.out.println("Age: "+rs2.getInt(4));
				System.out.println("Desgination: "+rs2.getString(5));
			}
		
		
		
//		Designation must be in Manager
		System.out.println();
	    System.out.println("------Manager Dept Records--------");
		System.out.println();
		String st4="Select * from Employye where Dept='Manager'";
		ResultSet rs3=stmt.executeQuery(st4);
		while(rs3.next()) {
			System.out.println("Id: "+rs3.getInt(1));
			System.out.println("FirstName: "+rs3.getString(2));
			System.out.println("LastName: "+rs3.getString(3));
			System.out.println("Age: "+rs3.getInt(4));
			System.out.println("Desgination: "+rs3.getString(5));
		}

		
//		Duplicate Records
		System.out.println();
	    System.out.println("----------Duplicate Records------------");
		System.out.println();
		String st5="Select * from Employye where FirstName IN(Select FirstName from Employye group by FirstName Having count(*)>1)";
		ResultSet rs4=stmt.executeQuery(st5);
		while(rs4.next()) {
			System.out.println("Id: "+rs4.getInt(1));
			System.out.println("FirstName: "+rs4.getString(2));
			System.out.println("LastName: "+rs4.getString(3));
			System.out.println("Age: "+rs4.getInt(4));
			System.out.println("Desgination: "+rs4.getString(5));
		}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
