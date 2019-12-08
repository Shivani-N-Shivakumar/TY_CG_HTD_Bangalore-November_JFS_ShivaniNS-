package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

public class UserLogin {
	
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		try {
			// load the Driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded...");
			
			//Get DBConnection via Driver
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6"+"";
			System.out.println("enter username and password");
			String dbUser=sc.nextLine();
			String dbpass=sc.nextLine();
			
		conn=DriverManager.getConnection(dbUrl,"root","root");
		System.out.println("connection established");
		

		//Issue SQL query via connection
		String query="SELECT * FROM users_info  WHERE userid=? AND password=? ";
		pstmt=conn.prepareStatement(query);
		System.out.println("enter userid......");
		pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
		System.out.println("enter password......");
		pstmt.setString(2, sc.nextLine());
		rs=pstmt.executeQuery();
		System.out.println("Query Issued and executed");  
		
		//Process the Result returned
		if(rs.next()) {
		System.out.println("userid: "+rs.getInt(1));
					
	System.out.println( "userName: "+rs.getString(2));
					
	System.out.println("email: "+rs.getString(3));
					
		}else {
			System.err.println("something went worng");
		
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
					if(pstmt!=null) {
						pstmt.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if(rs!=null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		

	}

	}
}
