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


import com.cg.jdbc.bean.ProductBean;

public class ProductDaoImpl implements ProductDao {
	FileReader reader;
	Properties prop;
	ProductBean bean;
	public ProductDaoImpl() {
		try {
			
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public boolean addProduct(ProductBean bean) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insertproductquery"))){
			 pstmt.setInt(1,bean.getProdid());
			 pstmt.setString(2, bean.getPname());
		        pstmt.setString(3, bean.getPdesc());
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
	public boolean deleteProduct(int Prodid) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteproductquery"))){
				pstmt.setInt(1,Prodid);
				
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
	public List<ProductBean> getAllProduct(ProductBean bean) {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("showAllProductquery"))){
			while(rs.next()) {
				bean=new ProductBean();
				bean.setProdid(rs.getInt(1));
				bean.setPname(rs.getString(2));
	           bean.setPdesc (rs.getString(3));
	          
				list.add(bean);
			}
			return list;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean modifyProduct(ProductBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateclientquery"))) {
			pstmt.setInt(3,bean.getProdid());
			 pstmt.setString(1, bean.getPname());
		        pstmt.setString(2, bean.getPdesc());
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
	public ProductBean getProductDetails(int prodid) {
		ProductBean bean = null;
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("getClient"))) {
		 pstmt.setInt(1, prodid);
		 
		 ResultSet rs = pstmt.executeQuery();
		 while(rs.next())
		 {
			 bean = new ProductBean();
			 bean.setProdid(rs.getInt(1));
				bean.setPname(rs.getString(2));
	           bean.setPdesc (rs.getString(3));
	          
			 return bean;
		 }
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return null;

	}

	}


