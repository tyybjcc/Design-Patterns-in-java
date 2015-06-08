package com.designpattern.structural.proxy.forced_proxy;

public class Subject implements ISubject{
	@Override
	public ISubject getProxy() {
		return new Proxy();
	}
	
	@Override
	public void do1() {
		if(!isProxy()) {
			System.out.println("please use a proxy");
		} else {
			System.out.println("do1 execution...");
		}
	}
	
	public boolean isProxy() {
		return false;
	}

}
