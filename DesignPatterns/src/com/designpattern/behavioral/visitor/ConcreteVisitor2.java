package com.designpattern.behavioral.visitor;

public class ConcreteVisitor2 implements Visitor{
	
	@Override
	public void visit(Element element) {
		System.out.println("ConcreteVisitor2 visit element");
	}

}
