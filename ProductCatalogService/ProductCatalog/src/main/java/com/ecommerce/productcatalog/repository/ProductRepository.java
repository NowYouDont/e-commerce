package com.ecommerce.productcatalog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.productcatalog.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Optional<Product> findByCode(Long code);
}
