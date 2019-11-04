package com.santosh.db.springbootshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santosh.db.springbootshopping.model.Product;
import com.santosh.db.springbootshopping.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> get(){
		return productService.get();
	}
	
	@PostMapping("/product")
	public Product save(@RequestBody Product product) {
		productService.save(product);
		return product;
	}
	
	
}
