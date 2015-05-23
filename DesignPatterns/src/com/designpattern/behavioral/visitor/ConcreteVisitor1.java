package com.designpattern.behavioral.visitor;

public class ConcreteVisitor1 implements Visitor{
	
	@Override
	public void visit(Element element) {
		System.out.println("ConcreteVisitor1 visit element");
	}

}
