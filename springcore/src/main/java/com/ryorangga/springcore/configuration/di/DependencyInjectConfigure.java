package com.ryorangga.springcore.configuration.di;

import org.springframework.beans.factory.config.Scope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectConfigure{

	@Bean
	public Child child() {
		return new Child();
	}
	
	@Bean
	public ParentChild parentChild(Child child) {
		return new ParentChild(child);
	}
	
}
