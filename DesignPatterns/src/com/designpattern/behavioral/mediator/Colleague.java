package com.designpattern.behavioral.mediator;

public abstract class Colleague {
	protected Mediator mediator;
	private String name;
	
	public Colleague(Mediator _mediator, String _name) {
		this.mediator = _mediator;
		this.name = _name;
	}
	
	public void dealWithMessage(String msg) {
		System.out.println(this.name+" deal with message: "+msg);
	}
	
	public abstract boolean subscribe(Colleague colleague);
	public abstract boolean unsubscribe(Colleague colleague);
	public abstract void publish(String msg);

}
