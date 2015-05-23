package com.designpattern.behavioral.null_object;

public class RealObject implements Object{
	private String name;
	public RealObject(String _name) {
		this.name = _name;
	}
	public void request() {
		System.out.println("real object "+ this.name +" requests...");
	}

}
