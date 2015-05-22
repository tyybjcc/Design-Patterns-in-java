package com.designpattern.structural.flyweight;

public class State {
	int code;
	String message;
	
	public State(int _code, String _message) {
		this.code = _code;
		this.message = _message;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
