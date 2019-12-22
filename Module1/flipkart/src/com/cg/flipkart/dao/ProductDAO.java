package com.cg.flipkart.dao;

import java.util.List;

import com.cg.flipkart.bean.ProductBean;


public interface ProductDAO {

	public List<ProductBean> getAllProduct();
	public List<ProductBean> searchProduct(String Prod_name);
}
