package com.cg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.springboot.dao.ProductDao;
import com.cg.springboot.dto.ProductBean;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao dao;

	@Override
	public boolean deleteProduct(int prodid) {

		return dao.deleteProduct(prodid);
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
	public boolean modifyProduct(int prodid, ProductBean bean) {

		return dao.modifyProduct(prodid, bean);
	}

	@Override
	public ProductBean searchProduct(int prodid) {

		return dao.searchProduct(prodid);
	}

}
