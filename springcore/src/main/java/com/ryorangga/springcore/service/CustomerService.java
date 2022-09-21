package com.ryorangga.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ryorangga.springcore.configuration.repository.CustomerRepository;

import lombok.Getter;

@Component
public class CustomerService {

	@Getter
	@Autowired
	private CustomerRepository customerRepository;
}
