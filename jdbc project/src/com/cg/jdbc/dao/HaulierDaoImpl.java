package com.cg.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cg.jdbc.bean.ContractBean;
import com.cg.jdbc.bean.HaulierBean;

public class HaulierDaoImpl implements HaulierDao {
	FileReader reader;
	Properties prop;
	HaulierBean bean;

	public HaulierDaoImpl() {
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
	public boolean addHaulier(HaulierBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("inserthaulierquery"))) {
			pstmt.setInt(1, bean.getHaulid());
			pstmt.setLong(2, bean.getHtelno());
			pstmt.setString(3, bean.getHname());
			pstmt.setString(4, bean.getHstad1());
			pstmt.setString(5, bean.getHstad2());
			pstmt.setString(6, bean.getHtown());
			pstmt.setString(7, bean.getHpostcode());
			
			pstmt.setString(8, bean.getHemail());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteHaulier(int haulid) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deletehaulierquery"))) {
			pstmt.setInt(1, haulid);

			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public List<HaulierBean> getAllHaulier(HaulierBean bean) {
		List<HaulierBean> list = new ArrayList<HaulierBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("showAllHaulierquery"))) {
			while (rs.next()) {
				bean = new HaulierBean();
				bean.setHaulid(rs.getInt(1));
				bean.setHtelno(rs.getInt(2));
				bean.setHname(rs.getString(3));
				bean.setHstad1(rs.getString(4));
				bean.setHstad2(rs.getString(5));
				bean.setHtown(rs.getString(6));
				bean.setHpostcode(rs.getString(7));
				
				bean.setHemail(rs.getString(8));
				list.add(bean);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean modifyHaulier(HaulierBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateclientquery"))) {
			pstmt.setInt(7, bean.getHaulid());
			pstmt.setLong(1, bean.getHtelno());
			pstmt.setString(2, bean.getHname());
			pstmt.setString(3, bean.getHstad1());
			pstmt.setString(4, bean.getHstad2());
			pstmt.setString(5, bean.getHtown());
			pstmt.setString(6, bean.getHpostcode());
	
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

	@Override
	public HaulierBean getHaulierDetails(int haulid) {
		HaulierBean bean = null;
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("getClient"))) {
		 pstmt.setInt(1, haulid);
		 
		 ResultSet rs = pstmt.executeQuery();
		 while(rs.next())
		 {
			 bean = new HaulierBean();
			 bean.setHaulid(rs.getInt(1));
				bean.setHtelno(rs.getInt(2));
				bean.setHname(rs.getString(3));
				bean.setHstad1(rs.getString(4));
				bean.setHstad2(rs.getString(5));
				bean.setHtown(rs.getString(6));
				bean.setHpostcode(rs.getString(7));
				
				bean.setHemail(rs.getString(8));
			 return bean;
		 }
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return null;

	}
	}


