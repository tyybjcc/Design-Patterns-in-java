package com.designpattern.structural.proxy;

public class Subject implements ISubject{
	@Override
	public void request() {
		System.out.println("Subject -> request()");
	}

}
