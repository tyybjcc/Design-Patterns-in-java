package com.designpattern.structural.proxy.forced_proxy;

public class Client {
	public static void main(String[] args) {
		ISubject subject = new Subject();
		subject.do1();
		
		ISubject proxy = subject.getProxy();
		proxy.do1();
	
	}

}
