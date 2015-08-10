package com.designpattern.structural.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;



public class  MyInvocationHandler implements InvocationHandler{
	private Object obj;

	public MyInvocationHandler(Object _obj) {
		this.obj = _obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//before action
		System.out.println("* before action");
		Object result = method.invoke(this.obj, args);
		System.out.println("* after action");
		//after action
		return result;
	}

}
