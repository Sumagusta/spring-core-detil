package com.ryorangga.springcore.configuration.component;

import org.springframework.stereotype.Component;

import com.ryorangga.springcore.configuration.dependson.Parent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ProductService {
	
	public Parent parentService() {
		log.info("Parent from product-service");
		return new Parent();
	}
	
	public ProductService() {
		parentService();
	}
}
