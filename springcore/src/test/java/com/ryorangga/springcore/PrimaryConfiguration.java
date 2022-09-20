package com.ryorangga.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryorangga.springcore.configuration.DuplicateBeanConfig;
import com.ryorangga.springcore.service.AnimalInfo;

@SpringBootTest
public class PrimaryConfiguration {

	private ApplicationContext appContext;
	
	@BeforeEach
	void setUp() {
		appContext = new AnnotationConfigApplicationContext(DuplicateBeanConfig.class);
	}
	
	@Test
	void testGetPrimary() {
		AnimalInfo animal = appContext.getBean(AnimalInfo.class);
		AnimalInfo animal1 = appContext.getBean("animalFirst",AnimalInfo.class);
		//AnimalInfo animal2 = appContext.getBean("animal3",AnimalInfo.class);
	
		Assertions.assertSame(animal, animal1);
//		Assertions.assertNotSame(animal1, animal2);
//		Assertions.assertNotSame(animal, animal2);
	}
}
