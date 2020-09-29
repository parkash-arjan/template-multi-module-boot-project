package com.product.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.product.model.beans.Product;

@Component
public class ProductDao {

	private List<Product> products;

	public ProductDao() {
		products = new ArrayList<>();

		products = new ArrayList<>(
				Arrays.asList(
						new Product(401L, "Fan", 20.20f), 
						new Product(402L, "Pen", 2.0f),
						new Product(403L, "Book", 25.99f), 
						new Product(404L, "Light Bulb", 4.99f)));

	}
	
	public List<Product> list(){
		return products;
	}

	public Product findById(Long id) {

		return products.stream().
				filter(product -> product.getId().longValue() == id.longValue()).
				findAny()
				.orElse(null);
	}
}
