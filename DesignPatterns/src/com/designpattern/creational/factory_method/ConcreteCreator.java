package com.designpattern.creational.factory_method;

public class ConcreteCreator extends Creator{
	@Override
	public <T extends Product> T createProduct(Class<T> c){
		try{
			return c.newInstance();
		}catch(Exception e){
			return null;
		}
	}
}
