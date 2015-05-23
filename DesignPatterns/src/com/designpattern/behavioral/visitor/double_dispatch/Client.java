package com.designpattern.behavioral.visitor.double_dispatch;

public class Client {
	//implements double dispatch by visitor pattern
	public static void main(String[] args) {
		A a1=new A1();
		A a2=new A2();
		B b1=new B1();
		B b2=new B2();
		
		a1.accept(b1);
		a1.accept(b2);
		a2.accept(b1);
		a2.accept(b2);
	}

}
