package com.santosh.db.springbootshopping.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.santosh.db.springbootshopping.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private EntityManager entityManager; 
	
	@Override
	public List<Product> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Product> query= currentSession.createQuery("from Product",Product.class);
		List<Product> list = query.getResultList();
		return list;
	}

	@Override
	public Product get(int id) {
		entityManager.unwrap(Session.class);
		return null;
	}

	@Override
	public void save(Product product) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(product);
	}

	@Override
	public void delete(int id) {
		entityManager.unwrap(Session.class);
		
	}

}
