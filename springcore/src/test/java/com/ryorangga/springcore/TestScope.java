package com.ryorangga.springcore;

import static org.junit.Assert.assertNotSame;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.ryorangga.springcore.configuration.dependson.Child;
import com.ryorangga.springcore.configuration.scope.ScopeConfiguration;

@SpringBootTest
public class TestScope {

	@Autowired
	ApplicationContext context;
	
	@Test
	void testSope() {
	// karena ada 2 bean dengan obj yg sama sedang aktif, jadi perlu pemanggilan spesifik berdasarkan name bean nya 
		Child childA = context.getBean("childScope", Child.class);
		Child childB = context.getBean("childScope", Child.class);
		Child childC = context.getBean("childScope", Child.class);
		
		assertNotSame(childA, childB);
		assertNotSame(childC, childB);
		assertNotSame(childC, childA);
	}
}
