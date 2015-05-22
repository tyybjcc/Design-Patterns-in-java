package com.designpattern.creational.builder;

import com.designpattern.creational.builder.Builder;

public class Director {
	private Builder builder;
	
	// some implementation use setBuilder(Builder builder) instead.
	public Director(Builder _builder) {
		this.builder = _builder;
	}
	
	// if you want to change a builder, you could set setBuilder
	public void setBuilder(Builder _builder) {
		this.builder = _builder;
	}
	
	public Product buildProduct() {
		this.builder.createProduct();
		builder.buildPart1();
		builder.buildPart2();
		return builder.getProduct();
	}

}
