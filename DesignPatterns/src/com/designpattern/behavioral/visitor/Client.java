package com.designpattern.behavioral.visitor;

public class Client {

	public static void main(String[]args) {
		Element ele = new ConcreteElement();
		Visitor vis1 = new ConcreteVisitor1();
		Visitor vis2 = new ConcreteVisitor2();
		
		ele.accept(vis1);
		ele.accept(vis2);
	}
}
