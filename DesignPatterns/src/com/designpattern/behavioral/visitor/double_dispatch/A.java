package com.designpattern.behavioral.visitor.double_dispatch;

public class A {
	public String getName() {
		return "A";
	}
	public void accept(B b) {
		b.beDone(this);
	}
	
}
