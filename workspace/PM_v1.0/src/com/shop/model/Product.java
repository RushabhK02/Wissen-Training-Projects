package com.shop.model;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
	private static final long serialVersionUID=1L;
	private int id;
	private String name;
	private double price;
	private Date date;
	private String image;
	private String description;
	public Product() {
	}
	public Product(int id, String name, double price, Date date, String image, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.date = date;
		this.image = image;
		this.description = description;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
