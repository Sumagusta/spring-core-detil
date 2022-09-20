package com.ryorangga.springcore.configuration.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ryorangga.springcore.configuration.dependson.Child;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class CustomConfiguration2 {

	@Bean(name="childCustomConfig2")
	public Child getChildCustomConfig() {
		log.info("iam child from customConfigure class 2");
		return new Child();
	}
}
