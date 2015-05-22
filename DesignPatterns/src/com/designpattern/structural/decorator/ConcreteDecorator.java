package com.designpattern.structural.decorator;

public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Component _component) {
		super(_component);
	}

	@Override
	protected void enhancement() {
		System.out.println("ConcreteDecorator enhancement");
	}
	
	
	/*
	// operation() has been override in Decoraotr. You could also override it here 
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		
	}
	*/

}
