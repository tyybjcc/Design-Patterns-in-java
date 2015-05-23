package com.designpattern.behavioral.null_object;

import java.util.HashMap;
import java.util.Map;


public class ObjectFactory {
	private static ObjectFactory factory;
	private Map<String,Object> objectMap;
	
	private ObjectFactory() {
		this.objectMap = new HashMap<String,Object>();
		this.objectMap.put("one", new RealObject("one"));
		this.objectMap.put("two", new RealObject("two"));
	}
	
	public static ObjectFactory getInstance() {
		if(factory == null) {
			factory = new ObjectFactory();
		}
		return factory;
	}
	
	public Object getObject(String key) {
		if( objectMap.get(key) == null ) {
			return NullObject.nullObject;
		} else {
			return objectMap.get(key);
		}
	}

}
