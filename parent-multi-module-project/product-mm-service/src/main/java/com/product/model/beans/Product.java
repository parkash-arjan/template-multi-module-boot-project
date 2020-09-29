package com.product.model.beans;

import lombok.Data;

@Data
public class Product {
	private Long id;
	private String name;
	private float price;

	public Product(Long id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}
