package com.cg.springrestfsm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springrestfsm.dao.ProductDao;
import com.cg.springrestfsm.dto.ProductBean;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao dao;

	@Override
	public boolean deleteProduct(int productId) {

		return dao.deleteProduct(productId);
	}

	@Override
	public List<ProductBean> getProduct() {

		return dao.getProduct();
	}

	@Override
	public boolean addProduct(ProductBean bean) {

		return dao.addProduct(bean);
	}

	@Override
	public boolean modifyProduct(int productId, ProductBean bean) {

		return dao.modifyProduct(productId, bean);
	}

	@Override
	public ProductBean searchProduct(int productId) {

		return dao.searchProduct(productId);
	}

}
