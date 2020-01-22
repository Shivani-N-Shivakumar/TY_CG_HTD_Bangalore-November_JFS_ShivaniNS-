package com.cg.springrestfsm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.springrestfsm.dto.ProductBean;

@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean deleteProduct(int productId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ProductBean bean = manager.find(ProductBean.class, productId);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<ProductBean> getProduct() {
		String jpql = "from ProductBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<ProductBean> query = manager.createQuery(jpql, ProductBean.class);

		return query.getResultList();
	}

	@Override
	public boolean addProduct(ProductBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
		return true;
	}

	@Override
	public boolean modifyProduct(int productId, ProductBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ProductBean product = entityManager.find(ProductBean.class, productId);
			product.setProductId(bean.getProductId());
			product.setProductName(bean.getProductName());
			product.setProductDescription(bean.getProductDescription());

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
		return false;
	}

	@Override
	public ProductBean searchProduct(int productId) {
		EntityManager manager = factory.createEntityManager();
		ProductBean searchproduct = manager.find(ProductBean.class, productId);
		return searchproduct;
	}

}
