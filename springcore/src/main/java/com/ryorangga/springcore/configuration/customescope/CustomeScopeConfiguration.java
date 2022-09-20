package com.ryorangga.springcore.configuration.customescope;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ryorangga.springcore.configuration.dependson.Child;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class CustomeScopeConfiguration {

	@Bean
	public CustomScopeConfigurer customeConfigurer() {
		CustomScopeConfigurer configurer = new CustomScopeConfigurer();
		configurer.addScope("doubletoon", new DoubletonScope());
		return configurer;
	}
	
	@Bean
	@Scope("doubletoon")
	public Child childDoubletoon() {
		log.info("child doubletoon");
		return new Child();
	}
}
