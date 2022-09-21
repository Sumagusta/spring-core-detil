package com.ryorangga.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryorangga.springcore.configuration.optional.Example1;
import com.ryorangga.springcore.configuration.optional.FetchExample;
import com.ryorangga.springcore.configuration.optional.OptionalConfiguration;
import com.ryorangga.springcore.configuration.optional.provider.MultiExample;
import com.ryorangga.springcore.configuration.repository.CategoryRepository;
import com.ryorangga.springcore.service.CategoryService;
import com.ryorangga.springcore.service.ComponentConfiguration;

@SpringBootTest
public class OptionalTest {

private ConfigurableApplicationContext context;
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
		context.registerShutdownHook();
	}
	
	@Test
	void optionalTest() {
		Example1 ex1 = context.getBean(Example1.class);
		FetchExample fetch = context.getBean(FetchExample.class);
		
		Assertions.assertNull(fetch.getExample2());
		Assertions.assertSame(ex1, fetch.getExample1());
	}
	 
	@Test
	void providerTest() {
		MultiExample multiExample = context.getBean(MultiExample.class);
		
		Assertions.assertEquals(3, multiExample.getExample1s().size());
	}
	
}
