package com.cg.hibernate.service;

import java.util.List;

import com.cg.hibernate.dto.ProductBean;

public interface ProductService {
	boolean addProduct(ProductBean bean);

	public boolean deleteProduct(int Prodid);

	public List<ProductBean> getAllProduct(ProductBean bean);
}
