package com.cg.hibernate.dao;

import java.util.List;

import com.cg.hibernate.dto.ProductBean;



public interface ProductDao {
	boolean addProduct(ProductBean bean);

	public boolean deleteProduct(int Prodid);

	public List<ProductBean> getAllProduct(ProductBean bean);
}
