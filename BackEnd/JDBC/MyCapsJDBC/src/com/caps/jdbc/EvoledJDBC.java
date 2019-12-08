package com.caps.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


import java.sql.Statement;

public class EvoledJDBC {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
		System.out.println("Enter DB user and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		String query="select * from users_info";
		try(Connection conn=DriverManager.getConnection(dbUrl,user,password);
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(query)){
			while(rs.next()) {
				System.out.println("userid: "+rs.getInt(1));
				System.out.println("username: "+rs.getString ("username"));
				System.out.println("email: "+rs.getString(3));
				System.out.println("****************************");
			}
			sc.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
