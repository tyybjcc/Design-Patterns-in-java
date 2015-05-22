package com.designpattern.structural.adapter;

public class Adapter implements Target {
	//Adaptee reference
	Adaptee adaptee;
	
	public Adapter(Adaptee _adaptee) {
		super();
		this.adaptee = _adaptee;
	}
	
	//convert message,data and protocol conversion
	@Override
	public void request() {
		this.adaptee.specificRequest();
	}

}
