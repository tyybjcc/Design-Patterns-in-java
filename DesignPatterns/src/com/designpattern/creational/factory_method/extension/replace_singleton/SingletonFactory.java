package com.designpattern.creational.factory_method.extension.replace_singleton;

import java.lang.reflect.Constructor;

public class SingletonFactory {
	private static Singleton INSTANCE;
	static {
		try {
			Class cls = Singleton.class;
			Constructor constructor = cls.getDeclaredConstructor();
			constructor.setAccessible(true);
			INSTANCE = (Singleton)constructor.newInstance();
		} catch (Exception e) {
			//
		}
	}
	
	public static Singleton getInstance() {
		return SingletonFactory.INSTANCE;
	}

}
