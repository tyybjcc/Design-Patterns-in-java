package com.designpattern.structural.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;



public class  MyInvocationHandler<T> implements InvocationHandler{
	private T obj;
	/*private Map<String,IAdvice> beforeAdvices;
	private Map<String,IAdvice> afterAdvices;*/
	public MyInvocationHandler(T _obj) {
		this.obj = _obj;
	}
	
	T getObject() {
		return this.obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//before action
		Object result = method.invoke(this.obj, args);
		//after action
		return result;
	}

}
