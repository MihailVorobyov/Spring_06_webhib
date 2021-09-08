package ru.vorobyov.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "product_list")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String title;
	
	private float price;
	
	public Product(String title, float price) {
		this.title = title;
		this.price = price;
	}
	
	public Product() {
	}
	
	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
}
