package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserEmailUpdate {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		//load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver Loaded...");
		//get DBConnection
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
		System.out.println("enter DB user and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		conn=DriverManager.getConnection(dbUrl,user,password);
		System.out.println("connection established.....");
		String query="update users_info set email=? where userid=? and password=?";    
			pstmt=conn.prepareStatement(query);
			
			System.out.println("enter userid..");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the new email..");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter password to update..");
			pstmt.setString(3, sc.nextLine());
			
			int count=pstmt.executeUpdate();
			
			if(count>0)
			{
				System.out.println("query ok,"+count+"rows effected");
			}else {
				System.out.println("something went wrong.....");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
