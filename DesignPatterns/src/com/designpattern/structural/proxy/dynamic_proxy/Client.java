package com.designpattern.structural.proxy.dynamic_proxy;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.WeakHashMap;

import sun.misc.*;
public class Client {
	
	public static void main(String[]args) {
		ISubject subject = new Subject();
		
		
		MyInvocationHandler<ISubject> myHandler = new MyInvocationHandler<ISubject>(subject);
		ISubject proxy = DynamicProxy.getProxyInstance(myHandler);
		
		System.out.println(proxy.do1());
		
		
		
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
