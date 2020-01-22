package com.cg.springrestfsm.dao;

import java.util.List;

import com.cg.springrestfsm.dto.ProductBean;

public interface ProductDao {
	public boolean deleteProduct(int productId);

	public List<ProductBean> getProduct();

	public boolean addProduct(ProductBean bean);

	public boolean modifyProduct(int productId, ProductBean bean);

	public ProductBean searchProduct(int productId);
}
