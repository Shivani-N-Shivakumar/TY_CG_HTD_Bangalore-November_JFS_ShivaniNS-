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

import com.cg.jdbc.bean.HaulierBean;
import com.cg.jdbc.bean.LandBean;



public class LandDaoImpl implements LandDao{
	FileReader reader;
	Properties prop;
	LandBean bean;

	public LandDaoImpl() {
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
	public boolean addLand(LandBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertlandquery"))) {
			pstmt.setInt(1, bean.getLandId());
			pstmt.setString(2, bean.getLandOwner());
			pstmt.setInt(3, bean.getLandCost());
			pstmt.setInt(4, bean.getAcres());
			
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
	public boolean deleteLand(int landId) {

		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deletelandquery"))) {
			pstmt.setInt(1, landId);

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
	public List<LandBean> getAllLand(LandBean bean) {
		
		List<LandBean> list = new ArrayList<LandBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("showAllLandquery"))) {
			while (rs.next()) {
				bean = new LandBean();
				bean.setLandId(rs.getInt(1));
				bean.setLandOwner(rs.getString(2));
				bean.setLandCost(rs.getInt(3));
				bean.setAcres(rs.getInt(4));

				list.add(bean);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean modifyLand(LandBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateclientquery"))) {
			pstmt.setInt(4, bean.getLandId());
			pstmt.setString(1, bean.getLandOwner());
			pstmt.setInt(2, bean.getLandCost());
			pstmt.setInt(3, bean.getAcres());
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
	public LandBean getLandDetails(int landId) {
		LandBean bean = null;
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("getClient"))) {
		 pstmt.setInt(1, landId);
		 
		 ResultSet rs = pstmt.executeQuery();
		 while(rs.next())
		 {
			 bean = new LandBean();
			 bean.setLandId(rs.getInt(1));
				bean.setLandOwner(rs.getString(2));
				bean.setLandCost(rs.getInt(3));
				bean.setAcres(rs.getInt(4));
			 return bean;
		 }
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return null;

	}

	}


