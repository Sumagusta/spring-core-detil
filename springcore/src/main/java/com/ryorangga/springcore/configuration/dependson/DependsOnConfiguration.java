package com.ryorangga.springcore.configuration.dependson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Configuration
public class DependsOnConfiguration {
	
	@Lazy // untuk membuat bean menjadi malas atau terhenti sementara tidak akan dibuat hingga ia dibutuhkan
	@Bean(name="childDepends")
	@DependsOn({ // untuk menjalankan bean lebih awal
		
		"parentDepends"
		
	})
	public Child child() {
		return new Child();
	}
	
	@Bean(name="parentDepends")
	public Parent parent() {
		return new Parent();
	}
	
}
