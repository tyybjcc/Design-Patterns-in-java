package com.designpattern.structural.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	
	public static<T> T getProxyInstance(MyInvocationHandler<T> myhandler) {
		return DynamicProxy.getProxyInstance(myhandler.getObject(), myhandler);
	}
	
	public static <T> T getProxyInstance(T subject, InvocationHandler h) {
		return getProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), h);
	}
	
	public static <T> T getProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h) {
		//before proxy
		T proxy = (T)Proxy.newProxyInstance(loader, interfaces, h);
		//after proxy
		return proxy;
	}

}
