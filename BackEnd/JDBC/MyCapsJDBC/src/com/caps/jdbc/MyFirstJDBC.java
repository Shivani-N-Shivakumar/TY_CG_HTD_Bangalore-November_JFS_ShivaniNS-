package com.caps.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class MyFirstJDBC {

	public static void main(String[] args)  {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			//Load the Driver
			//Driver driver=new com.mysql.jdbc.Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");
			
			//Get DBConnection via Driver
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6"+"?user=root&password=root";
		conn=DriverManager.getConnection(dbUrl);
		System.out.println("connection established");
		
		//Issue SQL query via connection
		String query="SELECT * FROM users_info";
		stmt=conn.createStatement();
		rs=stmt.executeQuery(query);
		System.out.println("Query Issued");  
		System.out.println("*****************************");
		
		//Process the Result returned
		while(rs.next()) {
			System.out.println("userid: "+rs.getInt("userid"));
			
			System.out.println( "userName: "+rs.getString("username"));
			
			System.out.println("email: "+rs.getString("email"));
			
			System.out.println("*****************************");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				try {
					if(stmt!=null) {
						stmt.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					if(rs!=null) {
						rs.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}

}
