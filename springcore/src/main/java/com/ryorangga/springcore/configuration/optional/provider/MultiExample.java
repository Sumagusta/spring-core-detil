package com.ryorangga.springcore.configuration.optional.provider;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import com.ryorangga.springcore.configuration.optional.Example1;

import lombok.Getter;

@Component
public class MultiExample {
	
	@Getter
	private List<Example1> example1s;
	
	public MultiExample(ObjectProvider<Example1> objProvider) {
		example1s = objProvider.stream().collect(Collectors.toList());
	}
}
