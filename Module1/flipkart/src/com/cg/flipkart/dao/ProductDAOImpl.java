package com.cg.flipkart.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import com.mysql.jdbc.Driver;


import com.cg.flipkart.bean.ProductBean;
import com.cg.flipkart.dao.*;

public class ProductDAOImpl implements ProductDAO{
	
	FileReader reader;
	Properties prop;
	ProductBean bean;
	
	
	public ProductDAOImpl() {
	
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
	public List<ProductBean> getAllProduct() {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				bean=new ProductBean();
				bean.setProd_id(rs.getInt(1));
				bean.setProd_name(rs.getString(2));
				bean.setProd_cost(rs.getDouble(3));
				bean.setProd_color(rs.getString(4));
				bean.setDescription(rs.getString(5));
				bean.setNo_of_prod(6);
				
				list.add(bean);
			}
			return list;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
		
	

	@Override
	public List<ProductBean> searchProduct(String Prod_name) {
		
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				
				){
			PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("searchquery"));
			pstmt.setString(2,Prod_name);
		
			
			ResultSet rs=pstmt.executeQuery("ssearchquery");
			if(rs.next()) {
				bean=new ProductBean();
				bean.setProd_id(rs.getInt(2));
				bean.setProd_name(rs.getString(1));
				bean.setProd_cost(rs.getDouble(3));
				bean.setProd_color(rs.getString(4));
				bean.setDescription(rs.getString(5));
				bean.setNo_of_prod(rs.getInt(6));
				
				list.add(bean);
			}
			
			return list;
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
