package com.designpattern.creational.factory_method;

public class ConcreteCreatorV2 extends Creator{
	
	@Override
	public <T extends Product> T createProduct(Class<T> c){
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		}catch(Exception e){
			
		}
		return (T)product;
	}

}
