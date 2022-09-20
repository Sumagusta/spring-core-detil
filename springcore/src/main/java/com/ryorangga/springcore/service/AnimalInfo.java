package com.ryorangga.springcore.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimalInfo {
	
	private Habitat habitat1;
	private Habitat habitat2;
	
	public AnimalInfo(){
		System.out.println("Data from Animal");
	}

}
