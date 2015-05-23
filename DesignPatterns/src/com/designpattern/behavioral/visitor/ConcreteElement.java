package com.designpattern.behavioral.visitor;

public class ConcreteElement implements Element{
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
