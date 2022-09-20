package com.ryorangga.springcore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryorangga.springcore.configuration.component.ComponentConfiguration;
import com.ryorangga.springcore.configuration.component.ProductService;

@SpringBootTest
public class ComponentTest {

	ApplicationContext context;
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
	}
	
	@Test
	void testRun() {
		ProductService productService = context.getBean(ProductService.class);
	}
}
