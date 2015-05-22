package com.designpattern.creational.factory_method.extension.multi_factory;

import com.designpattern.creational.factory_method.Product;

public class Client {
	public static void main(String[]args) {
		ProductCreator creator1 = new Product1Creator();
		ProductCreator creator2 = new Product2Creator();
		//you can create specified object with specified product creator
		Product product1 = creator1.createProduct();
		Product product2 = creator2.createProduct();
		
		System.out.println(product1);
		System.out.println(product2);
		
	}

}
