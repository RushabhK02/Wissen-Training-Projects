package com.shop.repository;

import java.util.List;

import com.shop.model.Product;

public interface ProductRepository {

	void save(Product product);

	List<Product> findAll();

	Product find(int id);

	void update(int id, double newPrice);

	void delete(int id);

}