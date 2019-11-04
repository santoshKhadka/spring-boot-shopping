package com.santosh.db.springbootshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.santosh.db.springbootshopping.dao.ProductDao;
import com.santosh.db.springbootshopping.model.Product;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao; 
	
	@Transactional
	@Override
	public List<Product> get() {
		return productDao.get();
	}
	@Transactional
	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	@Override
	public void save(Product product) {
		productDao.save(product);
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
