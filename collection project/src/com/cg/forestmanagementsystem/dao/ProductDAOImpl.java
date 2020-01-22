package com.cg.forestmanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.forestmanagementsystem.app.Product;
import com.cg.forestmanagementsystem.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO {
	private List<ProductBean> productbean = new ArrayList<ProductBean>();

	@Override
	public List<ProductBean> getAllProduct(ProductBean bean) {

		return productbean;
	}

	@Override
	public boolean addProduct(ProductBean prod) {
		for (ProductBean c1 : productbean) {

			if (c1.getProId() == prod.getProId()) {

				return false;
			}
		}
		productbean.add(prod);
		return true;
	}

	@Override
	public boolean deleteProduct(int prodId) {
		
		for (ProductBean cb : productbean) {
			ProductBean bean = null;
			if (cb.getProId() == prodId) {
				bean = cb;
			}
		
		if (bean != null) {
			productbean.remove(bean);
			return true;
		}
		}
		return false;

	}

	@Override
	public boolean modifyProduct(int prodId) {
		for (ProductBean c3 : productbean) {
			if (c3.getProId() == prodId) {
				return true;
			}
		}
		return false;
	}

}
