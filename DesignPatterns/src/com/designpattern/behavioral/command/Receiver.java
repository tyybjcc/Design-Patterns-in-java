package com.designpattern.behavioral.command;

public class Receiver {
	private int state;
	
	public Receiver(int _state) {
		this.state = _state;
	}
	
	public Receiver() {
		this(0);
	}
	
	//use Integer is OK, but int will leads error when {find method by reflection}
	public int add1(Integer first) {
		this.state += first;
		return this.getState();
	}
	
	public Object add2(Integer first, Integer second) {
		this.state += (first+second);
		return this.getState();
	}
	
	public int getState() {
		return this.state;
	}
	
	public void printState() {
		System.out.println(super.toString()+": state ->" +this.state);
	}

}
