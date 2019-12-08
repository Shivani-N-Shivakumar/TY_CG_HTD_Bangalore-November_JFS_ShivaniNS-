package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUser {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			// load the Driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded....");
			
			//get the DBConnection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter DB user and password");
			String user=sc.nextLine();
			String password=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("connection established.....");
			
			//issue SQL query
			String query="INSERT into users_info(userid,userName,email,password,address)VALUES(?,?,?,?,?)";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter userid.....");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter USERNAME.....");
			pstmt.setString(2, sc.nextLine());
			System.out.println("enter EMAIL.....");
			pstmt.setString(3, sc.nextLine());
			System.out.println("enter PASSWORD.....");
			pstmt.setString(4, sc.nextLine());
			System.out.println("enter Address");
			pstmt.setString(5,sc.nextLine());
			
			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("user Inserted......");
			}else {
				System.err.println("something went worng");
			}
			
		} catch (SQLException e) {
			
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
		}
		
		
		
		

	}

	


			
	}

}
