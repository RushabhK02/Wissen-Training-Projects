package com.shop.repository;

import java.util.List;

import com.shop.model.Product;

public interface ProductRepository {
	void save(Product product);
	
	Product find(int id);
	
	List<Product> findAll();
	
	void update(Product product);
	
	void delete(int id);
}
