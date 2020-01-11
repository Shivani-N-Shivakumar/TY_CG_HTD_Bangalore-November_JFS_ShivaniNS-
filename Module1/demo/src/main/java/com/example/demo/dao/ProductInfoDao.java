package com.example.demo.dao;

import java.util.List;

import com.example.demo.dto.ProductInfo;

public interface ProductInfoDao {
	public List<ProductInfo> getproducts(int  productid);
}
