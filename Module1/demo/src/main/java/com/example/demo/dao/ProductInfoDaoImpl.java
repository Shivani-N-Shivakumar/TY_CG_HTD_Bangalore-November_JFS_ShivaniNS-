package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.ProductInfo;
@Repository
public class ProductInfoDaoImpl implements ProductInfoDao{
	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public List<ProductInfo> getproducts(int productid) {
		String jpql ="from ProductInfo where productid=:productid";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<ProductInfo> query=manager.createQuery(jpql,ProductInfo.class);
		query.setParameter("productid", productid);
		
		return query.getResultList();
		
	}

}
