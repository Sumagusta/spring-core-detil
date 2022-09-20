package com.ryorangga.springcore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryorangga.springcore.configuration.dependson.DependsOnConfiguration;

@SpringBootTest
public class DependsOnTest {

	ApplicationContext context;
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
	}
	
	@Test
	void testDependsOn() {
		
	}
}
