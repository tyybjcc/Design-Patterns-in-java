package com.designpattern.behavioral.state;

public class Context {
	private State currentState;
	
	public Context(State _state) {
		this.setState(_state);
	}
	
	public void setState(State _state) {
		this.currentState = _state;
	}
	
	public void handle1() {
		this.currentState.handle1(this);
	}
	
	public void handle2() {
		this.currentState.handle2(this);
	}

}
