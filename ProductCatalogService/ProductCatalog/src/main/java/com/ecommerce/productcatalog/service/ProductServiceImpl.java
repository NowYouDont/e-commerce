package com.ecommerce.productcatalog.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ecommerce.productcatalog.model.Product;
import com.ecommerce.productcatalog.repository.ProductRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
@AllArgsConstructor
public class ProductServiceImpl {

	private final ProductRepository productRepository;

	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}

	public Optional<Product> findByCode(Long code) {
		return productRepository.findByCode(code);
	}
}
