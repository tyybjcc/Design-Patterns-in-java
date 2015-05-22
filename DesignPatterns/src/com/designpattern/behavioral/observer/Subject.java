package com.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject extends Observable{
	private String state;
	private int code = 0;

	public String getState() {
		return state;
	}
	
	//when state change, all observers will be notified
	public void setState(String state) {
		this.state = state;
		Message msg = new Message(this.code++, this.state);
		super.notifyObservers(msg);
	}
	
}
