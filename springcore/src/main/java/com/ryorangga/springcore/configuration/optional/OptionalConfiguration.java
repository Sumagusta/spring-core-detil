package com.ryorangga.springcore.configuration.optional;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class OptionalConfiguration {

	@Bean
	@Primary
	public Example1 ex1() {
		return new Example1();
	}
	@Bean
	public Example1 ex2() {
		return new Example1();
	}
	@Bean
	public Example1 ex3() {
		return new Example1();
	}
	
	@Bean
	public FetchExample fetcExample(Optional<Example1> ex1, Optional<Example2> ex2) { // optional gunakan supaya parameternya tidak mandatory/wajib
		return new FetchExample(ex1.orElse(null), ex2.orElse(null)); // orElse : jika value tidak ada ganti value null;
	}
}
