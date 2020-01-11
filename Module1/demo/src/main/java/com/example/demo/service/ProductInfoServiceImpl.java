package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductInfoDao;
import com.example.demo.dto.ProductInfo;

@Service
public class ProductInfoServiceImpl implements ProductInfoService{
	@Autowired
	private ProductInfoDao dao;
	
	@Override
	public List<ProductInfo> getproducts(int productid) {
	
		return dao.getproducts(productid);
	}

}
