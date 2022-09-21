package com.ryorangga.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryorangga.springcore.configuration.repository.CategoryRepository;
import com.ryorangga.springcore.configuration.repository.CustomerRepository;
import com.ryorangga.springcore.service.CategoryService;
import com.ryorangga.springcore.service.ComponentConfiguration;
import com.ryorangga.springcore.service.CustomerService;

@SpringBootTest
public class CustomerTest {

private ConfigurableApplicationContext context;
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
		context.registerShutdownHook();
	}
	
	@Test
	void customerTest() {
		CustomerService customerService = context.getBean(CustomerService.class);
		Assertions.assertNotNull(customerService);
		
		CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
		Assertions.assertSame(customerRepository, customerService.getCustomerRepository());
	}
	
}
