package com.ryorangga.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryorangga.springcore.configuration.ConfigClass;
import com.ryorangga.springcore.configuration.DuplicateBeanConfig;
import com.ryorangga.springcore.service.AnimalInfo;

@SpringBootTest
class SpringcoreApplicationTests {
	
	@Autowired
	ApplicationContext appContext;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testContext() {
		//ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		//ApplicationContext contextData = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		//Assertions.assertNotNull(context);
		//Assertions.assertNotNull(contextData);
	}
	
	@Test
	void callSpesificBean() { 
		//DuplicateBeanConfig config = appContext.getBean(DuplicateBeanConfig.class);
		
		ApplicationContext con = new AnnotationConfigApplicationContext(DuplicateBeanConfig.class);
		AnimalInfo config2 = appContext.getBean("animalFirst", AnimalInfo.class);
		AnimalInfo config1 = appContext.getBean("animalSecond", AnimalInfo.class);
		Assertions.assertNotSame(config1, config2);
		
		AnimalInfo config3 = appContext.getBean("qualifyGroup", AnimalInfo.class);
		Assertions.assertNotNull(config3);
	}
	

}
