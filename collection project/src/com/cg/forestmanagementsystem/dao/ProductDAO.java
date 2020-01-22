package com.cg.forestmanagementsystem.dao;

import java.util.List;

import com.cg.forestmanagementsystem.bean.ProductBean;

public interface ProductDAO {
	public List<ProductBean> getAllProduct(ProductBean bean);

	public boolean addProduct(ProductBean prod);

	public boolean modifyProduct(int prodId);

	public boolean deleteProduct(int prodId);

}
