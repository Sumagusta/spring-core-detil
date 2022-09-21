package com.ryorangga.springcore.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ryorangga.springcore.configuration.optional.provider.MultiExample;

@Configuration
@ComponentScan(basePackages = {
		"com.ryorangga.springcore.configuration.repository",
		"com.ryorangga.springcore.service",
		"com.ryorangga.springcore.configuration.optional",
})
@Import(MultiExample.class)
public class ComponentConfiguration {

}
