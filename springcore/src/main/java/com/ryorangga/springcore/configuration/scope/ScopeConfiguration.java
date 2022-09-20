package com.ryorangga.springcore.configuration.scope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ryorangga.springcore.configuration.dependson.Child;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ScopeConfiguration {

	@Bean(name="childScope")
	@Scope("prototype")
	public Child child() {
		log.info("Iam child prototype");
		return new Child();
	}
}
