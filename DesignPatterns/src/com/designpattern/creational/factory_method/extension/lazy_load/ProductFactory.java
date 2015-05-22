package com.designpattern.creational.factory_method.extension.lazy_load;

import java.util.HashMap;
import java.util.Map;

import com.designpattern.creational.factory_method.Product;
import com.designpattern.creational.factory_method.Product1;
import com.designpattern.creational.factory_method.Product2;

public class ProductFactory {
	private static final Map<String, Product> productsMap = new HashMap<String,Product>();
	
	//lazy load
	//instantiate each kind of concrete product at most only once
	@SuppressWarnings("unchecked")
	public static synchronized <T extends Product> T getProduct(Class<T> c) throws Exception{
		if(! productsMap.containsKey(c.getName())){
			productsMap.put(c.getName(), c.newInstance());
			System.out.println("create product: "+productsMap.get(c.getName()));
		}else{
			System.out.println("direct get product: "+productsMap.get(c.getName()));
		}
		return (T)productsMap.get(c.getName());
	}
	
	//client test
	public static void main(String[]args) {
		try {
			ProductFactory.getProduct(Product1.class);
			ProductFactory.getProduct(Product1.class);
			ProductFactory.getProduct(Product2.class);
			ProductFactory.getProduct(Product2.class);
			ProductFactory.getProduct(Product2.class);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
