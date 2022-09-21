package com.ryorangga.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ryorangga.springcore.configuration.dependson.Parent;
import com.ryorangga.springcore.configuration.repository.ProductRepository;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Component
public class ProductService {
	
	@Getter
	private ProductRepository productRepository;
//	
//	public Parent parentService() {
//		log.info("Parent from product-service");
//		return new Parent();
//	}
//
//	public ProductService() {
//		parentService();
//		
//	}

	@Autowired // manandai construct yang akan digunakan
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public ProductService(ProductRepository productRepository, String name) {
		this.productRepository = productRepository;
	}
	
}
