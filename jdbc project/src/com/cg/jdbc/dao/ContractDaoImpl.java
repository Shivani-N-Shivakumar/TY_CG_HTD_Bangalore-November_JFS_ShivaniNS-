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

import com.cg.jdbc.bean.ClientBean;
import com.cg.jdbc.bean.ContractBean;

public class ContractDaoImpl implements ContractDao {
	FileReader reader;
	Properties prop;
	ContractBean bean;

	public ContractDaoImpl() {
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
	public boolean addContract(ContractBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertcontractquery"))) {
			pstmt.setInt(1, bean.getContractNO());
			pstmt.setInt(2, bean.getCustId());
			pstmt.setInt(3, bean.getHaulId());
			pstmt.setInt(4, bean.getProdId());
			pstmt.setInt(5, bean.getQuantity());
			pstmt.setString(6, bean.getDeliveryDate());
			pstmt.setString(7, bean.getDeliveryDay());
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
	public boolean deleteContract(int contractNo) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deletecontractquery"))) {
			pstmt.setInt(1, contractNo );

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
	public List<ContractBean> getAllContract(ContractBean bean) {
		List<ContractBean> list = new ArrayList<ContractBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("showAllContractquery"))) {
			while (rs.next()) {
				bean = new ContractBean();
				bean.setContractNO(rs.getInt(1));
				bean.setCustId(rs.getInt(2));
				bean.setHaulId(rs.getInt(3));
				bean.setProdId(rs.getInt(4));
				bean.setQuantity(rs.getInt(5));
				bean.setDeliveryDate(rs.getString(6));
				bean.setDeliveryDay(rs.getString(7));
				list.add(bean);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean modifyContract(ContractBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateclientquery"))) {
		
			pstmt.setInt(7, bean.getContractNO());
			pstmt.setInt(1, bean.getCustId());
			pstmt.setInt(2, bean.getHaulId());
			pstmt.setInt(3, bean.getProdId());
			pstmt.setInt(4, bean.getQuantity());
			pstmt.setString(5, bean.getDeliveryDate());
			pstmt.setString(6, bean.getDeliveryDay());
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
	public ContractBean getContractDetails(int contractNO) {
		ContractBean bean = null;
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("getClient"))) {
		 pstmt.setInt(1, contractNO);
		 
		 ResultSet rs = pstmt.executeQuery();
		 while(rs.next())
		 {
			 bean = new ContractBean();
			 bean.setContractNO(rs.getInt(1));
				bean.setCustId(rs.getInt(2));
				bean.setHaulId(rs.getInt(3));
				bean.setProdId(rs.getInt(4));
				bean.setQuantity(rs.getInt(5));
				bean.setDeliveryDate(rs.getString(6));
				bean.setDeliveryDay(rs.getString(7));
			 return bean;
		 }
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return null;

	}

}
