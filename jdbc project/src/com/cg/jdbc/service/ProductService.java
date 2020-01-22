package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.ProductBean;

public interface ProductService {
	boolean addProduct(ProductBean bean);

	public boolean deleteProduct(int Prodid);

	public List<ProductBean> getAllProduct(ProductBean bean);
	
	public boolean modifyProduct(ProductBean bean);

	public ProductBean getProductDetails(int prodid);
}
