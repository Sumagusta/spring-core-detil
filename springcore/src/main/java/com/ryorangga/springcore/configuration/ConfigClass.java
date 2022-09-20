package com.ryorangga.springcore.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ryorangga.springcore.service.AnimalInfo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ConfigClass {
	
	private static String single;
	
//	@Bean
//	public AnimalInfo animal1() {
//		log.info("create new foo 1");
//		return new AnimalInfo();				
//	}
//	
//	@Bean
//	public AnimalInfo animal2() {
//		log.info("create new foo 2");
//		return new AnimalInfo();				
//	}
	
//	@Bean
//	public AnimalInfo animal() {
//		AnimalInfo anim = new AnimalInfo();
//		log.info("create new foo");
//		return anim;				
//	}
	
	@Bean
	public void welcome() {
		System.out.println("Halo selamat datang brooo");
		log.info("call welcome method");
	}
	
	@Bean
	public void creatSingletoon() {
		single = "call singletoon";
		log.info(single);
	}
	
}
