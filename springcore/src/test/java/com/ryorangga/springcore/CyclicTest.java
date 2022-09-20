package com.ryorangga.springcore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryorangga.springcore.configuration.cyclic.CircularConfiguration;

@SpringBootTest
public class CyclicTest {

	@Test
	void testCyclic() {
		//ApplicationContext context = new AnnotationConfigApplicationContext(CircularConfiguration.class);		
		
	}
	
}
