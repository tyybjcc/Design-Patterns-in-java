package com.designpattern.structural.bridge;

public class ConcreteImplementor implements Implementor{
	@Override
	public void implementation() {
		System.out.println("ConcreteImplementor -> implementation()");
	}
	
}
