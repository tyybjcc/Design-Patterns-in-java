package com.designpattern.structural.proxy.dynamic_proxy;

public class AfterAdvice implements IAdvice {
	@Override
	public void exec() {
		System.out.println("after advice execution");
	}

}
