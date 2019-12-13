package com.capgemini.phonesimulator.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.phonesimulator.bean.ContactBean;

public class ContactDAOImpl implements ContactDAO {
	FileReader reader;
	Properties prop;
	ContactBean bean;
	
	
	public ContactDAOImpl() {
		try {
			
			reader=new FileReader("db6.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}


	@Override
	public List<ContactBean> getAllContact() {
		List<ContactBean> list=new ArrayList<ContactBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query"))){
			while(rs.next()) {
				bean=new ContactBean();
				bean.setName(rs.getString(1));
				bean.setNumber(rs.getInt(2));
				bean.setGroupName(rs.getString(3));
				list.add(bean);
			}
			return list;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean searchContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("searchquery"))){
		pstmt.setString(1,bean.getName());
		int count=pstmt.executeUpdate();
		if(count>0) {
			return true;
		}
}catch (Exception e) {
	e.printStackTrace();
}
		return false;
	}

	@Override
	public boolean addContact(ContactBean bean) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
		PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insertquery"))){
			pstmt.setString(1,bean.getName());
			pstmt.setInt(2,bean.getNumber());
			pstmt.setString(3,bean.getGroupName());
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
	}catch (Exception e) {
		e.printStackTrace();
	}
		return false;
	}

	@Override
	public boolean deleteContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deletequery"))){
		pstmt.setString(1,bean.getName());
		int count=pstmt.executeUpdate();
		if(count>0) {
			return true;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateContact(String name, int number, String groupName) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("updatequery"))){
			pstmt.setString(1, bean.getName());
			pstmt.setInt(2, bean.getNumber());
			pstmt.setString(3, bean.getGroupName());
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
