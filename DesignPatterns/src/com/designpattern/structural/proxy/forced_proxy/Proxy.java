package com.designpattern.structural.proxy.forced_proxy;

public class Proxy extends Subject implements ISubject{
	Proxy() {
	}
	
	@Override
	public ISubject getProxy() {
		return this;
	}
	
	@Override
	public void do1() {
		super.do1();
	}

	@Override
	public boolean isProxy() {
		return true;
	}
	

}
