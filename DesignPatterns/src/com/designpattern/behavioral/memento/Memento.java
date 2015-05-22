package com.designpattern.behavioral.memento;

public class Memento {
	private String state;
	
	public Memento(String _state) {
		this.setState(_state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
