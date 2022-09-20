package com.ryorangga.springcore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryorangga.springcore.configuration.di.Child;
import com.ryorangga.springcore.configuration.di.DependencyInjectConfigure;
import com.ryorangga.springcore.configuration.di.ParentChild;

@SpringBootTest
public class DependencyInjectionToChild {

	ApplicationContext appContext;
	
	// No use DI
	@Test
	public void getChild(){
		var child = new Child();
		var parentChild = new ParentChild(child.getChild());
		parentChild.getPChild().getFromChild();
	}
	
	@BeforeEach
	public void createIocBean() {
		appContext = new AnnotationConfigApplicationContext(DependencyInjectConfigure.class);
	}
	
	@Test
	public void usingDiParent() {
		ParentChild parentChild = appContext.getBean(ParentChild.class);
		parentChild.getPChild().getFromChild();
	}
}
