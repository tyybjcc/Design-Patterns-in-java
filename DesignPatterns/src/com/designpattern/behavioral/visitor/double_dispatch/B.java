package com.designpattern.behavioral.visitor.double_dispatch;

public class B {
	public String getName() {
		return "B";
	}
	
	public void beDone(A a) {
		System.out.println( a.getName()+" do "+this.getName()+";" );
	}
}
