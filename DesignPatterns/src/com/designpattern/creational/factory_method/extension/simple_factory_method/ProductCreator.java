package com.designpattern.creational.factory_method.extension.simple_factory_method;

import com.designpattern.creational.factory_method.Product;

public class ProductCreator {
	public static <T extends Product> T createProduct(Class<T> c) {
		try {
			return c.newInstance();
		}catch(Exception e){
			return null;
		}
	}

}
