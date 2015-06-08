package com.designpattern.structural.proxy.dynamic_proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	private Object target;
	
	public Object getProxyInstance(Object _target) {
		this.target = _target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		//beforeAdvice
		System.out.println(method.getName()+" start");
		Object result = proxy.invokeSuper(obj, args);
		//afterAdvice
		System.out.println(method.getName()+" end");
		return result;
	}

}
