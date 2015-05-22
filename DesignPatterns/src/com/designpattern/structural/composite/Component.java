package com.designpattern.structural.composite;

public abstract class Component{
	protected String name;
	
	protected Component(String _name) {
		this.name = _name;
	}
	
	public String getName() {
		return this.name;
	}
	public abstract void doThis();
}
