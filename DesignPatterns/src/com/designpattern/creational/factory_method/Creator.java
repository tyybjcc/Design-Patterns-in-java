package com.designpattern.creational.factory_method;

public abstract class Creator {
	//using java class template to make factory method even stronger!
	public abstract <T extends Product> T createProduct(Class<T> c);
}
