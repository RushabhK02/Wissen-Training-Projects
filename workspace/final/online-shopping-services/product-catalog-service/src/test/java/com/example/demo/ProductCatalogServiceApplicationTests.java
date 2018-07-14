package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shopping.product.ProductCatalogServiceApplication;
import com.shopping.product.model.Product;
import com.shopping.product.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ProductCatalogServiceApplication.class)
public class ProductCatalogServiceApplicationTests {

	@Autowired
	ProductRepository productRepository;
	
	@Test
	public void getTest() {
		List<Product> products = productRepository.find();
		assertEquals(3, products.size());
	}

}
