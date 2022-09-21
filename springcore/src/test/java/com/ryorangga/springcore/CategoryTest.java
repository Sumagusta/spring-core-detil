package com.ryorangga.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryorangga.springcore.configuration.repository.CategoryRepository;
import com.ryorangga.springcore.service.CategoryService;
import com.ryorangga.springcore.service.ComponentConfiguration;

@SpringBootTest
public class CategoryTest {

private ConfigurableApplicationContext context;
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
		context.registerShutdownHook();
	}
	
	@Test
	void categoryTest() {
		CategoryService categoryService = context.getBean(CategoryService.class);
		Assertions.assertNotNull(categoryService);
		
		CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);
		Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
	}
	
}
