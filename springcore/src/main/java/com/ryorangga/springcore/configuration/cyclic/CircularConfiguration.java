package com.ryorangga.springcore.configuration.cyclic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class CircularConfiguration {
	
//	@Bean
//	public SoftwareA cyclicA(SoftwareB softwareB) {
//		return new SoftwareA(softwareB);
//	}
//	
//	@Bean
//	public SoftwareB cyclicB(SoftwareC softwareC) {
//		return new SoftwareB(softwareC);
//	}

//	@Bean
//	public SoftwareC cyclicC(SoftwareA softwareA) {
//		return new SoftwareC(softwareA);
//	}
	
	
}
