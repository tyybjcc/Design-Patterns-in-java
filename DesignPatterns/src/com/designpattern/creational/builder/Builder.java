package com.designpattern.creational.builder;

public abstract class Builder {
	protected Product product;
	public void createProduct() {
		product = new Product();
	}
	public Product getProduct() {
		return this.product;
	}
	public abstract void buildPart1();
	public abstract void buildPart2();
}


