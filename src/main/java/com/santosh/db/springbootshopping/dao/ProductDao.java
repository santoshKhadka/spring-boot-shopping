package com.santosh.db.springbootshopping.dao;

import java.util.List;

import com.santosh.db.springbootshopping.model.Product;

public interface ProductDao {
	
	List<Product> get();
	
	Product get(int id);
	
	void save(Product product);
	
	void delete(int id);
	
}
