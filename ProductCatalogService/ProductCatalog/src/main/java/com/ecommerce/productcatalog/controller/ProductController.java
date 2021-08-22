package com.ecommerce.productcatalog.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.productcatalog.exception.ProductNotFoundException;
import com.ecommerce.productcatalog.model.Product;
import com.ecommerce.productcatalog.service.ProductService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/products")
@Slf4j
@AllArgsConstructor
public class ProductController {

	private final ProductService productService;

	public List<Product> getAllProducts() {
		return productService.findAllProducts();
	}

	public Product getProductByCode(@PathVariable Long code) {
		return productService.findByCode(code)
				.orElseThrow(() -> new ProductNotFoundException("Product with code [" + code + "] not found"));
	}
}
