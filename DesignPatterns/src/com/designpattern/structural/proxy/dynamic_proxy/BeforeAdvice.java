package com.designpattern.structural.proxy.dynamic_proxy;

public class BeforeAdvice implements IAdvice{

	@Override
	public void exec() {
		System.out.println("before advice");
	}
}
