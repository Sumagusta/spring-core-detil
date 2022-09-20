package com.ryorangga.springcore.configuration.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import(value = {
//		CustomConfiguration.class // bisa lebih dari 1
//})
@ComponentScan(basePackages = { // untuk mendapatkan class yang tertanam @Configuration didalam package
		"com.ryorangga.springcore.configuration.lifecycle"
})
public class LifeCycleConfigure {

	@Bean
	public ConnectionDB connect() {
		return new ConnectionDB();
	}
	
	@Bean(name = "lifecycle", initMethod = "startBean", destroyMethod = "closeBean")
	public ConnectionDB connectAnnotation()  {
		return new ConnectionDB();
	}
	
}
