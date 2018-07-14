package com.shopping.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "REVIEWS", schema = "shop_db")
public class Review {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int Id;
	int stars;
	String author;
	String review;
	
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name="product_id")
	Product product;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Review [Id=" + Id + ", stars=" + stars + ", author=" + author + ", review=" + review + ", product="
				+ product + "]";
	}
	
	
	
}
