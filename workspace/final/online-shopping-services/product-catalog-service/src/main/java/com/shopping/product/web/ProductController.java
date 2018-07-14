package com.shopping.product.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.product.exceptions.ProductNotFoundException;
import com.shopping.product.model.Product;
import com.shopping.product.model.Review;
import com.shopping.product.repository.ProductRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value = "/api/product-catalog")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping(produces = "application/json")
	public Product post(@RequestBody Product product) {
		return productRepository.save(product);
	}

	@RequestMapping(
					method = RequestMethod.GET,
					produces = "application/json")
	public List<Product> get() {
		return productRepository.find();
	}

	@RequestMapping(value = "{id}", 
					method = RequestMethod.GET,
					produces = "application/json")
	public Product get(@PathVariable int id) {
		Product product = productRepository.findByProperty(id);
		if(product==null)
			throw new ProductNotFoundException("Resource does not exist");
		return product;
	}

	@RequestMapping(params = {"name"}, 
					method = RequestMethod.GET,
					produces = "application/json")
	public Product getProductByName(@RequestParam String name) {
		Product product = productRepository.findByProperty(name);
		if(product==null)
			throw new ProductNotFoundException("Resource does not exist");
		return product;
	}
	
	@ExceptionHandler(value=ProductNotFoundException.class)
	public ResponseEntity<String> exceptionHandler(Throwable exception){
		return new ResponseEntity<String>(exception.getMessage(),null,HttpStatus.NOT_FOUND);
	}

	
}