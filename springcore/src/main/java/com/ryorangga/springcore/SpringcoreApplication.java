package com.ryorangga.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ryorangga.springcore.configuration.di.Child;
import com.ryorangga.springcore.configuration.di.ParentChild;

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
		
	}

}
