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

public class ClientDaoImpl implements ClientDao {

	FileReader reader;
	Properties prop;
	ClientBean bean;

	public ClientDaoImpl() {
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
	public boolean addClient(ClientBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertclientquery"))) {
			pstmt.setInt(1, bean.getCustId());
			pstmt.setLong(2, bean.getTelNo());
			pstmt.setString(3, bean.getcName());
			pstmt.setString(4, bean.getStad1());
			pstmt.setString(5, bean.getStad2());
			pstmt.setString(6, bean.getTown());
			pstmt.setString(7, bean.getPostCode());
			pstmt.setString(8, bean.getEmail());
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
	public boolean modifyClient( ClientBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateclientquery"))) {
			pstmt.setInt(8, bean.getCustId());
			pstmt.setLong(1, bean.getTelNo());
			pstmt.setString(2, bean.getcName());
			pstmt.setString(3, bean.getStad1());
			pstmt.setString(4, bean.getStad2());
			pstmt.setString(5, bean.getTown());
			pstmt.setString(6, bean.getPostCode());
			pstmt.setString(7, bean.getEmail());
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
	public boolean deleteClient(int custId) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteclientquery"))) {
			pstmt.setInt(1, custId);

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
	public List<ClientBean> getAllClient(ClientBean bean) {
		List<ClientBean> list = new ArrayList<ClientBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("showAllClientquery"))) {
			while (rs.next()) {
				bean = new ClientBean();

				bean.setCustId(rs.getInt(1));
				bean.setTelNo(rs.getLong(2));
				bean.setcName(rs.getString(3));
				bean.setStad1(rs.getString(4));
				bean.setStad2(rs.getString(5));
				bean.setTown(rs.getString(6));
				bean.setPostCode(rs.getString(7));
			
				bean.setEmail(rs.getString(8));
				list.add(bean);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ClientBean getClientDetails(int custId) {
		ClientBean bean = null;
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("getClient"))) {
		 pstmt.setInt(1, custId);
		 
		 ResultSet rs = pstmt.executeQuery();
		 while(rs.next())
		 {
			 bean = new ClientBean();
			 bean.setCustId(rs.getInt("custId"));
			 bean.setTelNo(rs.getLong("telNo"));
			 bean.setcName(rs.getString("cName"));
			 bean.setStad1(rs.getString("stad1"));
			 bean.setStad2(rs.getString("stad2"));
			 bean.setTown(rs.getString("town"));
			 bean.setPostCode(rs.getString("postCode"));
			 bean.setEmail(rs.getString("email"));
			 return bean;
		 }
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return null;

}
}
