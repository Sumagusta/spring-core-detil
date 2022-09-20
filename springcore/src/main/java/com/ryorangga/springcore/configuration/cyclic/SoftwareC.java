package com.ryorangga.springcore.configuration.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SoftwareC {
	
	public SoftwareC() {
		System.out.println("Iam Software C");
	}
	private SoftwareA a;
	
}
