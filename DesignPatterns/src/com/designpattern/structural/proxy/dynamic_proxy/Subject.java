package com.designpattern.structural.proxy.dynamic_proxy;

public class Subject implements ISubject{
	@Override
	public void do1() {
		System.out.println("Subject do1");
	}

	@Override
	public void do2() {
		System.out.println("Subject do2");
	}
}
