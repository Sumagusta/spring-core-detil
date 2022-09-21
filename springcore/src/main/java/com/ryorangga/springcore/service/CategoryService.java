package com.ryorangga.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ryorangga.springcore.configuration.repository.CategoryRepository;

import lombok.Getter;

@Component
public class CategoryService {

	@Getter
	private CategoryRepository categoryRepository;

	@Autowired
	public CategoryService(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}
	
	
}
