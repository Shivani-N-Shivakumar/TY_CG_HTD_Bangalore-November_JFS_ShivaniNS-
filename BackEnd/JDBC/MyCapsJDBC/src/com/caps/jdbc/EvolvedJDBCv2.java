package com.caps.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Statement;



public class EvolvedJDBCv2 {

	public static void main(String[] args) {
		FileReader reader=null;
		Properties prop=null;
		try {
			 reader=new FileReader("C:\\Users\\DELL\\Desktop\\New Text Document.txt\");
			 prop=new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("driver loaded...");
			
		
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
		
		while(rs.next()) {
			System.out.println("userid: "+rs.getInt(1));
			System.out.println("username: "+rs.getString ("username"));
			System.out.println("email: "+rs.getString(3));
			System.out.println("****************************");
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}
		}
}

