package com.ryorangga.springcore;

import static org.junit.Assert.assertSame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryorangga.springcore.configuration.repository.ProductRepository;
import com.ryorangga.springcore.service.ComponentConfiguration;
import com.ryorangga.springcore.service.ProductService;

@SpringBootTest
public class ComponentTest {

	private ConfigurableApplicationContext context;
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
		context.registerShutdownHook();
	}
	
	@Test
	void testRun() {
		ProductService productService1 = context.getBean(ProductService.class);
		ProductService productService2 = context.getBean("productService",ProductService.class);
		
		Assertions.assertSame(productService1, productService2);
		
	}
	
	@Test
	void testConstructorInject() {
		ProductService productService = context.getBean(ProductService.class);
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Assertions.assertSame(productRepository, productService.getProductRepository());
	}
}
