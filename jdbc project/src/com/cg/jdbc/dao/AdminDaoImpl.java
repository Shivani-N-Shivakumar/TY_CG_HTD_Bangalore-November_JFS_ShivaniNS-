package com.cg.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.cg.jdbc.bean.AdminBean;

public class AdminDaoImpl implements AdminDao {
	FileReader reader;
	Properties prop;
	AdminBean bean;

	public AdminDaoImpl() {
		try {

			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	@Override
	public boolean adminLogin(String username, String password) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("adminLogin"))) {
			pstmt.setString(1,username );
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				bean=new AdminBean();
				
				bean.setUsername(rs.getString(1));
				bean.setPassword(rs.getString(2));
				
			}
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			return false;	
}
}
