package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.ProductBean;
import com.cg.jdbc.dao.ContractDao;
import com.cg.jdbc.dao.ProductDao;
import com.cg.jdbc.factory.ContractFactory;
import com.cg.jdbc.factory.ProductFactory;

public class ProductServiceImpl implements ProductService {
	ProductDao dao = ProductFactory.instanceOfProductDaoImpl();

	@Override
	public boolean addProduct(ProductBean bean) {

		return dao.addProduct(bean);
	}

	@Override
	public boolean deleteProduct(int Prodid) {

		return dao.deleteProduct(Prodid);
	}

	@Override
	public List<ProductBean> getAllProduct(ProductBean bean) {

		return dao.getAllProduct(bean);
	}

	@Override
	public boolean modifyProduct(ProductBean bean) {
		
		return dao.modifyProduct(bean);
	}

	@Override
	public ProductBean getProductDetails(int prodid) {
		
		return dao.getProductDetails(prodid);
	}

}
