package com.designpattern.structural.bridge;

public abstract class Abstraction {
	protected Implementor implementor;
	public Abstraction(Implementor _implementor) {
		this.implementor = _implementor;
	}
	
	public void abstraction() {
		this.implementor.implementation();
	}
}
