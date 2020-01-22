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
import com.cg.jdbc.bean.SchedulerBean;

public class SchedulerDaoImpl implements SchedulerDao {
	FileReader reader;
	Properties prop;
	SchedulerBean bean;

	public SchedulerDaoImpl() {
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
	public boolean addScheduler(SchedulerBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertschedulerquery"))) {
			pstmt.setInt(1,bean.getScheduleId());
			pstmt.setInt(2, bean.getContractId());
	
			pstmt.setInt(3, bean.getProductId());
			pstmt.setInt(4, bean.getQuantity());
			pstmt.setString(5, bean.getDelivaryDate());
			
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
	public boolean deleteScheduler(int scheduleId) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteschedulerquery"))) {
			pstmt.setInt(1, scheduleId );

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
	public List<SchedulerBean> getAllScheduler(SchedulerBean bean) {
		List<SchedulerBean> list = new ArrayList<SchedulerBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("showAllSchedulerquery"))) {
			while (rs.next()) {
				bean = new SchedulerBean();
				bean.setScheduleId(rs.getInt(1));
				bean.setContractId(rs.getInt(2));
				bean.setProductId(rs.getInt(3));
				bean.setQuantity(rs.getInt(4));
				bean.setDelivaryDate(rs.getString(5));
				
				list.add(bean);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean modifyScheduler(SchedulerBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateclientquery"))) {
			pstmt.setInt(5,bean.getScheduleId());
			pstmt.setInt(1, bean.getContractId());
	
			pstmt.setInt(2, bean.getProductId());
			pstmt.setInt(3, bean.getQuantity());
			pstmt.setString(4, bean.getDelivaryDate());
			
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
	public SchedulerBean getSchedulerDetails(int scheduleId) {
		SchedulerBean bean = null;
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("getClient"))) {
		 pstmt.setInt(1, scheduleId);
		 
		 ResultSet rs = pstmt.executeQuery();
		 while(rs.next())
		 {
			 bean = new SchedulerBean();
			 bean.setScheduleId(rs.getInt(1));
				bean.setContractId(rs.getInt(2));
				bean.setProductId(rs.getInt(3));
				bean.setQuantity(rs.getInt(4));
				bean.setDelivaryDate(rs.getString(5));
			 return bean;
		 }
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return null;

	}

	}


