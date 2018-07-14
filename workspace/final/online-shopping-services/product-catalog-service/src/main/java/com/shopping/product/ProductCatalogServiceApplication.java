package com.shopping.product;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.shopping.product.model.Product;
import com.shopping.product.model.Review;
import com.shopping.product.repository.ProductRepository;
import com.shopping.product.repository.ReviewRepository;

@SpringBootApplication
public class ProductCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogServiceApplication.class, args);
		
	}
	
	@Bean
	public CommandLineRunner test(ProductRepository productRepository, ReviewRepository reviewRepository) {
		return args->{
			List<Product> products = productRepository.find();
			for(Product product:products) {
			System.out.println(products.size());
			}
			
			Product product = productRepository.findByProperty("Mobile");
			System.out.println(product);
			
			/*Review review = new Review();
			review.setAuthor("Ramesh");
			review.setStars(3);
			review.setProduct(product);
			review.setReview("Too expensive");
			reviewRepository.addReview(review);
			
			product.setReviews(reviewRepository.loadReviews(product.getId()));
			List<Review> reviews = product.getReviews();
			for(Review rev:reviews) {
				System.out.println(rev);
			}
			
			review = reviewRepository.findById(2);
			System.out.println(review);
			
			reviewRepository.deleteReview(8);*/
			
		};
	}
	
}
