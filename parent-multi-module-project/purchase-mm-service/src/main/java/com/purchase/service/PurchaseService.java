package com.purchase.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseService {

	@GetMapping(path = "/purchase-service")
	public String version() {
		return "Purchase Service Version 0.0.1";
	}

}
