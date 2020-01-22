package com.cg.springboot.service;

import java.util.List;

import com.cg.springboot.dto.ProductBean;

public interface ProductService {
	public boolean deleteProduct(int prodid);

	public List<ProductBean> getProduct();

	public boolean addProduct(ProductBean bean);

	public boolean modifyProduct(int prodid, ProductBean bean);

	public ProductBean searchProduct(int prodid);
}
