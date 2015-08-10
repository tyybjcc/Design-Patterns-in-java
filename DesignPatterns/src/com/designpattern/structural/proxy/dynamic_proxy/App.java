package com.designpattern.structural.proxy.dynamic_proxy;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.WeakHashMap;

import sun.misc.*;
public class App {
	
	public static void main(String[]args) {
		ISubject subject = new Subject();
		
		
		MyInvocationHandler myHandler = new MyInvocationHandler(subject);
		
		ISubject proxy = (ISubject)Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), myHandler);

		proxy.do1();
		System.out.println();
		proxy.do2();
		
		
		
		String name = "SubjectProxy";
		//输出生成的.class文件
		byte[] data = ProxyGenerator.generateProxyClass(name, subject.getClass().getInterfaces());
		try {
			FileOutputStream fos = new FileOutputStream(name+".class");
			fos.write(data);
			fos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
