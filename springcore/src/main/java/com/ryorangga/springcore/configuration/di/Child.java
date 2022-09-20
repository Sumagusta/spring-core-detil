package com.ryorangga.springcore.configuration.di;

public class Child {
	public Child getChild() {
		return new Child();
	}
	
	public void getFromChild() {
		System.out.println("love from child");
	}
}
