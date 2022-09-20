package com.ryorangga.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.ryorangga.springcore.configuration.dependson.Child;

@SpringBootTest
public class CustomScopeTest {

	@Autowired
	ApplicationContext context;
	
	@Test
	void testDoubletoonScope() {
		Child childDoubletoon1 = context.getBean("childDoubletoon", Child.class);
		Child childDoubletoon2 = context.getBean("childDoubletoon", Child.class);
		Child childDoubletoon3 = context.getBean("childDoubletoon", Child.class);
		Child childDoubletoon4 = context.getBean("childDoubletoon", Child.class);
		
		Assertions.assertSame(childDoubletoon1, childDoubletoon3);
		Assertions.assertSame(childDoubletoon2, childDoubletoon4);
	}
}
