package com.cg.forestmanagementsystem.services;

import java.util.List;

import com.cg.forestmanagementsystem.bean.ProductBean;
import com.cg.forestmanagementsystem.dao.ProductDAO;
import com.cg.forestmanagementsystem.util.ProductFactory;

public class ProductServiceImpl implements ProductService {
 ProductDAO dao = ProductFactory.instanceOfProductDaoImpl();
	@Override
	public List<ProductBean> getAllProduct(ProductBean bean) {
		
		return dao.getAllProduct(bean);
	}

	@Override
	public boolean addProduct(ProductBean prod) {
		
		return dao.addProduct(prod);
	}

	@Override
	public boolean modifyProduct(int prodId) {
		
		return dao.modifyProduct(prodId);
	}

	@Override
	public boolean deleteProduct(int prodId) {
		
		return dao.deleteProduct(prodId);
	}

}
