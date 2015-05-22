package com.designpattern.creational.factory_method.extension.multi_factory;

import com.designpattern.creational.factory_method.Product;
import com.designpattern.creational.factory_method.Product1;

public class Product1Creator implements ProductCreator{

	@Override
	public Product createProduct() {
		return new Product1();
	}

}
