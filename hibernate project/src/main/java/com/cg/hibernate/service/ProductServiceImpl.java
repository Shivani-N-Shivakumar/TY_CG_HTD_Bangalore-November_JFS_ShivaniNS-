package com.cg.hibernate.service;

import java.util.List;

import com.cg.hibernate.dao.ProductDao;
import com.cg.hibernate.dto.ProductBean;
import com.cg.hibernate.factory.ProductFactory;

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

}
