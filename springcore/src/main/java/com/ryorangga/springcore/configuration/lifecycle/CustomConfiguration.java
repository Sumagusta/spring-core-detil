package com.ryorangga.springcore.configuration.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ryorangga.springcore.configuration.dependson.Child;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class CustomConfiguration {

	@Bean(name="childCustomConfig")
	public Child getChildCustomConfig() {
		log.info("iam child from customConfigure class 1");
		return new Child();
	}
}
