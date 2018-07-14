package com.shop.model;

import java.time.LocalDate;

public class Product {

	private int id;
	private String name;
	private double price;
	private LocalDate makeDate;
	private String image;
	private String description;

	public Product() {
	}

	public Product(int id, String name, double price, LocalDate makeDate, String image, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.makeDate = makeDate;
		this.image = image;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", makeDate=" + makeDate + ", image="
				+ image + ", description=" + description + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getMakeDate() {
		return makeDate;
	}

	public void setMakeDate(LocalDate makeDate) {
		this.makeDate = makeDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
