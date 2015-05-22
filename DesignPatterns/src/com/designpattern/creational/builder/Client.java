package com.designpattern.creational.builder;

public class Client {
	public static void main(String[] args) {
		Director director = new Director( new ConcreteBuilder() );
		Product product = director.buildProduct();
		System.out.println(product);
	}

}
