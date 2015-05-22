package com.designpattern.creational.factory_method;

public abstract class Product {
	public void method1() {
		//all Product subclass do the same thing
	}
	
	//each subclass should define their own business logic
	public abstract void method2();
}
