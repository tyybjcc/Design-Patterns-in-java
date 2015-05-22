package com.designpattern.creational.factory_method.extension.multi_factory;

import com.designpattern.creational.factory_method.Product;
import com.designpattern.creational.factory_method.Product2;

public class Product2Creator implements ProductCreator{
	public Product createProduct() {
		return new Product2();
	}
}
