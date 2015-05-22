package com.designpattern.creational.factory_method;

public class Client {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product1 = creator.createProduct(Product1.class);
		Product product2 = creator.createProduct(Product2.class);
		System.out.println(product1);
		System.out.println(product2);
	}

}
