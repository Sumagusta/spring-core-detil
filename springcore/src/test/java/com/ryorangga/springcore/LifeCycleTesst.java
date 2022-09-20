package com.ryorangga.springcore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryorangga.springcore.configuration.dependson.Child;
import com.ryorangga.springcore.configuration.lifecycle.ConnectionDB;
import com.ryorangga.springcore.configuration.lifecycle.LifeCycleConfigure;

@SpringBootTest
public class LifeCycleTesst {

	ConfigurableApplicationContext context; // turunan dari applicationContext, karna butuh registerShutdownHook, jadi harus menggunalkan interfave ini
	
	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(LifeCycleConfigure.class);
		context.registerShutdownHook();
	}
	
	@Test
	void testCycle() {
		ConnectionDB connection = context.getBean("lifecycle",ConnectionDB.class);
		Child connectionCustomConfigure = context.getBean("childCustomConfig",Child.class);
		Child connectionCustomConfigure2 = context.getBean("childCustomConfig2",Child.class);
	}
}
