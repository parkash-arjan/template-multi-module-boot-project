package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.product.dao.ProductDao;
import com.product.model.beans.Product;

@RestController
public class ProductService {

	@Autowired
	private ProductDao dao;

	@GetMapping(path = "/products")
	public List<Product> list() {
		return dao.list();
	}

	@GetMapping(path = "/product/{id}")
	public Product findProduct(@PathVariable Long id) {
		return dao.findById(id);

	}
}
