package com.ryorangga.springcore.configuration.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SoftwareA {
	
	private SoftwareB b;
	
}
