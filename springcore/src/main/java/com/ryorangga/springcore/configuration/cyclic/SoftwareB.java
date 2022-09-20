package com.ryorangga.springcore.configuration.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SoftwareB {
	
	public SoftwareB() {
		System.out.println("Software B");
	}

	private SoftwareC c;
}
