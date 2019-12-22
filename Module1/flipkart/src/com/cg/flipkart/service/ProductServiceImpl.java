package com.cg.flipkart.service;

import java.util.List;

import com.cg.flipkart.bean.ProductBean;
import com.cg.flipkart.dao.ProductDAO;
import com.cg.flipkart.factory.ProductFactory;

public class ProductServiceImpl implements ProductService{
	private ProductDAO dao=ProductFactory.instanceOfProductDAOImpl();

	@Override
	public List<ProductBean> getAllProduct() {
		
		return dao.getAllProduct();
	}

	@Override
	public List<ProductBean> searchProduct(String Prod_name) {
		
		return dao.searchProduct(Prod_name);
	}

}
