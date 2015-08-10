package com.designpattern.structural.proxy.cglib;

import java.util.Iterator;

public class App {
	
	public static void main(String[] args) {
		ISubject subject = new Subject();
		ISubject proxy = (ISubject)(new CglibProxy()).getProxyInstance(subject);
		
		Object result = proxy.do1();
		System.out.println(result);
	}

}
