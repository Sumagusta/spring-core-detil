package com.ryorangga.springcore.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ryorangga.springcore.service.AnimalInfo;
import com.ryorangga.springcore.service.Habitat;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class DuplicateBeanConfig {
	
	
	@Bean(name="animalFirst")
	public AnimalInfo animal3() {
		log.info("create new foo 1");
		return new AnimalInfo();				
	}
	
	
	@Bean(name = "animalSecond")
	public AnimalInfo animal2() {
		log.info("create new foo 2");
		return new AnimalInfo();				
	}
	
	// method bean qualifier
	@Bean
	public Habitat animalHabitat1() {
		log.info("output dari qualify 1");
		return new Habitat();
	}
	
	@Primary // membuat bean menjadi primary sehingga akan dibaca paling awal;
	@Bean
	public Habitat animalHabitat2() {
		log.info("output dari qualify 2");
		return new Habitat();
	}
	
	// qualifier untuk mengambil bean spesifik berdasarkan nama bean
	// kalau tidak menggunakan qualifier, jika ada 2 bean dengan object yg sama maka akan error, karna basicnya bean adalah singletoon
	@Bean
	public AnimalInfo qualifyGroup(@Qualifier("animalHabitat1") Habitat habits1, Habitat habit2) {
		log.info("qualify group");
		return new AnimalInfo(habits1, habit2);
	}
	
	
	
	
}
