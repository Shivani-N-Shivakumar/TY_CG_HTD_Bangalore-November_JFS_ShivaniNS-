package com.cg.flipkart.service;

import java.util.List;

import com.cg.flipkart.bean.ProductBean;

public interface ProductService {
	public List<ProductBean> getAllProduct();
	public List<ProductBean> searchProduct(String Prod_name);
}
