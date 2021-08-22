package com.ecommerce.productcatalog.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.productcatalog.model.Product;

public interface ProductService {

	public List<Product> findAllProducts();

	public Optional<Product> findByCode(Long code);
}
